package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccount {

    private WebDriver driver;

    private By deleteButton = By.cssSelector("button[class=\"btn btn-danger\"]");
    private By areYouSureText = By.cssSelector("h4[class=\"text-center\"]");
    public DeleteAccount(WebDriver driver){
        this.driver=driver;
    }

    public void clickDeleteButton(){
        driver.findElement(deleteButton).click();
    }

    public String getAreYouSureText(){
        return driver.findElement(areYouSureText).getText();
    }



}
