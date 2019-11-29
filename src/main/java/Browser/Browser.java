package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().version("78.0.3904.105").setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().deleteAllCookies();
        return driver;
    }

    public static void quit() {
        if (driver != null)
            driver.close();
        driver = null;
    }

    public static boolean isBrowserOpen() {
        boolean isOpen;

        isOpen = driver != null;
        return isOpen;
    }
}
