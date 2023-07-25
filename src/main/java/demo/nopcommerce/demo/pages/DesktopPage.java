package demo.nopcommerce.demo.pages;

import demo.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement verifyDesktop;


    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
        log.info("Click on Desktop link :" + desktopLink.toString());
    }
    public String verifyOnDesktop(String result){
        result = getTextFromElement(verifyDesktop);
        log.info("Verify text Desktop :" + verifyDesktop.toString());
        return result;
    }
}
