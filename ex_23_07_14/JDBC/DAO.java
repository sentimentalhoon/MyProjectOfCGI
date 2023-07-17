package ex_23_07_14.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private static DAO _instance = null;

    public static DAO getInstance() throws SQLException {
        if (_instance == null) {
            synchronized (DAO.class) {
                if (_instance == null) {
                    _instance = new DAO();
                }
            }
        }
        return _instance;
    }


    /**
     * DB접속을 해, connection 오브젝트를 돌려준다.
     * 
     * @return Connection connection 오브젝트
     * @throws SQLException
     */
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe", user = "service", password = "Tkfkdgo12#$";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
