package JavaMiniProject.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBFactory {
    private static DBFactory _instance = null;
	/** 메세지 로그용.  */
	private static Logger _log = Logger.getLogger(DBFactory.class.getName());
	/** DB접속 정보를 집계한 것?  */
	private ComboPooledDataSource _source;
    /* DB 액세스에 필요한 정보들 */
    /** DB접속 드라이버. */
    private static String _driver;
    /** DB서버의 URL. */
    private static String _url;
    /** DB서버에 접속하는 유저명. */
    private static String _user;
    /** DB서버에 접속하는 패스워드. */
    private static String _password;

    /**
     * @return L1DatabaseFactory
     * @throws SQLException
     */
    public static DBFactory getInstance() throws SQLException {
        if (_instance == null) {
            synchronized (DBFactory.class) {
                if (_instance == null) {
                    _instance = new DBFactory();
                }
            }
        }

        return _instance;
    }

    /**
     * DB에의 액세스에 필요한 정보 설정
     * 
     * @param driver
     *                 DB접속 드라이버
     * @param url
     *                 DB서버 URL
     * @param user
     *                 DB서버에 접속하는 유저명
     * @param password
     *                 DB서버에 접속하는 패스워드
     */
    public static void setDatabaseSettings(final String driver,
            final String url, final String user, final String password) {
        _driver = driver;
        _url = url;
        _user = user;
        _password = password;
    }

    private DBFactory() throws SQLException {
        try {
			_source = new ComboPooledDataSource();
			_source.setDriverClass(_driver);
			_source.setJdbcUrl(_url);
			_source.setUser(_user);
			_source.setPassword(_password);

            _source.getConnection().close();// 데이터베이스 연결
            System.out.println("[Database 연결 성공]");
        } catch (SQLException e) {
            System.out.println("[SQL Error : " + e.getMessage() + "]");
        } catch (Exception e) {
			_log.fine("Database Connection FAILED");
			throw new SQLException("could not init DB connection:" + e);
        }
    }

    /**
     * DB접속을 해, connection 오브젝트를 돌려준다.
     * 
     * @return Connection connection 오브젝트
     * @throws SQLException
     */
    public Connection getConnection() {
		Connection con = null;

		while (con == null) {
			try {
				con = _source.getConnection();
			} catch (SQLException e) {
				_log.warning("L1DatabaseFactory: getConnection() failed, trying again " + e);
			}
		}
		return con;
    }
}
