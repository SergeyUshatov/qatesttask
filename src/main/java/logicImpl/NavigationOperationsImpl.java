package logicImpl;

import logic.AppManager;
import logic.NavigationOperations;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class NavigationOperationsImpl implements NavigationOperations {

    private AppManager appManager;

    NavigationOperationsImpl(AppManager appManager) {
        this.appManager = appManager;
    }

    @Override
    public void goToSettings() {
        // todo implement navigation to settings
        return;
    }
}
