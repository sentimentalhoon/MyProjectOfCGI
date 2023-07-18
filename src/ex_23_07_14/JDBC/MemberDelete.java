package ex_23_07_14.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberDelete {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                DAO.setDatabaseSettings("oracle.jdbc.driver.OracleDriver",
                        "jdbc:oracle:thin:@localhost:1521:xe",
                        "service",
                        "Tkfkdgo12#$");
                DAO.getInstance();
                
                System.out.print("I D : \t");
                final String id = sc.next();

                System.out.print("P W : \t");
                final String pw = sc.next();
                Member member = MemberTable.getInstance().isLogin(id, pw);
                if (member.getIsValid()) {
                    if (MemberTable.getInstance().deleteMember(member.getId(), pw)) {
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
