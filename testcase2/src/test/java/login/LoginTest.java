package login;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DeleteAccount;
import pages.HomePage;
import pages.LoginPage;
import pages.SuccessLogin;
import static org.testng.Assert.*;

public class LoginTest extends BaseTest {


    @Test
    public void loginInfo(){

        LoginPage loginPage = homePage.clickSignupLink();
        assertEquals(loginPage.loginAccountTest(),"Login to your account","ERROR!");
        loginPage.setLoginEmail("brkalkn74@gmail.com");
        loginPage.setPassword("1234");
        SuccessLogin successLogin= loginPage.clickLoginButton();
        assertEquals(loginPage.getLoggedInAsText(),"","ERROR!");
        DeleteAccount deleteAccount = successLogin.clickdeleteAccountLink();
        deleteAccount.clickDeleteButton();






    }
}
