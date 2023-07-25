/**
 * while 을 통해 exit 할 때까지 명령어를 입력받아 처리한다.
 * first, second, third 값을 문자로 입력받으면 char 방식으로 처리한다.
 * 
 * 구조를 더 단순하게 하고 싶으나 귀찮아서 아래와 같이 한다.
 * 
 */
package Main;

import java.util.ArrayList;

import Account.Account;
import Board.BoardId;
import Game.GameId;
import Game.BH.MatchTheSong.MatchTheSong;
import Game.BH.Tetris.D4mnAsciiTetris;
import Game.Dain.CinemaQuizMain;
import Game.giwon.BlackjackMain;
import Game.hero.fuckara.fuckMain;
import Game.miniproject_mom.MomMain;
import Pages.PageId;
import Utils.ConsoleColor;
import Utils.Print;
import Utils.SC;
import javazoom.jl.player.MP3Player;

public class Start {
    public static void indexPageStart(Account account) {
        char userPage = 0;
        int third = 0;
        while (true) {
            try {
                System.out.print(
                        MainPage.getInstance().getPage(account.getPages(), account.getSubPage(), third));
                third = 0;
                if (account.getPages() == PageId.NOTHING || account.getPages() == PageId.LOGIN) {
                    String accountName = "";
                    try {
                        accountName = SC.getScanner().nextLine().trim().toLowerCase();
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
                        // account = PageHandler.handlePage(account, PageId.LOGIN, accountName);
                        account.set_totalpoint(1000);
                        account.setValid(true);
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
                        String[] input = SC.getScanner().nextLine().toLowerCase().split(" ");
                        userPage = input[0].toCharArray()[0];
                        if (input.length > 1)
                            third = Integer.parseInt(input[1]);
                    } catch (Exception e) {
                        System.err.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "없는 명령어입니다!"
                                + ConsoleColor.RESET);
                        continue;
                    }
                    if (userPage == PageId.MAIN || userPage == PageId.TOPPAGE) {
                        account.setPages(userPage);
                    } else if (userPage == PageId.BOARD) {
                        account.setSubPage(BoardId.BOARDLIST);
                        account.setPages(userPage);
                    } else {
                        if (account.getPages() == PageId.BOARD) {
                            account.setSubPage(userPage);
                        } else if (account.getPages() == PageId.GAME) {
                            account.setSubPage(userPage);
                            if (account.getSubPage() == GameId.BLACKJACK) {
                                BlackjackMain.BlackGameStart(account);
                            } else if (account.getSubPage() == GameId.BACCARAT) {
                                fuckMain.FuckarratGameStart(account);
                            } else if (account.getSubPage() == GameId.CINEMAQUIZ) {
                                CinemaQuizMain.getInstance().isGameStart(account);
                            } else if (account.getSubPage() == GameId.TETRIS) {
                                D4mnAsciiTetris.gameStart();
                            } else if (account.getSubPage() == GameId.MOMSTOUCH) {
                                MomMain.getInstance().isStart(account);
                            } else if (account.getSubPage() == GameId.MATCHTHESONG) {
                                MatchTheSong.getInstance().gameStart(account);
                            }
                        } else {
                            account.setSubPage(BoardId.BOARDNOTHING);
                            account.setPages(userPage);
                        }
                    }

                    if (account.isExit()) {

                        System.err.println(ConsoleColor.BLACK_BACKGROUND_BRIGHT + "종료 되었습니다."
                                + ConsoleColor.RESET);

                        endingCredit();
                        break;
                    }
                    account = PageHandler.handlePage(account, account.getPages(), null);
                }
            } catch (Exception e) {
                account = new Account();
                account.setPages(PageId.LOGIN);
                account.setSubPage(BoardId.BOARDNOTHING);
                System.err.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "오류가 발생하여 로그아웃 되었습니다. 다시 로그인하여 주시기 바랍니다."
                        + ConsoleColor.RESET);
                e.printStackTrace();
                continue;
            }
        }
    }

    private static void endingCredit() {
        MP3Player mp3Player = new MP3Player();
        mp3Player.play("data\\audiobook\\etc\\cut_dear_name_iu.mp3");
        String str = " , , , , , , , , , , , ,"
                + "    ████████ ██   ██  █████  ███    ██ ██   ██ ███████     ████████  ██████                           ,"
                + "       ██    ██   ██ ██   ██ ████   ██ ██  ██  ██             ██    ██    ██                          ,"
                + "       ██    ███████ ███████ ██ ██  ██ █████   ███████        ██    ██    ██                          ,"
                + "       ██    ██   ██ ██   ██ ██  ██ ██ ██  ██       ██        ██    ██    ██                          ,"
                + "       ██    ██   ██ ██   ██ ██   ████ ██   ██ ███████        ██     ██████      ██     ██     ██     ,"
                + "    ,    ,"
                + "    장지웅                    이주섭                    윤근영                    장성문,"
                + "    ,    ,"
                + "    문진환                    장건욱                    홍지수                    유선웅,"
                + "    ,    ,"
                + "    박찬홍                    권용현                    황인우                    남현웅,"
                + "    ,    ,"
                + "    이나행                    서준희                    정나래                    이강련,"
                + "    ,    ,"
                + "    홍수양                    정현석                    조문규                    한준희,"
                + "    ,    ,"
                + "                 █████  ███    ██ ██████                손지영 선생님,"
                + "                ██   ██ ████   ██ ██   ██               ,"
                + "                ███████ ██ ██  ██ ██   ██               ****** 선생님,"
                + "                ██   ██ ██  ██ ██ ██   ██               ,"
                + "                ██   ██ ██   ████ ██████                김민수 선생님,"
                + "    ,    ,    ,    ,"
                + "                            ███╗   ███╗██╗   ██╗    ████████╗███████╗ █████╗ ███╗   ███╗,"
                + "                            ████╗ ████║╚██╗ ██╔╝    ╚══██╔══╝██╔════╝██╔══██╗████╗ ████║,"
                + "                            ██╔████╔██║ ╚████╔╝        ██║   █████╗  ███████║██╔████╔██║,"
                + "                            ██║╚██╔╝██║  ╚██╔╝         ██║   ██╔══╝  ██╔══██║██║╚██╔╝██║,"
                + "                     ▄█╗    ██║ ╚═╝ ██║   ██║          ██║   ███████╗██║  ██║██║ ╚═╝ ██║,"
                + "                     ╚═╝    ╚═╝     ╚═╝   ╚═╝          ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝,"
                + ".,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,";
        ArrayList<String> arrayString = new ArrayList<String>();

        for (String s : str.split(",")) {
            arrayString.add(s);
        }

        for (String s : arrayString) {
            Print.println(s);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}