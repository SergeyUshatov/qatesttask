package pages;

import logic.AppManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbDeviceBasedLoginPage extends Page {
    private static final Logger log = LogManager.getLogger(FbDeviceBasedLoginPage.class);
    public FbDeviceBasedLoginPage(AppManager appManager) {
        super(appManager);
    }

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "pass")
    WebElement passwordInput;

    @FindBy(id = "loginbutton")
    WebElement loginButton;

    public boolean isEmailInputPresent() {
        return webElementOperations.isElementPresent(emailInput);
    }

    public boolean isPasswordInputPresent() {
        return webElementOperations.isElementPresent(passwordInput);
    }

    public boolean isInvalidEmailOrPhoneAlertPresent() {
        return webElementOperations.isElementWithTextPresent("The email or phone number you’ve entered doesn’t match any account.");
    }

    public boolean isLoginButtonPresent() {
        return webElementOperations.isElementPresent(loginButton);
    }
}
