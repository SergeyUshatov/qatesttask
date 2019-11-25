package logic;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.regex.Pattern;

public interface WebElementOperations {
    boolean click(String xpath);

    boolean selectValueByText(String locator, String value);

    List<String> getTextListFromElementsList(String locator);

    void clearInputAndEnterText(WebElement webElement, String text);

    void clickOn(WebElement webElement);

    boolean isElementPresent(WebElement webElement);

    boolean isElementWithTextPresent(String text);
}
