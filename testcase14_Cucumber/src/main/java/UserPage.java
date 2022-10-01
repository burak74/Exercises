import io.cucumber.java.ro.Si;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class UserPage {
    WebDriver driver;

    private By loggedInAsUser = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a");
    private By cartLink = By.linkText("Cart");
    private By proceedButton = By.cssSelector("#do_action > div.container > div > div > a");
    private By descriptionText = By.cssSelector("#ordermsg > textarea");
    private By placeOrderButton = By.cssSelector("#cart_items > div > div:nth-child(7) > a");

    public UserPage(WebDriver driver){
        this.driver = driver;
    }
    public String verifyUser(){
        return driver.findElement(loggedInAsUser).getText();
    }
    public void clickCart(){
        driver.findElement(cartLink).click();

    }
    public void clickProceed2Button(){
        driver.findElement(proceedButton).click();
    }
    public void fillDescription(String description){
        driver.findElement(descriptionText).sendKeys(description);
    }
    public void clickPlaceOrder(){
        driver.findElement(placeOrderButton).click();
    }

}
