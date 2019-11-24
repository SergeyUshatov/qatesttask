package logicImpl;

import logic.AppManager;
import logic.WebElementOperations;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FbLoginPage;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WebElementOperationsImpl implements WebElementOperations {

    private static final Logger log = LogManager.getLogger(FbLoginPage.class);
    private static final String ERROR_ON_CLICKING_ON_ELEMENT = "Error on element click. ";
    private static final String ERROR_ON_SELECTING_AN_ELEMENT = "Error on selecting an item. ";

    private WebDriver driver;
    private WebDriverWait wait;

    private WebElement byXpath(String xpath) {
        log.debug("Searching an element by xpath=" + xpath);
        WebElement element = driver.findElement(By.xpath(xpath));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    WebElementOperationsImpl(AppManager appManager) {
        driver = appManager.getWebDriverOperations().getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Override
    public boolean click(String xpath) {
        try {
            WebElement element = byXpath(xpath);
            log.info("Clicking on element with xpath=" + xpath);
            element.click();
            return true;
        } catch (Exception e) {
            log.error(ERROR_ON_CLICKING_ON_ELEMENT + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean selectValueByText(String locator, String value) {
        try {
            WebElement element = byXpath(locator);
            Select select = new Select(element);
            log.info("Selecting value=" + value + " element selection");
            select.selectByVisibleText(value);
        } catch (Exception e) {
            log.error(ERROR_ON_SELECTING_AN_ELEMENT + e.getMessage());
        }
        return false;
    }

    @Override
    public List<String> getTextListFromElementsList(String locator) {
        List<WebElement> webElementList = driver.findElements(By.xpath(locator));
        return webElementList.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
