import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private By signUpLink = By.linkText("Signup / Login");

    public LoginPage clickSignUp(){
        driver.findElement(signUpLink).click();
        return new LoginPage(driver);
    }
}
