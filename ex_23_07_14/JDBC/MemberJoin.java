package ex_23_07_14.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberJoin {
    public static void main(String[] args) {
        if (dbSetting()){
            System.out.println("DataBase 연결에 성공하였습니다.");
        }
    }

    public static boolean dbSetting(){
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe", user ="service", password  ="Tkfkdgo12#$";
            connection = DriverManager.getConnection(url, user, password);
			pstm = connection.prepareStatement("INSERT INTO aimember SET id=?,password=?,name=?,age=?");
			pstm.setString(1, "root");
			pstm.setString(2, "sdfjasdfadf");
            pstm.setString(3, "뿌리");
			pstm.setInt(4, 98);
			pstm.execute();
            return true;          
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}