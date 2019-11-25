package logic;

import model.FbUser;

public interface FbLoginOperations {
    void loginByEmailAs(FbUser fbUser);
}
