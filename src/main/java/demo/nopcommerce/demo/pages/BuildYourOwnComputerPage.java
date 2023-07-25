package demo.nopcommerce.demo.pages;

import demo.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath ="//input[@name='product_attribute_3']" )
    WebElement clickhdd;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement os;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='option-list']")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyText;

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
        log.info("Build your own computer : "+ buildYourOwnComputer.toString());
    }
    public void selectProcessor(String Processor){
        selectByValueFromDropDown(processor,Processor);
        log.info("selcet processor :"+ processor.toString());
    }
    public void selectRam(String Ram){
        selectByValueFromDropDown(ram,Ram);
        log.info("select ram : " + ram.toString());
    }

    public void clickOnHdd(){
       clickOnElement(clickhdd);
       log.info("Click on hdd : " + clickhdd.toString());
    }
    public void clickOnOS(){
        clickOnElement(os);
        log.info("Select os : "+ os.toString());
    }
    public void clickOnSoftware(){
        clickOnElement(software);
        log.info("Click on software : " + software.toString());
    }
    public void clickOnAddCart(){
        clickOnElement(addToCart);
        log.info("Add to Cart :"+ addToCart.toString());
    }
    public String verifyShoppingCart(String result){
        result = getTextFromElement(verifyText);
        log.info("Get text from : "+ verifyText.toString());
        return result;
    }


}
