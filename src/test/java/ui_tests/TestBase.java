package ui_tests;

import logic.AppManager;
import logicImpl.AppManagerImpl;
import org.testng.annotations.*;

public abstract class TestBase {
    private AppManager app;

    @BeforeTest
    synchronized public void init() {
        getApp().getWebDriverOperations().start();
    }

    @BeforeMethod
    synchronized public void before(){
        getApp().getWebDriverOperations().goTo("");
    }

    @AfterTest
    synchronized public void close(){
        getApp().getWebDriverOperations().stop();
    }

    protected AppManager getApp() {
        if (app == null){
            app = new AppManagerImpl();
        }
        return app;
    }
}
