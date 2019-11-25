package logicImpl;

import logic.*;
import utils.PropertyLoader;

public class AppManagerImpl implements AppManager {


    private WebDriverOperations webDriverOperations;
    private WebElementOperations webElementOperations;
    private NavigationOperations navigationOperations;
    private FbLoginOperations fbLoginOperations;
    private FbdeviceBasedLoginOperations fbdeviceBasedLoginOperations;

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
}
