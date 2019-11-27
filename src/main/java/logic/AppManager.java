package logic;

public interface AppManager {
    WebDriverOperations getWebDriverOperations();
    WebElementOperations getWebElementOperations();
    NavigationOperations getNavigationOperations();
    FbLoginOperations getFbLoginOperations();
    FbdeviceBasedLoginOperations getFbdeviceBasedLoginOperations();
    FbMainOperations getFbMainOperations();
    FbRegisterOperations getFbRegisterOperations();
    FbSettingsOperations getFbSettingsOperations();
}
