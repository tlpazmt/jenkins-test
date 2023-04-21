package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
    WebDriver driver;

    @Test
    @Parameters({"browserName"})
    public void test(@Optional("Chrome") String browserName) {
        if (browserName.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4");
        driver.quit();
    }
}
