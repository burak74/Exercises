package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    private By signUpLinkText = By.linkText("Signup / Login");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickSignupLink(){
        driver.findElement(signUpLinkText).click();
        return new LoginPage(driver);
    }
}
