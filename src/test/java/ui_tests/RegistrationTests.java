package ui_tests;

import model.FbUser;
import org.testng.annotations.Test;
import utils.FbUserHelper;

public class RegistrationTests extends TestBase {

    @Test
    public void registerNewUserHappyPath() {
        FbUser user = FbUserHelper.randomUser();
        getApp().getFbRegisterOperations().fillForm(user);
        getApp().getFbRegisterOperations().submitForm();

        // todo add assertions that user has passed registration form, I just don't know what is the next step of registration
    }

}
