package logicImpl;

import logic.WebDriverOperations;
import org.openqa.selenium.WebDriver;
import utils.PropertyLoader;
import webdriver.WebDriverFactory;

public class WebDriverOperationsImpl implements WebDriverOperations {
    private WebDriver driver;
    private String baseUrl;

    WebDriverOperationsImpl() {
        driver = getDriver();
        baseUrl = getBaseUrl();
    }

    private String getBaseUrl() {
        if(baseUrl == null){
            baseUrl = PropertyLoader.loadProperty("site.url");
        }
        return baseUrl;
    }

    @Override
    public void stop() {
        if (driver != null)
            driver.quit();
    }

    @Override
    public void goTo(String url) {
        getDriver().navigate().to(getBaseUrl() + url);
    }

    @Override
    synchronized public WebDriver getDriver() {
        if (driver == null) {
            driver = WebDriverFactory.getInstance(PropertyLoader.loadProperty("browser.name"));
        }
        return driver;
    }

    @Override
    public String currentUrl() {
        return getDriver().getCurrentUrl();
    }

    @Override
    public void start() {
        getDriver();
    }


}
