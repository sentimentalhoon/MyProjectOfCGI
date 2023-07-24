/**
 * page 를 상, 중, 하로 나누어 처리하게 한다.
 * 각각의 페이지를 pageid마다 다르게 처리하게 하였다.
 * subpage, thirdpage 처리가 존재한다.
 */
package Main;

import Pages.BottomPage;
import Pages.MiddlePage;
import Pages.TopPage;

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

    public String getPage(int page, int subPage, int third) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TopPage.getInstance().getPages(page));
        stringBuilder.append(MiddlePage.getInstance().getPages(page, subPage, third));
        stringBuilder.append(BottomPage.getInstance().getPages(page));
        return stringBuilder.toString();
    }
}