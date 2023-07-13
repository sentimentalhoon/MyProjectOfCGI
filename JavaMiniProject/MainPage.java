package JavaMiniProject;

import java_ex_music_player.ConsoleColor;

public class MainPage {

    private static MainPage _instance = null;

    public static MainPage getInstance() {
        if (_instance == null) {
            _instance = new MainPage();
        }
        return _instance;
    }

    public MainPage() {
    }

    public String getPages(int page) {
        StringBuilder strB = new StringBuilder();
        switch (page) {
            case PageId.LOGIN:
                strB.append("[1] 로그인");
                strB.append(ConsoleColor.BLACK_BACKGROUND_BRIGHT);
                strB.append("\t");
                strB.append("[2] 회원가입");
                strB.append(ConsoleColor.RESET);
                strB.append("\t");
                strB.append("[3] 랭킹");
                strB.append("\t");
                strB.append("[4] 관리자");
                strB.append("\t");
                strB.append("[5] 종료");
                strB.append(ConsoleColor.RESET);
                return strB.toString();
            case PageId.CREATEACCOUNT:
                strB.append("[1] 로그인");
                strB.append(ConsoleColor.BLACK_BACKGROUND_BRIGHT);
                strB.append("\t");
                strB.append("[2] 회원가입");
                strB.append(ConsoleColor.RESET);
                strB.append("\t");
                strB.append("[3] 랭킹");
                strB.append("\t");
                strB.append("[4] 관리자");
                strB.append("\t");
                strB.append("[5] 종료");
                strB.append(ConsoleColor.RESET);
                return strB.toString();
            case PageId.RANKING:
                strB.append("[1] 로그인");
                strB.append(ConsoleColor.BLACK_BACKGROUND_BRIGHT);
                strB.append("\t");
                strB.append("[2] 회원가입");
                strB.append(ConsoleColor.RESET);
                strB.append("\t");
                strB.append("[3] 랭킹");
                strB.append("\t");
                strB.append("[4] 관리자");
                strB.append("\t");
                strB.append("[5] 종료");
                strB.append(ConsoleColor.RESET);
                return strB.toString();
            case PageId.ADMIN:
                strB.append("[1] 로그인");
                strB.append(ConsoleColor.BLACK_BACKGROUND_BRIGHT);
                strB.append("\t");
                strB.append("[2] 회원가입");
                strB.append(ConsoleColor.RESET);
                strB.append("\t");
                strB.append("[3] 랭킹");
                strB.append("\t");
                strB.append("[4] 관리자");
                strB.append("\t");
                strB.append("[5] 종료");
                strB.append(ConsoleColor.RESET);
                return strB.toString();
            case PageId.EXIT:
                strB.append("[1] 로그인");
                strB.append(ConsoleColor.BLACK_BACKGROUND_BRIGHT);
                strB.append("\t");
                strB.append("[2] 회원가입");
                strB.append(ConsoleColor.RESET);
                strB.append("\t");
                strB.append("[3] 랭킹");
                strB.append("\t");
                strB.append("[4] 관리자");
                strB.append("\t");
                strB.append("[5] 종료");
                strB.append(ConsoleColor.RESET);
                return strB.toString();
            default:
                strB.append("[1] 로그인");
                strB.append("\t");
                strB.append("[2] 회원가입");
                strB.append("\t");
                strB.append("[3] 랭킹");
                strB.append("\t");
                strB.append("[4] 관리자");
                strB.append("\t");
                strB.append("[5] 종료");
                return strB.toString();
        }
    }
}