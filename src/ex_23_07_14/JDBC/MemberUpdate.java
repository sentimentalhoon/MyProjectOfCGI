package ex_23_07_14.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberUpdate {
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
                    System.out.printf("%s [%d] 님 어서 오십시오.\n", member.getName(), member.getAge());

                    System.out.println("변경할 이름과 나이를 입력하여 주시기 바랍니다.");

                    System.out.print("N A M E : \t");
                    String name = sc.next();

                    System.out.print("A G E : \t");
                    int age = sc.nextInt();

                    if (MemberTable.getInstance().updateData(id, pw, name, age)) {
                        System.out.println("입력하신 정보로 변경 완료되었습니다.");
                        System.out.printf("[ID] : %s | [NAME] : %s | [AGE] : %d", id, name, age);
                    } else {
                        System.out.println("입력하신 정보로 변경 실패하였습니다.");
                    }
                } else {
                    System.out.println("로그인에 실패하였습니다.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}