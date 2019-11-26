package pages;

import logic.AppManager;
import model.Gender;
import model.GenderCustomPronoun;

import java.time.LocalDate;

public class FbRegisterPage extends Page{
    FbRegisterPage(AppManager appManager) {
        super(appManager);
    }

    private static final String registerFirstNameInput = "//input[@name='firstname']";
    private static final String registerLastNameInput = "//input[@name='lastname']";
    private static final String registerEmailOrPhoneInpt = "//input[@name='reg_email__']";
    private static final String registerEmailConfirmInput = "//input[@name='reg_email_confirmation__']";
    private static final String registerPasswordInpt = "//input[@name='reg_passwd__']";
    private static final String registerMonthSelect = "//select[@id='month']";
    private static final String registerDaySelect = "//select[@id='day']";
    private static final String registerYearSelect = "//select[@id='year']";
    private static final String radioGenderFemale = "//label[text()='Female']";
    private static final String radioGenderMale = "//label[text()='Male']";
    private static final String radioGenderCustom = "//label[text()='Custom']";
    private static final String preferredPronounGenderCustomSelect = "//select[@name='preferred_pronoun']";
    private static final String customGenderInput = "//input[@name='custom_gender']";
    private static final String signUpButton = "//button[@name='websubmit']";


    public void enterFirstName(String firstName) {
        webElementOperations.clearInputAndEnterText(registerFirstNameInput, firstName);
    }

    public void enterLastName(String lastName) {
        webElementOperations.clearInputAndEnterText(registerLastNameInput, lastName);
    }

    public void enterPhoneOrEmail(String phoneOrEmail) {
        webElementOperations.clearInputAndEnterText(registerEmailOrPhoneInpt, phoneOrEmail);
    }

    public void clickOnSignUp() {
        webElementOperations.click(signUpButton);
    }

    public void enterGenderCustomOptional(String text) {
        webElementOperations.clearInputAndEnterText(customGenderInput, text);
    }

    public void enterPassword(String password) {
        webElementOperations.clearInputAndEnterText(registerPasswordInpt, password);
    }

    public void selectGender(Gender gender) {
        switch (gender) {
            case MALE: {
                webElementOperations.click(radioGenderMale);
                break;
            }

            case FEMALE: {
                webElementOperations.click(radioGenderFemale);
                break;
            }

            case CUSTOM: {
                webElementOperations.click(radioGenderCustom);
                break;
            }

            default: {
                 break;
             }
        }
    }

    public void selectMonthOfBirth(LocalDate birthDate) {
        int month = birthDate.getMonth().getValue();
        webElementOperations.selectValueByIndex(registerMonthSelect, month);
    }

    public void selectDayOfBirth(LocalDate birthDate) {
        int dayOfMonth = birthDate.getDayOfMonth();
        webElementOperations.selectValueByText(registerDaySelect, dayOfMonth + "");
    }

    public void selectYearOfBirth(LocalDate birthDate) {
        int year = birthDate.getYear();
        webElementOperations.selectValueByText(registerYearSelect, year + "");
    }

    public void selectGenderCustomPronoun(GenderCustomPronoun genderCustomPronoun) {
        webElementOperations.selectValueByText(preferredPronounGenderCustomSelect, genderCustomPronoun.getDetails());
    }

    public void enterEmailConfirmation(String email) {
        webElementOperations.clearInputAndEnterText(registerEmailConfirmInput, email);
    }
}
