package JavaMiniProject.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBFactory {
    private static DBFactory _instance = null;
    private Connection _connection;

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
            // 1. JDBC 드라이버 로딩
            Class.forName(_driver);
            // 2. Connection 생성
            _connection = DriverManager.getConnection(_url, _user, _password); // 데이터베이스 연결
            System.out.println("[Database 연결 성공]");
        } catch (SQLException e) {
            System.out.println("[SQL Error : " + e.getMessage() + "]");
        } catch (ClassNotFoundException e1) {
            System.out.println("[JDBC Connector Driver Error : " + e1.getMessage() + "]");
        } finally {
            // Connection 사용 후 Close
            if (_connection != null) {
                try {
                    _connection.close();
                } catch (Exception e) {

                }
            }
        }
    }

    /**
     * DB접속을 해, connection 오브젝트를 돌려준다.
     * 
     * @return Connection connection 오브젝트
     * @throws SQLException
     */
    public Connection getConnection() {
        return _connection;
    }
}
