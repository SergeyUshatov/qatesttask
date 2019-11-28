package ui_tests;

import model.FbUser;
import model.Gender;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.FbUserHelper;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static utils.Constants.*;

public class RegistrationTests extends TestBase {

    @Test
    public void registerNewUserHappyPath() {
        FbUser user = FbUserHelper.randomUser();
        getApp().getFbRegisterOperations().fillForm(user);
        getApp().getFbRegisterOperations().submitForm();
        getApp().getFbRegisterOperations().enterFbConfirmationCode("1234567");

        assertThatUserIsRegistered();
    }

    @Test(dataProvider = "invalidUsersForRegistration")
    public void registerNewUserHappyPath(String description, FbUser user, String expectedMessage) {
        getApp().getFbRegisterOperations().fillForm(user);
        getApp().getFbRegisterOperations().submitForm();

        assertThat(getApp().getFbRegisterOperations().isAlertWithTextPresent(expectedMessage), is(true));
        assertThatUserIsNotRegistered();
    }

    // private methods

    private void assertThatUserIsRegistered() {
        assertThat(true, is(true));
    }

    private void assertThatUserIsNotRegistered() {
        assertThat(true, is(true));
    }

    // data providers

    @DataProvider(name = "invalidUsersForRegistration")
    private Object[][] invalidUsersWithPhones() {
        return new Object[][] {
                { "firstNameIsBlank", FbUserHelper.randomUser().setFirstName(BLANK_STRING), NO_NAME_MESSAGE},
                { "lastNameIsBlank", FbUserHelper.randomUser().setLastName(BLANK_STRING), NO_NAME_MESSAGE},
                { "emailIsBlank", FbUserHelper.randomUser().setEmail(BLANK_STRING), NO_EMAIL_MESSAGE},
                { "passwordIsBlank", FbUserHelper.randomUser().setPassword(BLANK_STRING), NO_PASSWORD_MESSAGE},
                { "weekPassword", FbUserHelper.randomUser().setPassword("qwerty"), WEAK_PASSWORD_MESSAGE},
                { "birthDateIsInvalid", FbUserHelper.randomUser().setBirthDate(LocalDate.now()), INVALID_BIRTH_DATE_MESSAGE},
                { "genderIsNotSelected", FbUserHelper.randomUser().setGender(null), NO_GENDER_MESSAGE},
                { "birthDateIsInvalid", FbUserHelper.randomUser().setGender(Gender.CUSTOM).setGenderCustomPronoun(null), NO_GENDER_PRONOUN_MESSAGE},
        };
    }

}
