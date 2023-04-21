package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(linkText = "New Customer")
    WebElement newCustomerPageButton;

    public String URL = "https://demo.guru99.com/v4/manager/Managerhomepage.php";

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NewCustomerPage clickNewCustomerPageBtn(){
        System.out.println(newCustomerPageButton);
        newCustomerPageButton.click();
        return new NewCustomerPage(driver);
    }
}