package pages;

import logic.AppManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FbLoginPage extends Page  {
    private static final Logger log = LogManager.getLogger(FbLoginPage.class);

    public FbLoginPage(AppManager appManager) {
        super(appManager);
    }

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "pass")
    WebElement passwordInput;

    @FindBy(id = "loginbutton")
    WebElement loginLabel;

    @FindBy(name = "firstname")
    WebElement registerFirstNameInput;

    @FindBy(name = "lastname")
    WebElement registerLastNameInput;

    @FindBy(name = "reg_email__")
    WebElement registerEmailOrPhoneInpt;

    @FindBy(name = "reg_passwd__")
    WebElement registerPasswordInpt;

    @FindBy(id = "month")
    Select registerMonthSelect;

    @FindBy(id = "day")
    Select registerDaySelect;

    @FindBy(id = "year")
    Select registerYearSelect;

    @FindBy(xpath = "//label[text()='Female']")
    WebElement radioGenderFemale;

    @FindBy(xpath = "//label[text()='Male']")
    WebElement radioGenderMale;

    @FindBy(xpath = "//label[text()='Custom']")
    WebElement radioGenderCustom;

    @FindBy(name = "preferred_pronoun")
    Select preferedPronounGenderCustomSelect;

    @FindBy(name = "custom_gender")
    WebElement customGenderInput;

    @FindBy(name = "websubmit")
    WebElement signUpButton;

    public void enterEmail(String email) {
        log.debug("Going to type '" + email + "' into email input");
        webElementOperations.clearInputAndEnterText(emailInput, email);
    }

    public void enterPassword(String password) {
        log.debug("Going to type '" + password + "' into password input");
        webElementOperations.clearInputAndEnterText(passwordInput, password);
    }

    public void clickOnSignInButton() {
        log.debug("Going to click on Login button");
        webElementOperations.clickOn(loginLabel);
    }

}
