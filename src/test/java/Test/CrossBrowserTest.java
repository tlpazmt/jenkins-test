package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class CrossBrowserTest {
    WebDriver driver;

    @Test
    @Parameters({"browserName"})
    public void test(@Optional("Chrome") String browserName) {
        if (browserName.equals("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-gpu"); // applicable to windows os only
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.addArguments("--no-sandbox"); // Bypass OS security model
            driver = new ChromeDriver(options);
        } else if (browserName.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4");
        driver.quit();
    }
}
