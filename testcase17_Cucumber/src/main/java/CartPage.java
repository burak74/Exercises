import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {


    WebDriver driver;

    private By xButton = By.cssSelector("#product-1 > td.cart_delete > a > i");
    private By isEmptyText = By.xpath("//*[@id=\"empty_cart\"]/p/b");
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getCartTitle(){
        return driver.getTitle();
    }

    public void click_x_button(){
        driver.findElement(xButton).click();
        driver.quit();
    }
}
