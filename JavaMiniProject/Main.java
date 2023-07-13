package JavaMiniProject;

import JavaMiniProject.Account.Account;
import JavaMiniProject.Utils.ConsoleColor;
import JavaMiniProject.Utils.InputScanner;

public class Main {

    public static void main(String[] args) {
        Server.createServer().start();
        Account account = new Account();

        int userPage = 0;

        while (true) {
            System.out.println(MainPage.getInstance().getPages(userPage == 0 ? 0 : account.getPages()));
            if (account != null) {
                userPage = InputScanner.getInstance().getScanner().nextInt();
                account.setPages(userPage);
                if (account.isExit()) {
                    System.out.println(ConsoleColor.BLACK_BACKGROUND_BRIGHT + "종료 되었습니다."
                            + ConsoleColor.RESET);
                    break;
                }
                setPage(account, account.getPages());
            } else {
                System.out.println(ConsoleColor.BLACK_BACKGROUND_BRIGHT + "로그인이 필요합니다.\n"
                        + "만약 회원 가입을 하지 않았다면 먼저 회원 가입을 하여 주시기 바랍니다."
                        + ConsoleColor.RESET);
                userPage = InputScanner.getInstance().getScanner().nextInt();
                setPage(account, userPage);
            }            
        }
    }

    private static void setPage(Account account, int page) {
        switch (page) {
            case PageId.LOGIN:
                account = Login.getInstance().isLogin();
                break;
            case PageId.CREATEACCOUNT:
                if (!CreateAccount.getInstance().create()){
                    System.out.println("계정 생성에 실패하였습니다.");
                }
                break;
            case PageId.RANKING:
                break;
            case PageId.ADMIN:
                break;
            case PageId.EXIT:
                break;
            default:
                break;
        }
    }
}
