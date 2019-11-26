package logic;

import java.util.List;

public interface WebElementOperations {
    boolean click(String xpath);

    boolean selectValueByText(String locator, String value);

    List<String> getTextListFromElementsList(String locator);

    void clearInputAndEnterText(String xpath, String text);

    boolean isElementPresent(String xpath);

    boolean isElementWithTextPresent(String text);

    boolean selectValueByIndex(String xpath, int index);
}
