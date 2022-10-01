import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    WebDriver driver;


    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }

    private By nameOnCard = By.cssSelector("#payment-form > div:nth-child(2) > div > input");
    private By cardNumber = By.cssSelector("#payment-form > div:nth-child(3) > div > input");
    private By CVC = By.cssSelector("#payment-form > div:nth-child(4) > div.col-sm-4.form-group.cvc > input");
    private By expirationMonth = By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(2) > input");
    private By expirationYear = By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(3) > input");
    private By payAndConfirmButton = By.cssSelector("#submit");
    private By orderPlaced = By.cssSelector("#form > div > div > div > h2 > b");
    private By deleteAccount = By.linkText("Delete Account");
    private By verifyDeleteAccount = By.cssSelector("#content > div.content-main > div.page-header > h1");
    public void setName(String name){
        driver.findElement(nameOnCard).sendKeys(name);
    }
    public void setNumber(String number){
        driver.findElement(cardNumber).sendKeys(number);
    }
    public void setCVC(String cvc){
        driver.findElement(CVC).sendKeys(cvc);
    }
    public void setExpiration(String month,String year){
        driver.findElement(expirationMonth).sendKeys(month);
        driver.findElement(expirationYear).sendKeys(year);
    }
    public void clickPay(){
        driver.findElement(payAndConfirmButton).click();
    }
    public String verifyOrderPlaced(){
        return driver.findElement(orderPlaced).getText();
    }
    public void clickDeleteAccount(){
        driver.findElement(deleteAccount).click();
    }
    public String deleteAccountText(){
        return driver.findElement(deleteAccount).getText();

    }
}
