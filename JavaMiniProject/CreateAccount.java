package JavaMiniProject;

import JavaMiniProject.Account.Account;
import JavaMiniProject.Utils.InputScanner;

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
        System.out.print("계정명 : ");
        String name = InputScanner.getInstance().getScanner().nextLine();
        System.out.print("비밀번호 : ");
        String password = InputScanner.getInstance().getScanner().nextLine();
        return Account.create(name, password, "127.0.0.1", "127.0.0.1");
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
