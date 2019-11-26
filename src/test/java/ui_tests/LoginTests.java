package ui_tests;

import model.FbUser;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginTests extends TestBase {

    private static final String NOT_EXISTING_USER_NAME = "notExistingUserName";
    private static final String EXISTING_USER_NAME = "existingUserName";
    private static final String NOT_EXISTING_USER_PHONE = "123456789";
    private static final String EXISTING_USER_PHONE = "+1555555555";
    private static final String VALID_PASSWORD = "validPassword";
    private static final String INVALID_PASSWORD = "invalidPassword";
    private static final String BLANK_STRING = "";

    @Test
    public void loginByEmailHappyPath() {
        FbUser user = new FbUser().setEmail(EXISTING_USER_NAME).setPassword(VALID_PASSWORD);
        app.getFbLoginOperations().loginByEmailAs(user);

        assertThatUserIsLoggedIn(app.getFbMainOperations().isMainContentPresent());
    }

    @Test
    public void loginByPhoneHappyPath() {
        FbUser user = new FbUser().setPhoneNumber(EXISTING_USER_NAME).setPassword(VALID_PASSWORD);
        app.getFbLoginOperations().loginByPhoneAs(user);

        assertThatUserIsLoggedIn(app.getFbMainOperations().isMainContentPresent());
    }

    //description argument is just to be printed in test info
    @Test(dataProvider = "invalidUsersWithEmails")
    public void loginByEmailWithInvalidUsername(String description, FbUser user) {
        app.getFbLoginOperations().loginByEmailAs(user);

        assertUserIsNotLoggedIn();
    }

    @Test(dataProvider = "invalidUsersWithPhones")
    public void loginByPhoneWithInvalidUsername(String description, FbUser user) {
        app.getFbLoginOperations().loginByPhoneAs(user);

        assertUserIsNotLoggedIn();
    }

    private void assertThatUserIsLoggedIn(boolean mainContentPresent) {
        assertThat(mainContentPresent, is(true));
    }

    private void assertUserIsNotLoggedIn() {
        assertThat(app.getWebDriverOperations().currentUrl(), containsString("https://www.facebook.com/login"));
        assertThat(app.getFbdeviceBasedLoginOperations().isEmailInputPresent(), is(true));
        assertThat(app.getFbdeviceBasedLoginOperations().isPasswordInputPresent(), is(true));
        assertThat(app.getFbdeviceBasedLoginOperations().isAlertPresent(), is(true));
        assertThat(app.getFbdeviceBasedLoginOperations().isLoginButtonPresent(), is(true));
    }

    @DataProvider(name = "invalidUsersWithEmails")
    private Object[][] invalidUsersWithEmails() {
        return new Object[][] {
                { "notExistingUsername", new FbUser().setEmail(NOT_EXISTING_USER_NAME).setPassword(VALID_PASSWORD) },
                { "invalidPassword", new FbUser().setEmail(EXISTING_USER_NAME).setPassword(INVALID_PASSWORD)},
                { "blankUsername", new FbUser().setEmail(BLANK_STRING).setPassword(VALID_PASSWORD)},
                { "blankPassword", new FbUser().setEmail(EXISTING_USER_NAME).setPassword(BLANK_STRING)},
                { "blankUsernameAndPassword", new FbUser().setEmail(BLANK_STRING).setPassword(BLANK_STRING)},
        };
    }

    @DataProvider(name = "invalidUsersWithPhones")
    private Object[][] invalidUsersWithPhones() {
        return new Object[][] {
                { "notExistingUserPhone", new FbUser().setPhoneNumber(NOT_EXISTING_USER_PHONE).setPassword(VALID_PASSWORD) },
                { "invalidPassword", new FbUser().setPhoneNumber(EXISTING_USER_PHONE).setPassword(INVALID_PASSWORD)},
                { "ExistingPhoneAndBlankPassword", new FbUser().setPhoneNumber(EXISTING_USER_PHONE).setPassword(BLANK_STRING)}
        };
    }

}
