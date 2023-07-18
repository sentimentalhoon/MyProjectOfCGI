package JavaMiniProject;



import JavaMiniProject.Account.Account;
import JavaMiniProject.Board.BoardId;
import JavaMiniProject.Utils.ConsoleColor;
import JavaMiniProject.Utils.InputScanner;

public class Main {

    public static void main(String[] args) {
        Server.createServer().start();
        Account account = new Account();

        char userPage = 0;
        int third = 0;
        while (true) {
            System.out.print(
                    MainPage.getInstance().getPage(account.getPages(), account.getSubPage(), third));
            third = 0;
            if (account.getPages() == PageId.NOTHING || account.getPages() == PageId.LOGIN) {
                String accountName = "";
                try {
                    accountName = InputScanner.getInstance().getScanner().nextLine().trim().toLowerCase();
                } catch (Exception e) {
                    System.err.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "잘못된 인자를 입력하였습니다."
                            + ConsoleColor.RESET);
                    continue;
                }

                if (accountName.equals("손님") || accountName.equals("guest")) {
                    account.setName(accountName);
                    account.setPages(PageId.CREATEACCOUNT);
                    PageHandler.handlePage(account, PageId.CREATEACCOUNT, account.getName());
                    account.setPages(PageId.LOGIN);
                } else {
                    account = PageHandler.handlePage(account, PageId.LOGIN, accountName);
                    if (account.isValid())
                        account.setPages(PageId.MAIN);
                }
            } else {
                if (!account.isValid()) {
                    account.setPages(PageId.LOGIN);
                    account.setSubPage(BoardId.BOARDNOTHING);
                    continue;
                }
                try {
                    String[] input = InputScanner.getInstance().getScanner().nextLine().toLowerCase().split(" ");
                    userPage = input[0].toCharArray()[0];
                    if (input.length > 1) third = Integer.parseInt(input[1]);
                } catch (Exception e) {
                    System.err.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "없는 명령어입니다!"
                            + ConsoleColor.RESET);
                    continue;
                }
                if (account.getPages() == PageId.BOARD) {
                    account.setSubPage(userPage);
                } else {
                    if (userPage == PageId.BOARD) {
                        account.setSubPage(BoardId.BOARDLIST);
                    } else {
                        account.setSubPage(BoardId.BOARDNOTHING);
                    }
                    account.setPages(userPage);
                }
                if (account.isExit()) {
                    System.err.println(ConsoleColor.BLACK_BACKGROUND_BRIGHT + "종료 되었습니다."
                            + ConsoleColor.RESET);
                    break;
                }
                account = PageHandler.handlePage(account, account.getPages(), null);
            }
        }
    }
}