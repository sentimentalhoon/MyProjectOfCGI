package ex_23_07_14.JDBC;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberList {
    public static void main(String[] args) {
        try {
            DAO.setDatabaseSettings("oracle.jdbc.driver.OracleDriver",
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "service",
                    "Tkfkdgo12#$");
            DAO.getInstance();
            ArrayList<Member> arrayMemberList = MemberTable.getInstance().getMemberList();

            for (Member member : arrayMemberList) {
                System.out.printf("[아이디] : %-20.10s [이름] : %-20.10s [나이] : %-2d\n", member.getId(), member.getName(),
                        member.getAge());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}