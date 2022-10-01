import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;


public class MyStepdefs extends BaseTest{
    @Given("launch browser then landed home page")
    public void launchBrowserThenLandedHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        signupPage = new SignupPage(driver);
        userPage = new UserPage(driver);
        paymentPage = new PaymentPage(driver);

    }

    @And("verify landing the home page")
    public void verifyLandingTheHomePage() {
        assertEquals(homePage.getHomeTitle(),"Automation Exercise","Wrong Page Title");
    }

    @When("add products")
    public void addProducts() throws InterruptedException {
        homePage.addFirstProduct();
    }

    @And("click cart page")
    public void clickCartPage() throws InterruptedException {
        homePage.clickViewCart();
    }

    @Then("verify landing the cart page")
    public void verifyLandingTheCartPage() {
        assertEquals(cartPage.getCartTitle(),"Automation Exercise - Checkout","Wrong Page Title");

    }

    @Then("click proceed to checkout")
    public void clickProceedToCheckout() {
        cartPage.clickProceedButton();
    }

    @Then("click register login button")
    public void clickRegisterLoginButton() {
        cartPage.clickRegisterLoginButton();
    }

    @And("fill all details")
    public void fillAllDetails() {
        signupPage.fillName("burak");
        signupPage.fillEmail("burak6@email.com");
        signupPage.clickSignupButton();
        signupPage.pickGender();
        signupPage.setPassword("1234");
        signupPage.selectTheDay("1");
        signupPage.selectTheMonth("November");
        signupPage.selectTheYear("1997");
        signupPage.pickNewsletter();
        signupPage.setFirstName("burak");
        signupPage.setLastName("alkan");
        signupPage.setCompany("vngrs");
        signupPage.setFirstAddress("abc sokak");
        signupPage.setSecondAddress("abc sokak 2");
        signupPage.selectCountry("United States");
        signupPage.setState("California");
        signupPage.setCity("Adana");
        signupPage.setZipCode("0124");
        signupPage.setMobileNumber("1234556789");
        signupPage.clickCreateButton();

    }

    @And("verify creating account click continue")
    public void verifyCreatingAccountClickContinue() {
        assertEquals(signupPage.verifySuccessCreatedAccount(),"ACCOUNT CREATED!","ACCOUNT WAS NOT CREATED.");
        signupPage.clickContinueButton();

    }

    @Then("verify logged in as user")
    public void verifyLoggedInAsUser() {
        assertEquals(userPage.verifyUser(),"Logged in as burak","User not found");

    }

    @When("click cart button and click proceed to checkout")
    public void clickCartButton() {
        userPage.clickCart();
        userPage.clickProceed2Button();
    }
    @When("enter description comment and click place order")
    public void enterDescriptionCommentAndClickPlaceOrder() {
        userPage.fillDescription("2 gün içerisinde kargoda olursa sevinirim.");
        userPage.clickPlaceOrder();
    }

    @And("enter payment details")
    public void enterPaymentDetails() {
        paymentPage.setName("Burak");
        paymentPage.setNumber("1243243637");
        paymentPage.setCVC("123");
        paymentPage.setExpiration("11","2028");
    }

    @And("click pay and confirm")
    public void clickPayAndConfirm() {
        paymentPage.clickPay();
    }

    @And("verify success text")
    public void verifySuccessText() {
        assertEquals(paymentPage.verifyOrderPlaced(),"ORDER PLACED!","ORDER FAILED!");
    }

    @Then("verify account deleted")
    public void verifyAccountDeleted() {
        paymentPage.clickDeleteAccount();
        assertEquals(paymentPage.deleteAccountText(),"Delete Account","Account couldn't delete.");
        driver.quit();
    }
}
