package pages;

import logic.AppManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FbDeviceBasedLoginPage extends Page {
    private static final Logger log = LogManager.getLogger(FbDeviceBasedLoginPage.class);
    FbDeviceBasedLoginPage(AppManager appManager) {
        super(appManager);
    }

    private static final String emailInput = "//input[@id='email']";
    private static final String passwordInput = "//input[@id='pass']";
    private static final String loginButton = "//button[@id='loginbutton']";
    private static final String alert = "//*[@role='alert']";

    public boolean isEmailInputPresent() {
        return webElementOperations.isElementPresent(emailInput);
    }

    public boolean isPasswordInputPresent() {
        return webElementOperations.isElementPresent(passwordInput);
    }

    public boolean isAlertPresent() {
        return webElementOperations.isElementPresent(alert);
    }

    public boolean isLoginButtonPresent() {
        return webElementOperations.isElementPresent(loginButton);
    }
}
