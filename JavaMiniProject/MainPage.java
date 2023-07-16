package JavaMiniProject;

import JavaMiniProject.Pages.BottomPage;
import JavaMiniProject.Pages.MiddlePage;
import JavaMiniProject.Pages.TopPage;

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