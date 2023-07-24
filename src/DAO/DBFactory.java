/**
 * HikariCP를 이용해 connection pool 을 설정하였다.
 * config는 properties 에서 읽어온다.
 * getConnection() 을 통해 pool 을 읽어온다.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBFactory {
    private static DBFactory _instance = null;
    /** 메세지 로그용. */
    private static Logger _log = Logger.getLogger(DBFactory.class.getName());

    private HikariDataSource hikariDataSource;
    private static HikariConfig config = new HikariConfig("config\\hikari.properties");

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

    private DBFactory() throws SQLException {
        try {
            hikariDataSource = new HikariDataSource(config);
            hikariDataSource.getConnection().close();// 데이터베이스 연결
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
     * @return Connection connection 오브젝트
     * @throws SQLException
     */
    public Connection getConnection() {
        Connection connection = null;

        while (connection == null) {
            try {
                connection = hikariDataSource.getConnection();
            } catch (SQLException e) {
                _log.warning("L1DatabaseFactory: getConnection() failed, trying again " + e);
            }
        }
        return connection;
    }
}
