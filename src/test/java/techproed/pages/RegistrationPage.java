package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class RegistrationPage {
    public RegistrationPage() {
        //to instantiate the objects
        PageFactory.initElements(Driver.getDriver(), this);
    }

        //    Normal                                         Page object model
        //WebElement ssn = findElement(By.id("ssn")) ===> @findBy(id="ssn")
        //                                                public WebElement ssn;

    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy(name="firstname")
    public WebElement firstName;

    @FindBy(name="lastname")
    public WebElement lastname;

    @FindBy(name="address")
    public WebElement address;

    @FindBy(name="mobilephone")
    public WebElement phoneNumber;

    @FindBy(name="username")
    public WebElement userName;

    @FindBy(name="email")
    public WebElement email;

    @FindBy(name="firstPassword")
    public WebElement firstPassword;

    @FindBy(name="secondPassword")
    public WebElement secondPassword;

    @FindBy(id="register-submit")
    public WebElement registerButton;



}

