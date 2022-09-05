package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By verifyText = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");
    private By userEmail = By.cssSelector("input[data-qa=\"login-email\"]");
    private By password = By.cssSelector("input[data-qa=\"login-password\"]");
    private By loginButton = By.cssSelector("button[data-qa=\"login-button\"]");
    private By verifySecondText = By.cssSelector("p[style]");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public String getTxtToVerify(){
        return driver.findElement(verifyText).getText();
    }
    public void setUserEmail(String email){
        driver.findElement(userEmail).sendKeys(email);
    }
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public String getTxtToVerify2(){
        return driver.findElement(verifySecondText).getText();
    }


}
