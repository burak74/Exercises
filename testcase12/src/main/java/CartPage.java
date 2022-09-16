import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    private By firstProduct = By.xpath("//*[@id=\"product-1\"]/td[2]/h4/a");
    private By secondProduct = By.xpath("//*[@id=\"product-2\"]/td[2]/h4/a");
    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    public String getFirstProductName(){
        return driver.findElement(firstProduct).getText();
    }
    public String getSecondProductName(){
        return driver.findElement(secondProduct).getText();
    }
}
