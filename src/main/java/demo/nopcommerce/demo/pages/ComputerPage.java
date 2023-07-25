package demo.nopcommerce.demo.pages;

import demo.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement verifyComputer;

    public void clickOnComputerTab(){
        clickOnElement(computerTab);
        log.info("Click on Computer tab :" + computerTab.toString());
    }

    public String verifyTextOnComputer(String result){
        result = getTextFromElement(verifyComputer);
        log.info("Verify text computer : " + verifyComputer.toString());
        return result;
    }
}
