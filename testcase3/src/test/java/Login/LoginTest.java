package Login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert.*;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void incorretLogin(){

        LoginPage loginPage = homePage.clickSignUpLogin();
        assertEquals(loginPage.getTxtToVerify(),"Login to your account","Error!");
        loginPage.setUserEmail("1234@ggg.com");
        loginPage.setPassword("1234");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getTxtToVerify2(),"Your email or password is incorrect!","Error!");
    }





}
