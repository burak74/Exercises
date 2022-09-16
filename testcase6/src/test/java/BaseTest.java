import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class BaseTest {

    WebDriver driver;
    ContactUs contactUs;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        contactUs = new ContactUs(driver);
    }
    @Test
    public void firstLink(){
        contactUs.clickContactUs();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
