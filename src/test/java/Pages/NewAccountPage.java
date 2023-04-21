package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    WebDriver driver;

    @FindBy(linkText = "New Account")
    WebElement newAccountPageButton;
    @FindBy(name = "cusid")
    WebElement customerId;
    @FindBy(name = "inideposit")
    WebElement initDeposit;
    @FindBy(name = "button2")
    WebElement submit;

    public NewAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickNewAccountPageBtn(){
        newAccountPageButton.click();
    }

    public void setCustomerId(String value) {
        customerId.sendKeys(value);
    }

    public void setInitDeposit(String value) {
        initDeposit.sendKeys(value);
    }

    public void submit() {
        submit.click();
    }
}