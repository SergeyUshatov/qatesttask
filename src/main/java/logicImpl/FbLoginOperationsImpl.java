package logicImpl;

import logic.AppManager;
import logic.FbLoginOperations;

public class FbLoginOperationsImpl extends DriverBasedOperations implements FbLoginOperations {
    public FbLoginOperationsImpl(AppManager appManager) {
        super(appManager);
    }
}
