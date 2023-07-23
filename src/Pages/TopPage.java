package Pages;

import Utils.CountKorean;
import Utils.SystemUtil;

public class TopPage extends CountKorean{

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
        int countSpace = 90;
        StringBuilder strB = new StringBuilder();
        strB.append("\n\n\n\n\n");
        strB.append(
                "\n┌───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐\n");
        switch (page) {
            case PageId.CREATEACCOUNT: {
                String str = "[스마트 인재개발원] 회원 가입 진행 중입니다.";
                strB.append(
                        String.format("│%-15.15s %s │ %2s MB │", " TOP > CreateAccount",
                                countKorean(countSpace, str),
                                String.valueOf(SystemUtil.getUsedMemoryMB())));
                return strB.toString();
            }
            case PageId.TOPPAGE:
            case PageId.MAIN: {
                String str = "[스마트 인재개발원] 메인 페이지. 명령어를 입력하세요.";
                strB.append(String.format("│%-15.15s %s │ %2s MB │", " TOP > Main",
                        countKorean(countSpace, str),
                        String.valueOf(SystemUtil.getUsedMemoryMB())));
                return strB.toString();
            }
            case PageId.RANKING: {
                String str = "[스마트 인재개발원] 전체 게임의 랭킹을 조회할 수 있습니다.";
                strB.append(String.format("│%-15.15s %s │ %2s MB │", " TOP > Ranking",
                        countKorean(countSpace, str),
                        String.valueOf(SystemUtil.getUsedMemoryMB())));
                return strB.toString();
            }
            case PageId.BOARD: {
                String str = "[스마트 인재개발원] 자 유 게 시 판";
                strB.append(String.format("│%-15.15s %s │ %2s MB │", " TOP > Booard",
                        countKorean(countSpace, str),
                        String.valueOf(SystemUtil.getUsedMemoryMB())));
                return strB.toString();
            }
            case PageId.GAME: {
                String str = "[스마트 인재개발원] 실행할 게임을 선택하세요!";
                strB.append(
                        String.format("│%-15.15s %s │ %2s MB │", " TOP > Game", countKorean(countSpace, str),
                                String.valueOf(SystemUtil.getUsedMemoryMB())));
                return strB.toString();
            }
            case PageId.ADMIN: {
                String str = "[스마트 인재개발원] 관리자 모드입니다.";
                strB.append(String.format("│%-15.15s %s │ %2s MB │", " TOP > Admin",
                        countKorean(countSpace, str),
                        String.valueOf(SystemUtil.getUsedMemoryMB())));
                return strB.toString();
            }
            case PageId.EXIT: {
                return strB.toString();
            }
            case PageId.LOGIN:
            default: {
                String str = "'스마트미디어 인재개발원' 에 오신 것을 환영합니다.";
                strB.append(String.format("│%-15.15s %s │ %2s MB │", " TOP", countKorean(countSpace, str),
                        String.valueOf(SystemUtil.getUsedMemoryMB())));
                return strB.toString();
            }
        }
    }
}
