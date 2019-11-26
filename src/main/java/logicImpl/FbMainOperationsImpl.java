package logicImpl;

import logic.AppManager;
import logic.FbMainOperations;

public class FbMainOperationsImpl extends DriverBasedOperations implements FbMainOperations {
    public FbMainOperationsImpl(AppManager appManager) {
        super(appManager);
    }

    @Override
    public boolean isMainContentPresent() {
        return pages.getFbMainPage().isMainContentPresent();
    }
}
