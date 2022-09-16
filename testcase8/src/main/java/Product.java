import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product {

    WebDriver driver;

    private By productsLinkText = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    private By allProductText = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    private By viewProductLink = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    private By productNameText = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/img[1]");
    private By categoryText= By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");

    private By priceText = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span");
    private By availabilityText = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]");
    private By conditionText = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]");
    private By brandText = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]");

    public Product(WebDriver driver){
        this.driver=driver;
    }

    public void clickProducts(){
        driver.findElement(productsLinkText).click();
    }
    public String getAllProductTxt(){
       return driver.findElement(allProductText).getText();
    }
    public void clickViewProduct(){
        driver.findElement(viewProductLink).click();
    }
    public String getProductsName(){
        return driver.findElement(productNameText).getText();
    }
    public String getCategoryTxt(){
        return driver.findElement(categoryText).getText();
    }
    public String getPriceTxt(){
        return driver.findElement(priceText).getText();
    }
    public String getAvailabilityTxt(){
        return driver.findElement(availabilityText).getText();
    }
    public String getConditionTxt(){
        return driver.findElement(conditionText).getText();
    }
    public String getBrandTxt(){
        return driver.findElement(brandText).getText();
    }
}
