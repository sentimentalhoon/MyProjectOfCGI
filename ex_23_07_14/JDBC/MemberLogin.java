package ex_23_07_14.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberLogin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("I D : \t");
            String id = sc.next();

            System.out.print("P W : \t");
            String pw = sc.next();
            try {
                String name = MemberTable.getInstance().isLogin(id, pw);
                if (name != null) {
                    System.out.printf("[ %s ] 님 어서 오십시오.", name);
                } else {
                    System.out.println("로그인에 실패하였습니다.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
