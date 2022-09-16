import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By firstProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]");
    private By secondProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]");
    private By addToCartButton = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a");
    private By addToCartButton2=By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a");
    private By continueButton = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
    private By viewCartLink=By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
    public HoversPage(WebDriver driver){
        this.driver=driver;
    }

    public void hoverOverToProduct(){
        WebElement product = driver.findElement(firstProduct);

        Actions actions = new Actions(driver);
        actions.moveToElement(product).build().perform();

        WebElement element2 = driver.findElement(addToCartButton);
        actions.moveToElement(element2);
        actions.click().build().perform();
    }
    public void hoverOverToSecondProduct(){
        WebElement product = driver.findElement(secondProduct);

        Actions actions = new Actions(driver);
        actions.moveToElement(product).build().perform();

        WebElement element3 = driver.findElement(addToCartButton2);
        actions.moveToElement(element3);
        actions.click().build().perform();

    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public void clickViewCart(){
        driver.findElement(viewCartLink).click();
    }
    public void clickAddToCart(){
        driver.findElement(addToCartButton).click();
    }
    public void clickAddToCart2(){
        driver.findElement(addToCartButton2).click();
    }
    /*public class Product{
        private WebElement element;
        private By overlayClass = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a");


        public Product(WebElement element){
            this.element=element;
        }

        public void clickAddToCart(){
            Actions actions = new Actions(driver);
            WebElement element1 = driver.findElement(overlayClass);
            actions.moveToElement(element1).click().build().perform();
        }
    }*/

}
