package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;

    @Before
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static WebDriver getDriver() {
        driver = new ChromeDriver();
        return driver;
    }
}
