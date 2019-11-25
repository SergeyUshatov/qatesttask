package ui_tests;

import model.FbUser;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginTests extends TestBase {

    @Test
    public void loginHapy() {
        System.out.println("hello");
    }

    @Test
    public void loginWithInvalidPassword() {
        FbUser userWithInvalidUserName = new FbUser()
                .setFirstName("notExistingUserName")
                .setPassword("validPassword");
        app.getFbLoginOperations().loginByEmailAs(userWithInvalidUserName);

        assertThat(app.getWebDriverOperations().currentUrl(), containsString("https://www.facebook.com/login"));
        assertThat(app.getFbdeviceBasedLoginOperations().isEmailInputPresent(), is(true));
        assertThat(app.getFbdeviceBasedLoginOperations().isPasswordInputPresent(), is(true));
        assertThat(app.getFbdeviceBasedLoginOperations().isInvalidEmailOrPhoneAlertPresent(), is(true));
        assertThat(app.getFbdeviceBasedLoginOperations().isLoginButtonPresent(), is(true));

    }

    // todo data provider of invalid users
}
