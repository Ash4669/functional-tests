package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;


    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().version("78.0.3904.105").setup();
        driver = new ChromeDriver();
        return driver;
    }
}
