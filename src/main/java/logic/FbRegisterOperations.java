package logic;

import model.FbUser;

public interface FbRegisterOperations {
    void fillForm(FbUser user);

    void submitForm();

    boolean isAlertWithTextPresent(String expectedText);

    void enterFbConfirmationCode(String code);
}
