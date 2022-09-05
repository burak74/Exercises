import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatedAccount {

    private WebDriver driver;
    private By continueButton = By.cssSelector("a[data-qa = continue-button]");
    private By textCreate = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");

    public CreatedAccount(WebDriver driver) {
        this.driver = driver;
    }

    public CreatedAccount clickcontinueButton() {
        driver.findElement(continueButton).click();
        return new CreatedAccount(driver);
    }

    public String getTextCreate() {
        return driver.findElement(textCreate).getText();
    }
}
