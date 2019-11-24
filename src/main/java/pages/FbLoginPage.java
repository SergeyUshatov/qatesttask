package pages;

import logic.AppManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FbLoginPage extends Page  {
    private static final Logger log = LogManager.getLogger(FbLoginPage.class);

    public FbLoginPage(AppManager appManager) {
        super(appManager);
    }
}
