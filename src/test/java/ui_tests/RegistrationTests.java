package ui_tests;

import model.FbUser;
import org.testng.annotations.Test;
import utils.FbUserHelper;

import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationTests extends TestBase {

    @Test
    public void registerNewUserHappyPath() {
        FbUser user = FbUserHelper.randomUser();
        app.getFbRegisterOperations().fillForm(user);
        app.getFbRegisterOperations().submitForm();

//        todo add assertions
    }
}
