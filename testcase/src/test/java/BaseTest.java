import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;

    protected HomePage homepage;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        homepage = new HomePage(driver);
    }

    @AfterClass
    public void quitDriver(){
        driver.quit();
    }
}
