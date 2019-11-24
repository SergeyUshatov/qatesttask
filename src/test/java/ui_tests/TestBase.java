package ui_tests;

import logic.AppManager;
import logicImpl.AppManagerImpl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public abstract class TestBase {
    protected AppManager app;

    @BeforeSuite
    public void init() {
        if (app == null){
            app = new AppManagerImpl();
        }
    }

    @BeforeClass
    public void beforeClass(){
        app.getWebDriverOperations().getDriver();
    }

    @AfterClass
    public void close(){
        app.getWebDriverOperations().stop();
    }
}
