package logicImpl;

import logic.AppManager;
import logic.FbSettingsOperations;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FbSettingsOperationsImpl extends DriverBasedOperations implements FbSettingsOperations {
    public FbSettingsOperationsImpl(AppManager appManager) {
        super(appManager);
    }

    @Override
    public void updatePasswordWith(String newPassword) {
        // todo implement
        throw new NotImplementedException();
    }
}
