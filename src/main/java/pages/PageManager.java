package pages;

import logic.AppManager;

public class PageManager {
    private FbLoginPage fbLoginPage;

    public PageManager(AppManager appManager) {
        fbLoginPage = new FbLoginPage(appManager);
    }

    public FbLoginPage getFbLoginPage() {
        return fbLoginPage;
    }
}

