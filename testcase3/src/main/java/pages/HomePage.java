package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By signUpLinkText = By.linkText("Signup / Login");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickSignUpLogin(){
        driver.findElement(signUpLinkText).click();
        return new LoginPage(driver);
    }


}
