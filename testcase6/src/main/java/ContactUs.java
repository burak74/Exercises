import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs {

    WebDriver driver;

    private By contactUsLinkText = By.linkText("Contact us");
    private By getInTouchText = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
    private By contactName = By.cssSelector("input[data-qa=\"name\"]");
    private By contactEmail= By.cssSelector("input[data-qa=\"email\"]");
    private By contactSubject =By.cssSelector("input[data-qa=\"subject\"]");
    private By contactMessage = By.cssSelector("textarea[data-qa=\"message\"]");
    private By uploadAFileButton = By.cssSelector("input[name=\"upload_file\"]");
    private By submitButton = By.cssSelector("input[name=\"submit\"]");
    private By succesText = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
    private By homeButton = By.xpath("//*[@id=\"form-section\"]/a");
    public ContactUs(WebDriver driver){
        this.driver=driver;
    }
    public void clickContactUs(){
        driver.findElement(contactUsLinkText).click();
    }
    public String getTouchText(){
        return driver.findElement(getInTouchText).getText();
    }
    public void setName(String name){
        driver.findElement(contactName).sendKeys(name);
    }
    public void setContactEmail(String email){
        driver.findElement(contactEmail).sendKeys(email);
    }
    public void setSubject(String subject){
        driver.findElement(contactSubject).sendKeys(subject);
    }
    public void setMessage(String message){
        driver.findElement(contactMessage).sendKeys(message);
    }
    public void upload(){
        driver.findElement(uploadAFileButton).sendKeys("/Users/vngrs/Desktop/resim.png");;
    }
    public void clickSubmit(){
        driver.findElement(submitButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public String getSuccessText(){
        return driver.findElement(succesText).getText();
    }
    public void clickHomeButton(){
        driver.findElement(homeButton).click();
    }
}
