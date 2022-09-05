import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class SignUp{

    private WebDriver driver;

    private By gender = By.cssSelector("input[id=id_gender1]");
    private By password = By.cssSelector("input[id=password]");
    private By newsletter = By.id("newsletter");
    private By days = By.cssSelector("select[id = days]");
    private By months = By.cssSelector("select[id = months]");
    private By years = By.id("select[id = years]");
    private By firstName = By.cssSelector("input[data-qa=first_name]");
    private By lastName = By.cssSelector("input[data-qa=last_name]");
    private By company = By.cssSelector("input[data-qa=company]");
    private By firstAddress = By.cssSelector("input[data-qa=address]");
    private By secondAddress = By.cssSelector("input[data-qa=address2]");
    private By country = By.cssSelector("select[data-qa=\"country\"]");
    private By state = By.cssSelector("input[data-qa=\"state\"]");
    private By city = By.cssSelector("input[data-qa=\"city\"]");
    private By zipCode = By.cssSelector("input[data-qa=\"zipcode\"]");
    private By mobileNumber = By.cssSelector("input[data-qa=\"mobile_number\"]");
    private By createAccountButton = By.cssSelector("button[data-qa=\"create-account\"]");



    public SignUp(WebDriver driver){
        this.driver=driver;
    }

    public void pickGender(){
        driver.findElement(gender).click();
    }

    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void selectTheDay(String d){
        Select day= new Select(driver.findElement(days));
        day.selectByVisibleText(d);
    }

    public void selectTheMonth(String m){
        Select month = new Select(driver.findElement(months));
        month.selectByVisibleText(m);
    }
    public void selectTheYear(String y){
        Select year = new Select(driver.findElement(years));
        year.selectByVisibleText(y);
    }
    public void pickNewsletter(){
        driver.findElement(newsletter).click();
    }
    public void setFirstName(String first_name){
        driver.findElement(firstName).sendKeys(first_name);
    }
    public void setLastName(String last_name){
        driver.findElement(lastName).sendKeys(last_name);
    }
    public void setCompany(String company_){
        driver.findElement(company).sendKeys(company_);
    }
    public void setFirstAddress(String first_address){
        driver.findElement(firstAddress).sendKeys(first_address);
    }
    public void setSecondAddress(String second_address){
        driver.findElement(secondAddress).sendKeys(second_address);
    }
    public void selectCountry(String country1){
        Select country_ = new Select(driver.findElement(country));
        country_.selectByVisibleText(country1);
    }
    public void setState(String s){
        driver.findElement(state).sendKeys(s);
    }
    public void setCity(String c){
        driver.findElement(city).sendKeys(c);
    }
    public void setZipCode(String z){
        driver.findElement(zipCode).sendKeys(z);
    }
    public void setMobileNumber(String m){
        driver.findElement(mobileNumber).sendKeys(m);
    }
    public CreatedAccount clickCreateButton(){
        driver.findElement(createAccountButton).click();
        return new CreatedAccount(driver);
    }




}
