import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

public class MyStepdefs extends BaseTest{


    @Given("launch browser and land home page")
    public void launchBrowserAndLandHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);


    }

    @And("verify home page is visible")
    public void verifyHomePageIsVisible() {
        assertEquals(homePage.getHomeTitle(),"Automation Exercise","Wrong Page Title");
    }

    @When("add product")
    public void addProduct() throws InterruptedException {
        homePage.addFirstProduct();
    }

    @And("click cart button")
    public void clickCartButton() throws InterruptedException {
        homePage.clickViewCart();
    }

    @And("verify cart page")
    public void verifyCartPage() {
        assertEquals(cartPage.getCartTitle(),"Automation Exercise - Checkout","Wrong Page Title");
    }

    @Then("click x button for particular item to remove")
    public void clickXButtonForParticularItemToRemove() {
        cartPage.click_x_button();

    }
}
