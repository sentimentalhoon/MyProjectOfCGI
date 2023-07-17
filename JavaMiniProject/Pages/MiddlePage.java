package JavaMiniProject.Pages;

import java.util.LinkedHashMap;
import java.util.Map;

import JavaMiniProject.PageId;
import JavaMiniProject.Board.Board;
import JavaMiniProject.Board.BoardId;
import JavaMiniProject.Board.BoardDao;

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
     * Middle(Main) Page 는 15라인을 사용하게 설정한다.
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
                        .append("\tWhen you were here befor Couldn't look you in the eye\n")
                        .append("\tYou're just like an angel Your skil makes me cry\n")
                        .append("\tyou Float like a feather In a beautiful world\n")
                        .append("\tI wish I was special You're so fuckin' special\n")
                        .append("\tBut I'm creep,I', a weirdo What the hell am I doing here?\n")
                        .append("\tI don't belong here I don't care if it hurts\n")
                        .append("\t _   __ _                           _   _                     ______         _         ______  _   _ \n")
                        .append("\t| | / /(_)                         | | | |                    |  _  \\       (_)        | ___ \\| | | |\n")
                        .append("\t| |/ /  _ __      __  ___   _ __   | |_| |  ___  _ __   ___   | | | |  __ _  _  _ __   | |_/ /| |_| |\n")
                        .append("\t|    \\ | |\\ \\ /\\ / / / _ \\ | '_ \\  |  _  | / _ \\| '__| / _ \\  | | | | / _` || || '_ \\  | ___ \\|  _  |\n")
                        .append("\t| |\\  \\| | \\ V  V / | (_) || | | | | | | ||  __/| |   | (_) | | |/ / | (_| || || | | | | |_/ /| | | |\n")
                        .append("\t\\_| \\_/|_|  \\_/\\_/   \\___/ |_| |_| \\_| |_/ \\___||_|    \\___/  |___/   \\__,_||_||_| |_| \\____/ \\_| |_/\n")
                        .append("\t난 너를 알아볼 수 있어 단 한 순간에\n")
                        .append("\tCause here, I Stand For You\n")
                        .append("\t난 나를 지켜가겠어 언젠간 만날 너를 위해\n")
                        .append("\t세상과 싸워 나가며 너의 자릴 마련하겠어\n")
                        .append("\t하지만 기다림에 늙과 지쳐 쓰러지지 않게 어서 나타나줘\n")
                        .append("\t약속, 헌신, 운명, 영원 그리고 사랑\n")
                        .append("\t이 낱말들을 난 아직 믿습니다. 영원히\n")
                        .append("");
                return strB.toString();
            case PageId.CREATEACCOUNT:
                return strB.toString();
            case PageId.TOPPAGE:
            case PageId.MAIN:
                strB.append("\n")
                        .append("\t1. 기원팀 소개\n")
                        .append("\tYou're just like an angel Your skil makes me cry\n")
                        .append("\tyou Float like a feather In a beautiful world\n")
                        .append("\tI wish I was special You're so fuckin' special\n")
                        .append("\tBut I'm creep,I', a weirdo What the hell am I doing here?\n")
                        .append("\tI don't belong here I don't care if it hurts\n")
                        .append("\tI want to have control I want a perfect body I want a perfect soul\n")
                        .append("\t\n")
                        .append("\t##     ##    ###    #### ##    ##    ########     ###     ######   ######## \n")
                        .append("\t###   ###   ## ##    ##  ###   ##    ##     ##   ## ##   ##    ##  ##       \n")
                        .append("\t#### ####  ##   ##   ##  ####  ##    ##     ##  ##   ##  ##        ##       \n")
                        .append("\t## ### ## ##     ##  ##  ## ## ##    ########  ##     ## ##   #### ######   \n")
                        .append("\t##     ## #########  ##  ##  ####    ##        ######### ##    ##  ##       \n")
                        .append("\t##     ## ##     ##  ##  ##   ###    ##        ##     ## ##    ##  ##       \n")
                        .append("\t##     ## ##     ## #### ##    ##    ##        ##     ##  ######   ######## \n")
                        .append("\t\n")
                        .append("\t세상과 싸워 나가며 너의 자릴 마련하겠어\n")
                        .append("\t하지만 기다림에 늙과 지쳐 쓰러지지 않게 어서 나타나줘\n")
                        .append("\t약속, 헌신, 운명, 영원 그리고 사랑\n")
                        .append("\t이 낱말들을 난 아직 믿습니다. 영원히\n")
                        .append("");
                return strB.toString();
            case PageId.RANKING:
                strB.append("\n")
                        .append("\tRanking Page Login Complete\n")
                        .append("\tYou're just like an angel Your skil makes me cry\n")
                        .append("\tyou Float like a feather In a beautiful world\n")
                        .append("\tI wish I was special You're so fuckin' special\n")
                        .append("\tBut I'm creep,I', a weirdo What the hell am I doing here?\n")
                        .append("\tI don't belong here I don't care if it hurts\n")
                        .append("\tI want to have control I want a perfect body I want a perfect soul\n")
                        .append("\t\n")
                        .append("\t██████   █████  ███    ██ ██   ██ ██ ███    ██  ██████  \n")
                        .append("\t██   ██ ██   ██ ████   ██ ██  ██  ██ ████   ██ ██       \n")
                        .append("\t██████  ███████ ██ ██  ██ █████   ██ ██ ██  ██ ██   ███ \n")
                        .append("\t██   ██ ██   ██ ██  ██ ██ ██  ██  ██ ██  ██ ██ ██    ██ \n")
                        .append("\t██   ██ ██   ██ ██   ████ ██   ██ ██ ██   ████  ██████  \n")
                        .append("\t\n")
                        .append("\t난 나를 지켜가겠어 언젠간 만날 너를 위해\n")
                        .append("\t세상과 싸워 나가며 너의 자릴 마련하겠어\n")
                        .append("\t하지만 기다림에 늙과 지쳐 쓰러지지 않게 어서 나타나줘\n")
                        .append("\t약속, 헌신, 운명, 영원 그리고 사랑\n")
                        .append("\t이 낱말들을 난 아직 믿습니다. 영원히\n")
                        .append("");
                return strB.toString();
            case PageId.BOARD:
                Map<Integer, Board> boardList = new LinkedHashMap<Integer, Board>();
                boardList = BoardDao.load();
                switch (secondPage) {
                    case BoardId.BOARDLIST:
                    case BoardId.BOARDBACK:
                        strB.append(String.format("\n\t%-5s %-14s  %-8s  %-8s %-30s\n", "번 호",
                                "작 성 자", "날 짜", "조회수", "제           목"));
                        strB.append(
                                "\t--------------------------------------------------------------------------------------------------\n");
                        for (Board list : boardList.values()) {
                            strB.append(String.format("\t%-8d %-14.8s %-15.10s %-6.6s %-30.28s\n", list.getUid(),
                                    list.getWriter(), list.getRegdate(), list.getHits(), list.getTitle()));
                        }
                        return strB.toString();
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
                    default:
                        return strB.toString();
                }
            case PageId.ADMIN:
                strB.append("\n")
                        .append("\tAdmin Page Login Complete\n")
                        .append("\tYou're just like an angel Your skil makes me cry\n")
                        .append("\tyou Float like a feather In a beautiful world\n")
                        .append("\tI wish I was special You're so fuckin' special\n")
                        .append("\tBut I'm creep,I', a weirdo What the hell am I doing here?\n")
                        .append("\tI don't belong here I don't care if it hurts\n")
                        .append("\tI want to have control I want a perfect body I want a perfect soul\n")
                        .append("\t\n")
                        .append("\t  ___  ______ ___  ___ _____  _   _  _____  _____  _____ ______   ___   _____  _____ ______ \n")
                        .append("\t / _ \\ |  _  \\|  \\/  ||_   _|| \\ | ||_   _|/  ___||_   _|| ___ \\ / _ \\ |_   _||  _  || ___ \\\n")
                        .append("\t/ /_\\ \\| | | || .  . |  | |  |  \\| |  | |  \\ `--.   | |  | |_/ // /_\\ \\  | |  | | | || |_/ /\n")
                        .append("\t|  _  || | | || |\\/| |  | |  | . ` |  | |   `--. \\  | |  |    / |  _  |  | |  | | | ||    / \n")
                        .append("\t| | | || |/ / | |  | | _| |_ | |\\  | _| |_ /\\__/ /  | |  | |\\ \\ | | | |  | |  \\ \\_/ /| |\\ \\ \n")
                        .append("\t\\_| |_/|___/  \\_|  |_/ \\___/ \\_| \\_/ \\___/ \\____/   \\_/  \\_| \\_|\\_| |_/  \\_/   \\___/ \\_| \\_|\n")
                        .append("\t난 나를 지켜가겠어 언젠간 만날 너를 위해\n")
                        .append("\t세상과 싸워 나가며 너의 자릴 마련하겠어\n")
                        .append("\t하지만 기다림에 늙과 지쳐 쓰러지지 않게 어서 나타나줘\n")
                        .append("\t약속, 헌신, 운명, 영원 그리고 사랑\n")
                        .append("\t이 낱말들을 난 아직 믿습니다. 영원히\n")
                        .append("");
                return strB.toString();
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
