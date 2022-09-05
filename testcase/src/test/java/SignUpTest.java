import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SignUpTest extends BaseTest{
    SignUp signUp;

    @Test
    public void fillCreateInfo(){

        signUp.pickGender();
        signUp.setPassword("1234");
        signUp.selectTheDay("1");
        signUp.selectTheMonth("November");
        signUp.selectTheYear("1997");
        signUp.pickNewsletter();
        signUp.setFirstName("Burak");
        signUp.setLastName("Alkan");
        signUp.setCompany("VNGRS");
        signUp.setFirstAddress("AAAAAAAAA");
        signUp.setSecondAddress("BBBBBBBBB");
        signUp.selectCountry("Canada");
        signUp.setState("Çukurova");
        signUp.setCity("Adana");
        signUp.setZipCode("01111");
        signUp.setMobileNumber("0239485923952");
        CreatedAccount createdAccount = signUp.clickCreateButton();
        assertEquals(createdAccount.getTextCreate(),"ACCOUNT CREATED!");




    }
}
