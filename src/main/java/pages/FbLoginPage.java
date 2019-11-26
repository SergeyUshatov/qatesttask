package pages;

import logic.AppManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FbLoginPage extends Page  {
    private static final Logger log = LogManager.getLogger(FbLoginPage.class);

    FbLoginPage(AppManager appManager) {
        super(appManager);
    }

    private static final String emailInput = "//input[@id='email']";
    private static final String passwordInput = "//input[@id='pass']";
    private static final String loginLabel = "//*[@id='loginbutton']";

    public void enterEmailOrPhone(String email) {
        log.debug("Going to type '" + email + "' into email input");
        webElementOperations.clearInputAndEnterText(emailInput, email);
    }

    public void enterPassword(String password) {
        log.debug("Going to type '" + password + "' into password input");
        webElementOperations.clearInputAndEnterText(passwordInput, password);
    }

    public void clickOnSignInButton() {
        log.debug("Going to click on Login button");
        webElementOperations.click(loginLabel);
    }

}
