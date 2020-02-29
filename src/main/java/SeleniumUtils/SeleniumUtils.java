package SeleniumUtils;

import Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SeleniumUtils {

    public void clickByLinkText(String selector) {
        Browser.getDriver().findElement(By.linkText(selector)).click();
    }

    public boolean isTextPresent (String text) {
        boolean textIsPresent = true;
        try {
            Browser.getDriver().findElement(By.xpath(String.format("//*[contains(text(),'%s')]", text)));
        } catch (NoSuchElementException E) {
            textIsPresent = false;
        }
        return textIsPresent;
    }

    public void enterText(String selector, String text) {
        Browser.getDriver().findElement(By.xpath(selector)).sendKeys(text);
    }

    public void enterTextById(String selector, String text) {
        Browser.getDriver().findElement(By.id(selector)).sendKeys(text);
    }

    public void click(String selector) {
        Browser.getDriver().findElement(By.xpath(selector)).click();
    }

    public void clickById(String selector) {
        Browser.getDriver().findElement(By.id(selector)).click();
    }
}
