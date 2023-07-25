package Pages;

import java.util.LinkedHashMap;
import java.util.Map;

import Board.Board;
import Board.BoardDao;
import Board.BoardId;
import Game.GameId;
import Utils.CountKorean;

public class MiddlePage extends CountKorean {
    private static MiddlePage _instance = null;
    private int countSpace = 115;

    public static MiddlePage getInstance() {
        if (_instance == null) {
            _instance = new MiddlePage();
        }
        return _instance;
    }

    public MiddlePage() {
    }

    /**
     * 페이지마다 다른 선택지를 출력하게 한다.
     * 
     * @param page
     * @return
     */
    public String getPages(int page, int secondPage, int third) {
        switch (page) {
            case PageId.LOGIN:
                return getLoginStrig();
            case PageId.CREATEACCOUNT:
                return "";
            case PageId.TOPPAGE:
            case PageId.MAIN:
                return getTopMainPage();
            case PageId.RANKING:
                return getRankingString(secondPage);
            case PageId.BOARD:
                return getBoardString(secondPage, third);
            case PageId.GAME:
                return getGameString(secondPage);
            case PageId.ADMIN:
                return getAdminString(secondPage);
            case PageId.EXIT:
                return "";
            default:
                return getDefalutString();
        }
    }

    private String getGameString(int secondPage) {
        switch (secondPage) {
            case GameId.BACCARAT:
            case GameId.BLACKJACK:
            case GameId.CINEMAQUIZ:
                return "";
            default:
                StringBuilder strB = new StringBuilder();
                strB.append(
                        "\n├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\n")
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  Game List")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n",
                                countKorean(countSpace, "  Giwon Presents : BlackJack | 단축키 : J")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n",
                                countKorean(countSpace, "  Hero Presents : Baccarat | 단축키 : Z")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n",
                                countKorean(countSpace, "  Dain Presents : Cinema Music Quiz | 단축키 : C")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n",
                                countKorean(countSpace, "  Dain Presents : 심부름 어드벤처 | 단축키 : s")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  League of Legends")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  Fifa Online 4")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  StarCraft")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  MapleStory")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  동물의 숲")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  발로란트")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  디아블로 4")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  오버워치 2")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  로스트아크")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "  배틀그라운드")))
                        .append(String.format("│%s│", countKorean(countSpace, "")));
                return strB.toString();
        }
    }

    private String getLoginStrig() {
        StringBuilder strB = new StringBuilder();
        strB.append(
                "\n├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\n")
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, " With you nothing is simple")))
                .append(String.format("│%s│\n", countKorean(countSpace, " yet nothing is simpler")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│", countKorean(countSpace, "")));
        return strB.toString();
    }

    private String getTopMainPage() {
        StringBuilder strB = new StringBuilder();
        strB.append(
                "\n├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\n")
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, " With you nothing is simple")))
                .append(String.format("│%s│\n", countKorean(countSpace, " yet nothing is simpler")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│", countKorean(countSpace, "")));
        return strB.toString();
    }

    private String getRankingString(int secondPage) {
        StringBuilder strB = new StringBuilder();
        strB.append(
                "\n├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\n")
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, " With you nothing is simple")))
                .append(String.format("│%s│\n", countKorean(countSpace, " yet nothing is simpler")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│", countKorean(countSpace, "")));
        return strB.toString();
    }

    private String getBoardString(int secondPage, int third) {
        StringBuilder strB = new StringBuilder();
        Map<Integer, Board> boardList = new LinkedHashMap<Integer, Board>();
        boardList = BoardDao.load();
        strB.append(
                "\n├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\n");
        switch (secondPage) {
            case BoardId.BOARDREAD:
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n",
                                countKorean(countSpace,
                                        String.format("        %-8s | %-50.50s", "Title",
                                                boardList.get(third).getTitle()))))
                        .append(String.format("│%s│\n",
                                countKorean(countSpace,
                                        String.format("        %-8s | %-10.10s", "Writer",
                                                boardList.get(third).getWriter()))))
                        .append(String.format("│%s│\n", countKorean(countSpace,
                                "    --------------------------------------------------------------------------------------------------")));
                for (int i = 0; i < 18; i++) {
                    if (i < boardList.get(third).getContent().length) {
                        strB.append(String.format("│%s│\n",
                                countKorean(countSpace,
                                        "      " + boardList.get(third).getContent()[i].toString())));
                    } else {
                        strB.append(String.format("│%s│\n", countKorean(countSpace, "")));
                    }
                }
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│", countKorean(countSpace, "")));
                return strB.toString();
            case BoardId.BOARDMODIFY:
                return strB.toString();
            case BoardId.BOARDLIST:
            case BoardId.BOARDBACK:
            default:
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n",
                                countKorean(countSpace,
                                        String.format("        %-8s %-14s %-15s %-12s %-30s",
                                                "No", "Writer", "Date", "Subject", "Title"))))
                        .append(String.format("│%s│\n", countKorean(countSpace,
                                "    --------------------------------------------------------------------------------------------------")));
                for (Board list : boardList.values()) {
                    strB.append(String.format("│%s│\n",
                            countKorean(countSpace,
                                    String.format("        %-8d %-14.8s %-15.10s %-12.12s %-30.30s", list.getUid(),
                                            list.getWriter(), list.getRegdate(), list.getHits(), list.getTitle()))));
                    strB.append(String.format("│%s│\n", countKorean(countSpace, "")));
                }
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")));
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")));
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")));
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")));
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")));
                strB.append(String.format("│%s│", countKorean(countSpace, "")));

                return strB.toString();
        }
    }

    private String getAdminString(int secondPage) {
        StringBuilder strB = new StringBuilder();
        strB.append(
                "\n├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\n");
        switch (secondPage) {
            default:
                strB.append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, " With you nothing is simple")))
                .append(String.format("│%s│\n", countKorean(countSpace, " yet nothing is simpler")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│\n", countKorean(countSpace, "")))
                        .append(String.format("│%s│", countKorean(countSpace, "")));
                return strB.toString();
        }
    }

    private String getDefalutString() {
        StringBuilder strB = new StringBuilder();
        strB.append(
                "\n├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\n")
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, " With you nothing is simple")))
                .append(String.format("│%s│\n", countKorean(countSpace, " yet nothing is simpler")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│\n", countKorean(countSpace, "")))
                .append(String.format("│%s│", countKorean(countSpace, "")));
        return strB.toString();
    }
}
