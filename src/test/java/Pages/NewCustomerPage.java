package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class NewCustomerPage {
    WebDriver driver;

    @FindBy(name = "name") WebElement name;
    @FindBy(name = "dob") WebElement dob;
    @FindBy(name = "addr") WebElement addr;
    @FindBy(name = "city") WebElement city;
    @FindBy(name = "state") WebElement state;
    @FindBy(name = "pinno") WebElement pinno;
    @FindBy(name = "telephoneno") WebElement telephoneno;
    @FindBy(name = "emailid") WebElement emailid;
    @FindBy(name = "password") WebElement password;
    @FindBy(name = "sub") WebElement sub;

    public String URL = "https://demo.guru99.com/v4/manager/addcustomerpage.php";

    public NewCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setName(String text) {
        name.sendKeys(text);
    }
    public void setDob(String text) {
        dob.sendKeys(text);
    }
    public void setAddr(String text) {
        addr.sendKeys(text);
    }
    public void setCity(String text) {
        city.sendKeys(text);
    }
    public void setState(String text) {
        state.sendKeys(text);
    }
    public void setPinno(String text) {
        pinno.sendKeys(text);
    }
    public void setTelephoneno(String text) {
        telephoneno.sendKeys(text);
    }
    public void setEmailid(String text) {
        emailid.sendKeys(text);
    }
    public void setPassword(String text) {
        password.sendKeys(text);
    }

    public void clickSubmit(){
        sub.click();
    }
}