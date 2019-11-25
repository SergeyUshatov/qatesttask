package pages;

import logic.AppManager;

public class PageManager {
    private FbLoginPage fbLoginPage;
    private FbDeviceBasedLoginPage fbDeviceBasedLoginPage;

    public PageManager(AppManager appManager) {
        fbLoginPage = new FbLoginPage(appManager);
        fbDeviceBasedLoginPage = new FbDeviceBasedLoginPage(appManager);
    }

    public FbLoginPage getFbLoginPage() {
        return fbLoginPage;
    }

    public FbDeviceBasedLoginPage getFbDeviceBasedLoginPage() {
        return fbDeviceBasedLoginPage;
    }
}

