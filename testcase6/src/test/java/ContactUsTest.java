import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ContactUsTest extends BaseTest{


    @Test
    public void contactUsForm(){
        assertEquals(contactUs.getTouchText(),"GET IN TOUCH","WRONG TEXT");
        contactUs.setName("Burak");
        contactUs.setContactEmail("brkalkn74@gmail.com");
        contactUs.setSubject("product cart");
        contactUs.setMessage("i can not add multiple product to my cart");
        contactUs.upload();
        contactUs.clickSubmit();
        assertEquals(contactUs.getSuccessText(),"Success! Your details have been submitted successfully.","Wrong Text");
        contactUs.clickHomeButton();
    }
}
