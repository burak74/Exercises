import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base {
    WebDriver driver;
    Products products;
    HoversPage hoversPage;
    CartPage cartPage;



    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        products= new Products(driver);
        hoversPage = new HoversPage(driver);
        cartPage = new CartPage(driver);

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
