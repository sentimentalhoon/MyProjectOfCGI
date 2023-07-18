package Main;

import Account.Account;
import Account.AccountController;
import Utils.InputScanner;

public class Login {
    private static Login _instance = null;

    public static Login getInstance() {
        if (_instance == null) {
            _instance = new Login();
        }
        return _instance;
    }

    public Login() {
    }

    public Account isLogin(Account account, String id) {
        account = Account.load(account, id);
        if (account.getName() != null) {
            System.out.print("P W :\t");
            String pw = InputScanner.getInstance().getScanner().nextLine();
            if (account.validatePassword(account.getName(), pw)) {
                AccountController.getInstance().login(account);
                Account.updateLastActive(account);
                System.out.printf("[ %s ] 로그인에 성공하였습니다.", id);
            } else {
                System.err.println("PASSWORD 가 틀렸습니다. 확인 후 다시 로그인 부탁드립니다.");
            }
        } else {
            System.err.println("존재하지 않는 ID 입니다. 확인 후 다시 로그인 부탁드립니다.");
        }
        return account;
    }

    @Override
    public String toString() {
        return null;
    }
}
