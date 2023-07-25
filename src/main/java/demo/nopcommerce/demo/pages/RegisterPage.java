package demo.nopcommerce.demo.pages;

import demo.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyTextRegister;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']" )
    WebElement verifyFirstName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']" )
    WebElement verifyLastName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']" )
    WebElement verifyEmail;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']" )
    WebElement verifyPassword;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']" )
    WebElement verifyConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement female;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement typeFirstName;

    @CacheLookup
    @FindBy(xpath ="//input[@id='LastName']")
    WebElement typeLastName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth'])[1]")
    WebElement birthMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement birthYear;

    @CacheLookup
    @FindBy(xpath ="//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement typePassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement typeOnConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistrationText;



    public void clickOnRegister(){
        clickOnElement(registerLink);
        log.info("Click on register link : " + registerLink.toString());
    }
    public String verifyRegister(String result){
        result = getTextFromElement(verifyTextRegister);
        log.info("Verify with text : " + verifyTextRegister.toString());
        return result;
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
        log.info("Click on register button :" + registerButton);
    }
    public String verifyOnFirstName(String result){
        result = getTextFromElement(verifyFirstName);
        log.info("Verify firstname : " + verifyFirstName.toString());
        return result;
    }

    public String verifyOnLastName(String result){
        result = getTextFromElement(verifyLastName);
        log.info("Verify lastname : " + verifyLastName.toString());
        return result;
    }

    public String verifyOnEmail(String result){
        result = getTextFromElement(verifyEmail);
        log.info("Verify email : "+ verifyEmail.toString());
        return result;
    }

    public String verifyOnPassword(String result){
        result = getTextFromElement(verifyPassword);
        log.info("Verify password : " + verifyPassword.toString());
        return result;
    }

    public String verifyOnConfirmPassword(String result){
        result = getTextFromElement(verifyConfirmPassword);
        log.info("Verify Confirmpassword : " + verifyConfirmPassword.toString());
        return result;
    }
    public void clickOnFemale(){
        clickOnElement(female);
        log.info("Click on gender : " + female.toString());
    }
    public void firstNameField(String firstName){
        sendTextToElement(typeFirstName,firstName);
        log.info("Enter firstname : " + typeFirstName.toString());
    }

    public void lastNameField(String lastName){
        sendTextToElement(typeLastName,lastName);
        log.info("Enter lastname : "+ typeLastName.toString());
    }
    public void selectOnDay(String Day){
        selectByValueFromDropDown(birthDay,Day);
        log.info("Select birthday : " + birthDay.toString());
    }
    public void selectOnMonth(String Month){
        selectByValueFromDropDown(birthMonth,Month);
        log.info("Select Month :" + birthMonth.toString());

    }

    public  void selectOnYear(String Year){
       selectByValueFromDropDown(birthYear,Year);
       log.info("Select birthyear : " + birthYear.toString());
    }

    public void typeOnEmail(String typeEmailField){
        sendTextToElement(emailField,typeEmailField);
        log.info(" Enter email : " + emailField.toString());
    }

    public void typeOnPassword(String Password){
        sendTextToElement(typePassword,Password);
        log.info("Enter password : " + typePassword.toString());
    }

    public void typeConfirmPassword(String ConfirmPassword){
        sendTextToElement(typeOnConfirmPassword,ConfirmPassword);
        log.info("Enter Confirmpassword :" + typeOnConfirmPassword.toString());
    }

    public String verifyOnRegisterCompleted(String result){
        result = getTextFromElement(verifyRegistrationText);
        log.info("Verify registration completed : " + verifyRegistrationText.toString());
        return result;
    }



}
