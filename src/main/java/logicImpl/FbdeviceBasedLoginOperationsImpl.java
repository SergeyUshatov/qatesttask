package logicImpl;

import logic.AppManager;
import logic.FbdeviceBasedLoginOperations;

public class FbdeviceBasedLoginOperationsImpl extends DriverBasedOperations implements FbdeviceBasedLoginOperations {
    public FbdeviceBasedLoginOperationsImpl(AppManager appManager) {
        super(appManager);
    }

    @Override
    public boolean isEmailInputPresent() {
        return pages.getFbDeviceBasedLoginPage().isEmailInputPresent();
    }

    @Override
    public boolean isPasswordInputPresent() {
        return pages.getFbDeviceBasedLoginPage().isPasswordInputPresent();
    }

    @Override
    public boolean isAlertPresent() {
        return pages.getFbDeviceBasedLoginPage().isAlertPresent();
    }

    @Override
    public boolean isLoginButtonPresent() {
        return pages.getFbDeviceBasedLoginPage().isLoginButtonPresent();
    }
}
