import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void fillFirstInfo(){
        LoginPage loginPage = homepage.clickSignUp();
        loginPage.setEmail("brk01@gmail.com");
        loginPage.setUserName("burak");
        loginPage.clickSignUpButton();
    }
}
