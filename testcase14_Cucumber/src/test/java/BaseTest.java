import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    WebDriver driver;
    HomePage homePage;
    CartPage cartPage;
    SignupPage signupPage;
    UserPage userPage;
    PaymentPage paymentPage;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        signupPage = new SignupPage(driver);
        userPage = new UserPage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
