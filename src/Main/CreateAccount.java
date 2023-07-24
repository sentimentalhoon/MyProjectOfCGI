/**
 * 계정 생성을 담당하는 부분.
 * 
 * Account.create 로 보내 처리한다.
 */
package Main;

import Account.Account;
import Utils.SC;

public class CreateAccount {
    private static CreateAccount _instance = null;

    public static CreateAccount getInstance() {
        if (_instance == null) {
            _instance = new CreateAccount();
        }
        return _instance;
    }

    public CreateAccount() {
    }

    /**
     * create 를 통해 메세지를 출력하고
     * id, pw 를 받아
     * Account.create 로 보내 처리한다.
     * 
     * @return
     */
    public boolean create() {
        System.out.println(
                "\n+-------------------------------------------------------------------------------------------------------------------+");
        System.out.println("\t게스트 계정으로 로그인 하셨습니다. 회원 가입을 진행합니다.");
        System.out.println(
                "+-------------------------------------------------------------------------------------------------------------------+\n");
        System.out.print("I D :\t");
        String name = SC.getScanner().nextLine();
        System.out.print("P W :\t");
        String password = SC.getScanner().nextLine();
        return Account.create(name, password, "127.0.0.1", "127.0.0.1");
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
