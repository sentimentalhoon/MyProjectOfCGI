package Account;

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

import DAO.DBFactory;
import Pages.PageId;
import Utils.Base64;
import Utils.SQLUtil;

/*
*목적 : 추가
*개정이력 : 박기원, 2023.07.24, 
*최신 수정한 것 : 
*1) _totalpoint 값 추가 (get,set)
*/

public class Account {
	/** 배팅금액 */
	private int _totalpoint;
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
	/** 서브 페이지 번호 */
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
	public void setValid(Boolean b){
		_isValid = b;
	}
	public int get_totalpoint() {
		return _totalpoint;
	}

	public void set_totalpoint(int _totalpoint) {
		this._totalpoint = _totalpoint;
	}

	/**
	 * 계정의 이름을 구해온다.
	 * 
	 * @return _name 값을 돌려준다.
	 */
	public String getName() {
		return _name;
	}

	/**
	 * 계정의 이름을 설정한다.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this._name = name;
		;
	}
	

	/**
	 * 마지막 접속시간을 구해온다.
	 * 
	 * @return _lastActive
	 */
	public Timestamp getLastActive() {
		return _lastActive;
	}

	/**
	 * 현재 접속한 페이지를 구해온다.
	 * 
	 * @return _page
	 */
	public int getPages() {
		return _page;
	}

	/**
	 * 페이지를 설정한다.
	 * 
	 * @param _page
	 */
	public void setPages(int _page) {
		this._page = _page;
	}

	/**
	 * 서브페이지를 구해온다.
	 * 
	 * @return _subpage
	 */
	public int getSubPage() {
		return _subPage;
	}

	/**
	 * 서브 페이지를 설정한다.
	 * 
	 * @param _subPage
	 */
	public void setSubPage(int _subPage) {
		this._subPage = _subPage;
	}

	/**
	 * 종료 페이지인지 확인한다.
	 * 
	 * @return
	 */
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

			String sqlstr = "INSERT INTO accounts (id, password, lastactive) VALUES (?, ?, ?)";
			pstm = con.prepareStatement(sqlstr);
			pstm.setString(1, name);
			try {
				pstm.setString(2, encodePassword(rawPassword));
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			pstm.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
			pstm.executeUpdate();
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

	/**
	 * name 을 값을 받아 이미 존재하는 name 인지 확인한다.
	 * 있으면 true 을, 없으면 false 값을 반환한다.
	 * 
	 * @param name
	 * @return
	 */
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
			SQLUtil.close(rs, pstm, con);
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
			String sqlstr = "SELECT * FROM accounts WHERE id=?";
			pstm = con.prepareStatement(sqlstr);
			pstm.setString(1, name);
			rs = pstm.executeQuery();
			if (!rs.next()) {
				return account;
			}
			account._name = rs.getString("id");
			account._password = rs.getString("password");
			account._lastActive = rs.getTimestamp("lastactive");
			account._totalpoint = rs.getInt("totalpoint");
			
			_log.fine("account exists");
		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs, pstm, con);
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
			SQLUtil.close(pstm, con);
		}
	}
	
	public static void updateTotalPoint(final Account account) {
		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DBFactory.getInstance().getConnection();
			String sqlstr = "UPDATE accounts SET TOTALPOINT=? WHERE id = ?";
			pstm = con.prepareStatement(sqlstr);
			pstm.setInt(1,account.get_totalpoint());
			pstm.setString(2, account.getName());
			pstm.execute();
		} catch (Exception e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(pstm, con);
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
			_isValid = (_password.equals(encodePassword(rawPassword)));
			if (_isValid) {
				_password = null;
			}
			return _isValid;
		} catch (Exception e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
		return false;
	}
}
