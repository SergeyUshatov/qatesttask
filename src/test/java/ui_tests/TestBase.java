package ui_tests;

import logic.AppManager;
import logicImpl.AppManagerImpl;
import org.testng.annotations.*;

public abstract class TestBase {
    protected AppManager app;

    @BeforeSuite
    public void init() {
        if (app == null){
            app = new AppManagerImpl();
        }
    }

    @BeforeTest
    public void beforeTest(){
        app.getWebDriverOperations().goTo("");
    }

    @BeforeMethod
    public void beforeMethod(){
        app.getWebDriverOperations().goTo("");
    }

    @AfterTest
    public void close(){
        app.getWebDriverOperations().stop();
    }
}
