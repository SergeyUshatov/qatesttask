package logic;

public interface FbdeviceBasedLoginOperations {
    boolean isEmailInputPresent();

    boolean isPasswordInputPresent();

    boolean isInvalidEmailOrPhoneAlertPresent();

    boolean isLoginButtonPresent();
}
