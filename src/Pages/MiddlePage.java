package Pages;

import java.util.LinkedHashMap;
import java.util.Map;

import Board.Board;
import Board.BoardDao;
import Board.BoardId;
import Game.GameId;

public class MiddlePage {
    private static MiddlePage _instance = null;

    public static MiddlePage getInstance() {
        if (_instance == null) {
            _instance = new MiddlePage();
        }
        return _instance;
    }

    public MiddlePage() {
    }

    /**
     * Middle(Main) Page 는 18라인을 사용하게 설정한다.
     * 페이지마다 다른 선택지를 출력하게 한다.
     * 
     * @param page
     * @return
     */
    public String getPages(int page, int secondPage, int third) {
        StringBuilder strB = new StringBuilder();
        strB.append(
                "\n=====================================================================================================================\n");
        switch (page) {
            case PageId.LOGIN:
                strB.append("\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t세상의 모든 호구에 바칩니다.\n")
                        .append("\t누가 호구인지 모르겠으면 바로 너야...\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("");
                return strB.toString();
            case PageId.CREATEACCOUNT:
                return strB.toString();
            case PageId.TOPPAGE:
            case PageId.MAIN:
                strB.append("\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t##     ##    ###    #### ##    ##    ########     ###     ######   ######## \n")
                        .append("\t###   ###   ## ##    ##  ###   ##    ##     ##   ## ##   ##    ##  ##       \n")
                        .append("\t#### ####  ##   ##   ##  ####  ##    ##     ##  ##   ##  ##        ##       \n")
                        .append("\t## ### ## ##     ##  ##  ## ## ##    ########  ##     ## ##   #### ######   \n")
                        .append("\t##     ## #########  ##  ##  ####    ##        ######### ##    ##  ##       \n")
                        .append("\t##     ## ##     ##  ##  ##   ###    ##        ##     ## ##    ##  ##       \n")
                        .append("\t##     ## ##     ## #### ##    ##    ##        ##     ##  ######   ######## \n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("");
                return strB.toString();
            case PageId.RANKING:
                switch (secondPage) {
                    default:
                        strB.append("\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t██████   █████  ███    ██ ██   ██ ██ ███    ██  ██████  \n")
                                .append("\t██   ██ ██   ██ ████   ██ ██  ██  ██ ████   ██ ██       \n")
                                .append("\t██████  ███████ ██ ██  ██ █████   ██ ██ ██  ██ ██   ███ \n")
                                .append("\t██   ██ ██   ██ ██  ██ ██ ██  ██  ██ ██  ██ ██ ██    ██ \n")
                                .append("\t██   ██ ██   ██ ██   ████ ██   ██ ██ ██   ████  ██████  \n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("");
                        return strB.toString();
                }

            case PageId.BOARD:
                Map<Integer, Board> boardList = new LinkedHashMap<Integer, Board>();
                boardList = BoardDao.load();
                switch (secondPage) {
                    case BoardId.BOARDREAD:
                        strB.append(String.format("\n\t제  목 | %-50.50s\n\t작성자 | %-10.10s\n",
                                boardList.get(third).getTitle(), boardList.get(third).getWriter()));
                        strB.append(
                                "\t--------------------------------------------------------------------------------------------------\n");
                        for (int i = 0; i < 18; i++) {
                            if (i < boardList.get(third).getContent().length) {
                                strB.append(String.format("\t%s\n",
                                        boardList.get(third).getContent()[i].toString()));
                            } else {
                                strB.append(String.format("\n",
                                        ""));
                            }
                        }
                        return strB.toString();
                    case BoardId.BOARDMODIFY:
                        return strB.toString();
                    case BoardId.BOARDLIST:
                    case BoardId.BOARDBACK:
                        strB.append(String.format("\n\t%-5s %-14s  %-8s  %-8s %-30s\n",
                                "번 호", "작 성 자", "날 짜", "조회수", "제           목"));
                        strB.append(
                                "\t--------------------------------------------------------------------------------------------------\n");
                        for (Board list : boardList.values()) {
                            strB.append(String.format("\t%-8d %-14.8s %-15.10s %-6.6s %-30.28s\n", list.getUid(),
                                    list.getWriter(), list.getRegdate(), list.getHits(), list.getTitle()));
                        }
                    default:
                        return strB.toString();
                }
            case PageId.GAME:
                switch (secondPage) {
                    case GameId.BACCARAT:
                    case GameId.BLACKJACK:
                    case GameId.CINEMAQUIZ:
                        return "";
                    default:
                        strB.append("\n")
                                .append("\tGame List\n")
                                .append("\t\n")
                                .append("\tGiwon Presents : BlackJack | 단축키 : J\n")
                                .append("\t\n")
                                .append("\tHero Presents : Baccarat | 단축키 : B\n")
                                .append("\t\n")
                                .append("\tDain Presents : Cinema Music Quiz | 단축키 : C\n")
                                .append("\t\n")
                                .append("\tGitHub Presents : Tetris | 단축키 : T\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("");
                        return strB.toString();
                }
            case PageId.ADMIN:
                switch (secondPage) {
                    default:
                        strB.append("\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t  ___  ______ ___  ___ _____  _   _  _____  _____  _____ ______   ___   _____  _____ ______ \n")
                                .append("\t / _ \\ |  _  \\|  \\/  ||_   _|| \\ | ||_   _|/  ___||_   _|| ___ \\ / _ \\ |_   _||  _  || ___ \\\n")
                                .append("\t/ /_\\ \\| | | || .  . |  | |  |  \\| |  | |  \\ `--.   | |  | |_/ // /_\\ \\  | |  | | | || |_/ /\n")
                                .append("\t|  _  || | | || |\\/| |  | |  | . ` |  | |   `--. \\  | |  |    / |  _  |  | |  | | | ||    / \n")
                                .append("\t| | | || |/ / | |  | | _| |_ | |\\  | _| |_ /\\__/ /  | |  | |\\ \\ | | | |  | |  \\ \\_/ /| |\\ \\ \n")
                                .append("\t\\_| |_/|___/  \\_|  |_/ \\___/ \\_| \\_/ \\___/ \\____/   \\_/  \\_| \\_|\\_| |_/  \\_/   \\___/ \\_| \\_|\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("\t\n")
                                .append("");
                        return strB.toString();
                }
            case PageId.EXIT:
                return strB.toString();
            default:
                strB.append("\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t _   __ _                           _   _                     ______         _         ______  _   _ \n")
                        .append("\t| | / /(_)                         | | | |                    |  _  \\       (_)        | ___ \\| | | |\n")
                        .append("\t| |/ /  _ __      __  ___   _ __   | |_| |  ___  _ __   ___   | | | |  __ _  _  _ __   | |_/ /| |_| |\n")
                        .append("\t|    \\ | |\\ \\ /\\ / / / _ \\ | '_ \\  |  _  | / _ \\| '__| / _ \\  | | | | / _` || || '_ \\  | ___ \\|  _  |\n")
                        .append("\t| |\\  \\| | \\ V  V / | (_) || | | | | | | ||  __/| |   | (_) | | |/ / | (_| || || | | | | |_/ /| | | |\n")
                        .append("\t\\_| \\_/|_|  \\_/\\_/   \\___/ |_| |_| \\_| |_/ \\___||_|    \\___/  |___/   \\__,_||_||_| |_| \\____/ \\_| |_/\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("\t\n")
                        .append("");
                return strB.toString();
        }
    }
}
