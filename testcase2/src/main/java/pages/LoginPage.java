package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By loginEmail = By.cssSelector("input[data-qa=\"login-email\"]");
    private By loginPassword = By.cssSelector("input[data-qa=\"login-password\"]");
    private By loginButton = By.cssSelector("button[data-qa=\"login-button\"]");
    private By loggedInAs = By.cssSelector("i[class=\"fa fa-user\"]");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setLoginEmail(String email){
        driver.findElement(loginEmail).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(loginPassword).sendKeys(password);
    }
    public SuccessLogin clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SuccessLogin(driver);
    }
    public String loginAccountTest(){
        return driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")).getText();
    }
    public String getLoggedInAsText(){
        return driver.findElement(loggedInAs).getText();
    }
}
