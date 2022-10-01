import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;
    private By firstProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]");
    private By addToCartButton = By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a");
    private By viewCartLink=By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getHomeTitle(){
        return driver.getTitle();
    }
    public void addFirstProduct() throws InterruptedException {
        WebElement product = driver.findElement(firstProduct);

        Actions actions = new Actions(driver);
        actions.moveToElement(product).build().perform();

        Thread.sleep(2000);

        WebElement element2 = driver.findElement(addToCartButton);
        actions.moveToElement(element2);
        actions.click().build().perform();
    }
    public void clickViewCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(viewCartLink).click();
    }
}
