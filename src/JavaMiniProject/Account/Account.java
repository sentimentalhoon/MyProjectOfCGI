package JavaMiniProject.Account;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

import JavaMiniProject.PageId;
import JavaMiniProject.DAO.DBFactory;
import JavaMiniProject.Utils.Base64;
import JavaMiniProject.Utils.SQLUtil;

public class Account {
	/** 계정명 */
	private String _name;
	/** 패스워드(암호화 됨) */
	private String _password;
	/** 최근 접속일 */
	private Timestamp _lastActive;
	/** 계정 유효 유무(True == 유효) */
	private boolean _isValid = false;
	/** 현재 상태, 페이지 번호 */
	private int _page;
	private int _subPage;
	/** 메세지 로그용 */
	private static Logger _log = Logger.getLogger(Account.class.getName());

	public Account() {
	}

	/**
	 * 유효한 계정인가
	 * 
	 * @return boolean
	 */
	public boolean isValid() {
		return _isValid;
	}

	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;;
	}
	public Timestamp getLastActive() {
		return _lastActive;
	}

	public int getPages() {
		return _page;
	}

	public void setPages(int _page) {
		this._page = _page;
	}

	public int getSubPage() {
		return _subPage;
	}

	public void setSubPage(int _subPage) {
		this._subPage = _subPage;
	}

	public boolean isExit() {
		return (this._page == PageId.EXIT);
	}
	
	/**
	 * 패스워드를 암호화한다.
	 * 
	 * @param rawPassword
	 *                    패스워드
	 * @return String
	 * @throws NoSuchAlgorithmException
	 *                                      암호화 알고리즘을 사용할 수 없을 때
	 * @throws UnsupportedEncodingException
	 *                                      인코딩이 지원되지 않을 때
	 */
	private static String encodePassword(final String rawPassword)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		byte[] buf = rawPassword.getBytes("UTF-8");
		buf = MessageDigest.getInstance("SHA-256").digest(buf);

		return Base64.encodeBytes(buf);
	}

	/**
	 * 신규 계정 생성
	 * 
	 * @param name
	 *                    계정명
	 * @param rawPassword
	 *                    패스워드
	 * @param ip
	 *                    접속자 IP주소
	 * @param host
	 *                    접속자 호스트명
	 * @return Account
	 */
	public static boolean create(final String name, final String rawPassword,
			final String ip, final String host) {
		PreparedStatement pstm = null;
		try (Connection con = DBFactory.getInstance().getConnection()) {
			if (doesCharNameExist(name)) {
				System.out.println("해당 계정명이 존재합니다.");
				return false;
			}

			if (!AccountNameFilter.getInstance().nameFilter(name)) {
				System.out.println("계정명에 불필요한 단어가 포함되어 있습니다.");
				return false;
			}

			String sqlstr = "INSERT INTO accounts SET id=?,password=password(?),lastactive=?";
			pstm = con.prepareStatement(sqlstr);
			pstm.setString(1, name);
			pstm.setString(2, rawPassword);
			pstm.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
			pstm.execute();
			_log.info("created new account for " + name);
			System.out.println("계정이 만들어졌습니다.");
			return true;
		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(pstm);
		}
		return false;
	}

	public static boolean doesCharNameExist(String name) {
		boolean result = true;
		java.sql.Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = DBFactory.getInstance().getConnection();
			pstm = con
					.prepareStatement("SELECT id FROM accounts WHERE id=?");
			pstm.setString(1, name);
			rs = pstm.executeQuery();
			result = rs.next();
		} catch (SQLException e) {
			_log.warning("could not check existing charname:" + e.getMessage());
		} finally {
			SQLUtil.close(rs);
			SQLUtil.close(pstm);
			SQLUtil.close(con);
		}
		return result;
	}

	/**
	 * DB에서 계정 정보 불러오기
	 * 
	 * @param name
	 *             계정명
	 * @return Account
	 */

	public static Account load(final Account account, final String name) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			con = DBFactory.getInstance().getConnection();
			String sqlstr = "SELECT * FROM accounts WHERE id=? LIMIT 1";
			pstm = con.prepareStatement(sqlstr);
			pstm.setString(1, name);
			rs = pstm.executeQuery();
			if (!rs.next()) {
				return account;
			}
			account._name = rs.getString("id");
			account._password = rs.getString("password");
			account._lastActive = rs.getTimestamp("lastactive");
			_log.fine("account exists");
		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs);
			SQLUtil.close(pstm);
			SQLUtil.close(con);
		}

		return account;
	}

	/**
	 * DB에 최근 접속일 업데이트
	 * 
	 * @param account
	 *                계정명
	 */
	public static void updateLastActive(final Account account) {
		Connection con = null;
		PreparedStatement pstm = null;
		Timestamp ts = new Timestamp(System.currentTimeMillis());

		try {
			con = DBFactory.getInstance().getConnection();
			String sqlstr = "UPDATE accounts SET lastactive=? WHERE id = ?";
			pstm = con.prepareStatement(sqlstr);
			pstm.setTimestamp(1, ts);
			pstm.setString(2, account.getName());
			pstm.execute();
			account._lastActive = ts;
			_log.fine("update lastactive for " + account.getName());
		} catch (Exception e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(pstm);
			SQLUtil.close(con);
		}
	}

	/**
	 * 입력된 비밀번호와 DB에 저장된 패스워드를 비교
	 * 
	 * @param rawPassword
	 *                    패스워드
	 * @return boolean
	 */
	public boolean validatePassword(String accountName, final String rawPassword) {
		// 인증 성공 후에 재차 인증되었을 경우는 실패시킨다.
		// if (_isValid) {
		// return false;
		// }
		try {
			_isValid = (_password.equals(encodePassword(rawPassword)) || checkPassword(
					accountName, _password, rawPassword));
			if (_isValid) {
				_password = null; // 인증이 성공했을 경우, 패스워드를 파기한다.
			}
			return _isValid;
		} catch (Exception e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
		return false;
	}


	// 웹 연동을 위한 메소드 추가
	public static boolean checkPassword(String accountName, String _pwd,
			String rawPassword) {
		String _inputPwd = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = DBFactory.getInstance().getConnection();
			pstm = con.prepareStatement("SELECT password(?) as pwd ");

			pstm.setString(1, rawPassword);
			rs = pstm.executeQuery();
			if (rs.next()) {
				_inputPwd = rs.getString("pwd");
			}
			if (_pwd.equals(_inputPwd)) { // 동일하다면
				return true;
			} else
				return false;
		} catch (Exception e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs);
			SQLUtil.close(pstm);
			SQLUtil.close(con);
		}
		return false;
	}
}
