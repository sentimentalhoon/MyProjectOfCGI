package ex_23_07_14.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberJoin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                DAO.setDatabaseSettings("oracle.jdbc.driver.OracleDriver",
                        "jdbc:oracle:thin:@localhost:1521:xe",
                        "service",
                        "Tkfkdgo12#$");
                DAO.getInstance();
                System.out.print("I D : \t");
                String id = sc.next();

                System.out.print("P W : \t");
                String pw = sc.next();

                System.out.print("N A M E : \t");
                String name = sc.next();

                System.out.print("A G E : \t");
                int age = sc.nextInt();
                if (MemberTable.getInstance().insertData(id, pw, name, age)) {
                    System.out.println("DataBase 연결에 성공하였습니다.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}