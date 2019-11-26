package pages;

import logic.AppManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FbMainPage extends Page {
    private static final Logger log = LogManager.getLogger(FbMainPage.class);

    FbMainPage(AppManager appManager) {
        super(appManager);
    }

    private static final String mainContent = "//*[@id='mainContainer']";

    public boolean isMainContentPresent() {
        return webElementOperations.isElementPresent(mainContent);
    }
}
