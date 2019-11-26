package logic;

import model.FbUser;

public interface FbRegisterOperations {
    void fillForm(FbUser user);

    void submitForm();
}
