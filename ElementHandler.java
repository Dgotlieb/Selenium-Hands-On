import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementHandler {
    public static WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    public static void clickElement(By locator) {
        getWebElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }
}