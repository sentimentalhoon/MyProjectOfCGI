package JavaMiniProject;

import JavaMiniProject.Account.Account;
import JavaMiniProject.Account.AccountController;
import JavaMiniProject.Utils.InputScanner;
import java_ex_music_player.ConsoleColor;

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

    public Account isLogin() {
        System.out.print("ID 를 입력하여 주시기 바랍니다 : ");
        String id = InputScanner.getInstance().getScanner().nextLine();
        Account account = Account.load(id);
        if (account != null) {
            System.out.print("PASSWORD 를 입력하여 주시기 바랍니다 : ");
            String pw = InputScanner.getInstance().getScanner().nextLine();
            if (account.validatePassword(id, pw)) {
                AccountController.getInstance().login(account);
                Account.updateLastActive(account); // 최종 로그인일을 갱신한다
                return account;
            } else {
                account = null;
                System.out.print("PASSWORD 가 틀렸습니다. 확인 후 재입력 부탁드립니다.");
            }
        } else {
            account = null;
            System.out.print("존재하지 않는 ID 입니다. 확인 후 재입력 부탁드립니다.");
        }
        return account;
    }

    @Override
    public String toString() {
        return null;
    }
}
