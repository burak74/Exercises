import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

    WebDriver driver;

    private By productLink = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    private By allProductsTxt = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    private By searchText = By.cssSelector("input[id=\"search_product\"]");
    private By searchSubmit = By.cssSelector("button[id=\"submit_search\"]");
    private By searchedProductsTxt = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");


    public Products(WebDriver driver){
        this.driver=driver;
    }

    public void clickProductLink(){
        driver.findElement(productLink).click();
    }
    public String getAllProductTxt(){
        return driver.findElement(allProductsTxt).getText();
    }
    public void fillTextBox(String productName){
        driver.findElement(searchText).sendKeys(productName);
    }
    public void clickSearch(){
        driver.findElement(searchSubmit).click();
    }
    public String getSearchedProductsTxt(){
        return driver.findElement(searchedProductsTxt).getText();
    }
}
