package Pages;

import Main.PageId;

public class TopPage {

    private static TopPage _instance = null;

    public static TopPage getInstance() {
        if (_instance == null) {
            _instance = new TopPage();
        }
        return _instance;
    }

    public TopPage() {
    }

    /**
     * Top Page 는 15라인을 사용하게 설정한다.
     * 페이지마다 다른 선택지를 출력하게 한다.
     * 
     * @param page
     * @return
     */
    public String getPages(int page) {
        StringBuilder strB = new StringBuilder();
        strB.append("\n\n\n\n\n");
        strB.append(
                "\n=====================================================================================================================\n");
        switch (page) {
            case PageId.LOGIN:
                strB.append(String.format("%-20s %s", "TOP", "'스마트미디어 인재개발원' 에 오신 것을 환영합니다.\t"));
                return strB.toString();
            case PageId.CREATEACCOUNT:
                strB.append(
                        String.format("%-20s %s", "TOP > 계정생성", "[스마트 인재개발원] 회원 가입 진행 중입니다.\t"));
                return strB.toString();
            case PageId.TOPPAGE:
            case PageId.MAIN:
                strB.append(
                        String.format("%-20s %s", "TOP > 메인", "[스마트 인재개발원] 메인 페이지. 명령어를 입력하세요.\t"));
                return strB.toString();
            case PageId.RANKING:
                strB.append(String.format("%-20s %s", "TOP > 랭킹", "[스마트 인재개발원] 전체 게임의 랭킹을 조회할 수 있습니다.\t"));
                return strB.toString();
            case PageId.BOARD:
                strB.append(String.format("%-20s %s", "TOP > 게시판", "[스마트 인재개발원] 자 유 게 시 판\t"));
                return strB.toString();
            case PageId.GAME:
                strB.append(String.format("%-20s %s", "TOP > 게임", "[스마트 인재개발원] 실행할 게임을 선택하세요!\t"));
                return strB.toString();
            case PageId.ADMIN:
                strB.append(String.format("%-20s %s", "TOP > 관리자", "[스마트 인재개발원] 관리자 모드입니다.\t"));
                return strB.toString();
            case PageId.EXIT:
                return strB.toString();
            default:
                strB.append(String.format("%-20s %s", "TOP", "'스마트미디어 인재개발원' 에 오신 것을 환영합니다.\t"));
                return strB.toString();
        }
    }
}
