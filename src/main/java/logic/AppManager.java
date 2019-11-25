package logic;

public interface AppManager {
    WebDriverOperations getWebDriverOperations();
    WebElementOperations getWebElementOperations();
    NavigationOperations getNavigationOperations();
    FbLoginOperations getFbLoginOperations();

    FbdeviceBasedLoginOperations getFbdeviceBasedLoginOperations();
}
