import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

    WebDriver driver;

    private By productLink = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    public Products(WebDriver driver){
        this.driver=driver;
    }
    public void clickProductLink(){
        driver.findElement(productLink).click();
    }
}
