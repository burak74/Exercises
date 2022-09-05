package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessLogin {

    WebDriver driver;

    private By deleteAccountLinkText = By.cssSelector("i[class=\"fa fa-trash-o\"]");


    public SuccessLogin(WebDriver driver){
        this.driver=driver;
    }

    public DeleteAccount clickdeleteAccountLink(){
        driver.findElement(deleteAccountLinkText).click();
        return new DeleteAccount(driver);
    }


}
