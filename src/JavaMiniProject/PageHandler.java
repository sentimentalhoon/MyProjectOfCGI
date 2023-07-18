package JavaMiniProject;



import JavaMiniProject.Account.Account;

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
