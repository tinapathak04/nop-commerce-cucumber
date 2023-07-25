package demo.nopcommerce.demo.pages;

import demo.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement typeEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement typePassword;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement logButton;

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'No customer account found')]")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement verifyLoginLink;


    public void clickOnLoginLink(){
       clickOnElement(loginLink);
       log.info("Click on Login link: "+ loginLink.toString());
    }
    public String verifyOnWelcome(String result){
        result = getTextFromElement(verifyWelcomeText);
        log.info("Verify welcome : " + verifyWelcomeText.toString());
        return result;
    }
    public void enterEmail(String Email){
        sendTextToElement(typeEmail,Email);
        log.info("Enter email :" + typeEmail.toString());
    }
    public void enterPassword(String Password){
        sendTextToElement(typePassword,Password);
        log.info("Enter password : "+ typePassword.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(logButton);
        log.info("Click on login button :" + logButton.toString());
    }
    public String verifyErrorMessage(String result){
        result = getTextFromElement(errorMessage);
        log.info("Verify error message :" + errorMessage.toString());
        return result;
    }
    public String verifyLogOutLink(String result){
        result = getTextFromElement(logOutLink);
        log.info("Verify logout link : " + logOutLink.toString());
        return result;
    }
    public void clickOnLogout(){
        clickOnElement(logout);
        log.info("Click on logout : " + logout.toString());
    }
    public String verifyByLoginLink(String result){
        result = getTextFromElement(verifyLoginLink);
        log.info("Verify With Login link : " + verifyLoginLink.toString());
        return result;
    }

}
