/**
 * login 을 처리한다.
 * Account.load 로 보내 id 가 존재하는지 확인한 후
 * 존재한다면 pw를 받아 db 에 저장된 pw 와 비교 후
 * 같다면 로그인 성공
 */
package Main;

import Account.Account;
import Account.AccountController;
import Utils.SC;

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

    /**
     * id가 존재하는지 확인
     * pw가 맞는지 확인
     * return 해준다.
     * 
     * @param account
     * @param id
     * @return
     */
    public Account isLogin(Account account, String id) {
        account = Account.load(account, id);
        if (account.getName() != null) {
            System.out.print("P W :\t");
            String pw = SC.getScanner().nextLine();
            if (account.validatePassword(account.getName(), pw)) {
                AccountController.getInstance().login(account);
                Account.updateLastActive(account);
                System.out.printf("[ %s ] 로그인에 성공하였습니다.", id);
            } else {
                account.setName(null);
                System.err.println("PASSWORD 가 틀렸습니다. 확인 후 다시 로그인 부탁드립니다.");
            }
        } else {
            System.err.println("존재하지 않는 ID 입니다. 확인 후 다시 로그인 부탁드립니다.");
        }
        return account;
    }

    @Override
    public String toString() {
        return "Login []";
    }
}
