import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base {

    WebDriver driver;
    Product product;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        product = new Product(driver);

    }

    @Test
    public void firstLink(){
        product.clickProducts();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
