package ex_23_07_14.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberLogin {
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
                Member member = MemberTable.getInstance().isLogin(id, pw);
                if (member.getIsValid()) {
                    System.out.printf("%s [%d] 님 어서 오십시오.", member.getName(), member.getAge());
                } else {
                    System.out.println("로그인에 실패하였습니다.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
