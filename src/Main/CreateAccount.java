package Main;

import Account.Account;
import Utils.InputScanner;

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

    public boolean create() {
        System.out.println("\n=====================================================================================================================");
        System.out.println("\t\t게스트 계정으로 로그인 하셨습니다. 회원 가입을 진행합니다.");
        System.out.println("=====================================================================================================================\n");
        System.out.print("I D :\t");
        String name = InputScanner.getInstance().getScanner().nextLine();
        System.out.print("P W :\t");
        String password = InputScanner.getInstance().getScanner().nextLine();
        return Account.create(name, password, "127.0.0.1", "127.0.0.1");
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
