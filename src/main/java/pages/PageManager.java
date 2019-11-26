package pages;

import logic.AppManager;
import logic.FbMainOperations;

public class PageManager {
    private FbLoginPage fbLoginPage;
    private FbDeviceBasedLoginPage fbDeviceBasedLoginPage;
    private FbMainPage fbMainPage;
    private FbRegisterPage fbRegisterPage;

    public PageManager(AppManager appManager) {
        fbLoginPage = new FbLoginPage(appManager);
        fbDeviceBasedLoginPage = new FbDeviceBasedLoginPage(appManager);
        fbMainPage = new FbMainPage(appManager);
        fbRegisterPage = new FbRegisterPage(appManager);
    }

    public FbLoginPage getFbLoginPage() {
        return fbLoginPage;
    }

    public FbDeviceBasedLoginPage getFbDeviceBasedLoginPage() {
        return fbDeviceBasedLoginPage;
    }

    public FbMainPage getFbMainPage() {
        return fbMainPage;
    }

    public FbRegisterPage getFbRegisterPage() {
        return fbRegisterPage;
    }
}

