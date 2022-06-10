package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static int timeout = 5;

    private Driver() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigReader.get("browser");
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                   // driver = new ChromeDriver();
                ChromeOptions ops = new ChromeOptions();
                ops.addArguments("--disable-notifications");
                //System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
                driver = new ChromeDriver(ops);
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("ie".equals(browser)) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else if ("safari".equals(browser)) {
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driver = new SafariDriver();
            } else if ("chrome-headless".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            }
        }


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }
}
