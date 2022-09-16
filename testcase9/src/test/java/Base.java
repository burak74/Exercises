import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base {

    WebDriver driver;
    Products products;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        products= new Products(driver);

    }
    @Test
    public void firstClick(){
        products.clickProductLink();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
