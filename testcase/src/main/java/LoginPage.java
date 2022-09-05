import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private WebDriver driver;

    private By signUpLinkText = By.cssSelector("a[href = \"/login\"]");
    private By userName = By.cssSelector("input[data-qa=\"signup-name\"]");

    private By email = By.cssSelector("input[data-qa=\"signup-email\"]");
    private By signUpButton = By.cssSelector("button[data-qa =\"signup-button\"]");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickSignUpLink(){
        driver.findElement(signUpLinkText).click();
    }
    public void setUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }
    public void setEmail(String eMail){
        driver.findElement(email).sendKeys(eMail);
    }
    public SignUp clickSignUpButton(){
        driver.findElement(signUpButton).click();
        return new SignUp(driver);
    }



}
