package Pages;

import Utils.CountKorean;

public class BottomPage extends CountKorean {
    private static BottomPage _instance = null;

    public static BottomPage getInstance() {
        if (_instance == null) {
            _instance = new BottomPage();
        }
        return _instance;
    }

    public BottomPage() {
    }

    /**
     * Bottom Page 는 2라인을 사용하게 설정한다.
     * 페이지마다 다른 선택지를 출력하게 한다.
     * 
     * @param page
     * @return
     */
    public String getPages(int page) {
        StringBuilder strB = new StringBuilder();
        strB.append(
                "\n└───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘\n");
        switch (page) {
            case PageId.LOGIN:
                strB.append("스마트미디어 인재개발원 ID 가 없는 분은 '손님' 또는 'GUEST' 를 입력하십시오.\n");
                strB.append("I D : \t");
                return strB.toString();
            case PageId.CREATEACCOUNT:
                return strB.toString();
            case PageId.TOPPAGE:
            case PageId.MAIN:
                strB.append("초기화면(T) 랭킹(R) 게시판(B) 게임(G) 종료(X)\n");
                strB.append("선택>\t");
                return strB.toString();
            case PageId.RANKING:
                strB.append("명령어안내(C) 도움말(H) 초기화면(T) 게임(G) 종료(X)\n");
                strB.append("선택>\t");
                return strB.toString();
            case PageId.BOARD:
                strB.append("읽기(R) 쓰기(W) 수정(M) 목록(L) 초기화면(T) 종료(X)\n");
                strB.append("선택>\t");
                return strB.toString();
            case PageId.GAME:
                strB.append("명령어안내(C) 도움말(H) 초기화면(T) 게임(G) 종료(X)\n");
                strB.append("선택>\t");
                return strB.toString();
            case PageId.ADMIN:
                strB.append("명령어안내(C) 도움말(H) 초기화면(T) 게임(G) 종료(X)\n");
                strB.append("선택>\t");
                return strB.toString();
            case PageId.EXIT:
                return strB.toString();
            default:
                strB.append("스마트미디어 인재개발원 ID 가 없는 분은 '손님' 또는 'GUEST' 를 입력하십시오.\n");
                strB.append("I D : \t");
                return strB.toString();
        }
    }
}
