package logicImpl;

import logic.AppManager;
import logic.FbLoginOperations;
import model.FbUser;

public class FbLoginOperationsImpl extends DriverBasedOperations implements FbLoginOperations {
    public FbLoginOperationsImpl(AppManager appManager) {
        super(appManager);
    }

    @Override
    public void loginByEmailAs(FbUser fbUser) {
        pages.getFbLoginPage().enterEmail(fbUser.getEmail());
        pages.getFbLoginPage().enterPassword(fbUser.getPassword());
        pages.getFbLoginPage().clickOnSignInButton();
    }
}
