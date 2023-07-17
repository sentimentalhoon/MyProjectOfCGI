package ex_23_07_14.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberDelete {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("I D : \t");
            String id = sc.next();

            System.out.print("P W : \t");
            String pw = sc.next();
            try {
                String name = MemberTable.getInstance().isLogin(id, pw);
                if (name != null) {
                    if (MemberTable.getInstance().deleteMember(id, pw)) {
                        System.out.printf("계정 [ %s ] 이 삭제되었습니다.");
                    } else {
                        System.out.printf("계정 삭제에 실패하였습니다.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}