package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositPage {
    WebDriver driver;

    @FindBy(linkText = "Deposit")
    WebElement depositPageButton;
    @FindBy(name = "accountno")
    WebElement accountNo;
    @FindBy(name = "ammount")
    WebElement ammount;
    @FindBy(name = "desc")
    WebElement desc;
    @FindBy(name = "AccSubmit")
    WebElement submit;

    public DepositPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDepositPageBtn(){
        depositPageButton.click();
    }

    public void setAccountNo(String value) {
        accountNo.sendKeys(value);
    }

    public void setAmmount(String value) {
        ammount.sendKeys(value);
    }

    public void setDesc(String value) {
        desc.sendKeys(value);
    }

    public void submit() {
        submit.click();
    }
}