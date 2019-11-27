package logicImpl;

import logic.AppManager;
import logic.FbMainOperations;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FbMainOperationsImpl extends DriverBasedOperations implements FbMainOperations {
    public FbMainOperationsImpl(AppManager appManager) {
        super(appManager);
    }

    @Override
    public boolean isMainContentPresent() {
        return pages.getFbMainPage().isMainContentPresent();
    }

    @Override
    public void logout() {
        // todo implement
        throw new NotImplementedException();
    }
}
