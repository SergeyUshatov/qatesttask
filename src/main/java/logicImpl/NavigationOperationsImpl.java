package logicImpl;

import logic.AppManager;
import logic.NavigationOperations;

public class NavigationOperationsImpl implements NavigationOperations {

    private AppManager appManager;

    NavigationOperationsImpl(AppManager appManager) {
        this.appManager = appManager;
    }

}
