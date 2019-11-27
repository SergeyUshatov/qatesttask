package logicImpl;

import logic.*;
import utils.PropertyLoader;

public class AppManagerImpl implements AppManager {


    private WebDriverOperations webDriverOperations;
    private WebElementOperations webElementOperations;
    private NavigationOperations navigationOperations;
    private FbLoginOperations fbLoginOperations;
    private FbdeviceBasedLoginOperations fbdeviceBasedLoginOperations;
    private FbMainOperations fbMainOperations;
    private FbRegisterOperations fbRegisterOperations;
    private FbSettingsOperations fbSettingsOperations;

    public AppManagerImpl() {
        String value = PropertyLoader.loadProperty("log4j.config.file");
        System.setProperty("log4j.configurationFile", value);
    }

    @Override
    public WebDriverOperations getWebDriverOperations() {
        if (webDriverOperations == null) {
            webDriverOperations = new WebDriverOperationsImpl();
        }
        return webDriverOperations;
    }

    @Override
    public WebElementOperations getWebElementOperations() {
        if (webElementOperations == null) {
            webElementOperations = new WebElementOperationsImpl(this);
        }
        return webElementOperations;
    }

    @Override
    public NavigationOperations getNavigationOperations() {
        if (navigationOperations == null) {
            navigationOperations = new NavigationOperationsImpl(this);
        }
        return navigationOperations;
    }

    @Override
    public FbLoginOperations getFbLoginOperations() {
        if (fbLoginOperations == null) {
            fbLoginOperations = new FbLoginOperationsImpl(this);
        }
        return fbLoginOperations;
    }

    @Override
    public FbdeviceBasedLoginOperations getFbdeviceBasedLoginOperations() {
        if (fbdeviceBasedLoginOperations == null) {
            fbdeviceBasedLoginOperations = new FbdeviceBasedLoginOperationsImpl(this);
        }
        return fbdeviceBasedLoginOperations;
    }

    @Override
    public FbMainOperations getFbMainOperations() {
        if (fbMainOperations == null) {
            fbMainOperations = new FbMainOperationsImpl(this);
        }
        return fbMainOperations;
    }

    @Override
    public FbRegisterOperations getFbRegisterOperations() {
        if (fbRegisterOperations == null) {
            fbRegisterOperations = new FbRegisterOperationsImpl(this);
        }
        return fbRegisterOperations;
    }

    @Override
    public FbSettingsOperations getFbSettingsOperations() {
        if (fbSettingsOperations == null) {
            fbSettingsOperations = new FbSettingsOperationsImpl(this);
        }
        return fbSettingsOperations;
    }
}
