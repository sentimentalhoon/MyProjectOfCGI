/**
 * 페이지마다 수행할 기능을 설정하는 페이지이다.
 * 계정 생성과 로그인 기능을 먼저 연결해두었다.
 */
package Main;

import Account.Account;
import Pages.PageId;

public class PageHandler {
    public PageHandler(Account account) {
        _account = account;
    }

    public static Account handlePage(Account account, int page, String id) {
        switch (page) {
            case PageId.LOGIN:
                return Login.getInstance().isLogin(account, id);
            case PageId.CREATEACCOUNT:
                if (!CreateAccount.getInstance().create()) {
                    System.out.println("계정 생성에 실패하였습니다.");
                }
                return account;
            case PageId.MAIN:
                return account;
            case PageId.RANKING:
                return account;
            case PageId.BOARD:
                return account;
            case PageId.ADMIN:
                return account;
            case PageId.EXIT:
                return account;
            default:
                return account;
        }
    }

    private final Account _account;
}
