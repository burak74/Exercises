import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    private By proceedToCheckoutButton = By.cssSelector("#do_action > div.container > div > div > a");
    private By registerLogin = By.cssSelector("#checkoutModal > div > div > div.modal-body > p:nth-child(2) > a");
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getCartTitle(){
        return driver.getTitle();
    }

    public void clickProceedButton(){
        driver.findElement(proceedToCheckoutButton).click();
    }
    public void clickRegisterLoginButton(){
        driver.findElement(registerLogin).click();
    }


}
