package com.nopcommerce.demo.cucumber.steps;


import demo.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import demo.nopcommerce.demo.pages.ComputerPage;
import demo.nopcommerce.demo.pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class ComputerPageSteps {


    @Given("I click on Computer tab")
    public void iClickOnComputerTab(){
        new ComputerPage().clickOnComputerTab();
    }

        @When("I verify <{string}> text")
        public void iVerifyText(String result) {
        new ComputerPage().verifyTextOnComputer(result);
        }

        @And("I Click on Desktops link")
        public void iClickOnDesktopsLink() {
        new DesktopPage().clickOnDesktopLink();
        }

        @And("I Click on product name {string}")
        public void iClickOnProductName() {
            String expectedMessage = "Desktops";
            String actualMessage = new DesktopPage().verifyOnDesktop("Desktops");
            Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

        }

        @And("I Select processor {string}")
        public void iSelectProcessor(String Processor) {
        new BuildYourOwnComputerPage().selectProcessor("processor");
        }

        @And("I Select RAM {string}")
        public void iSelectRAM(String Ram) {
        new BuildYourOwnComputerPage().selectRam("ram");
        }

        @And("I Select HDD {string}")
        public void iSelectHDD() {
        new BuildYourOwnComputerPage().clickOnHdd();
        }

        @And("I Select OS {string}")
        public void iSelectOS() {
        new BuildYourOwnComputerPage().clickOnOS();
        }

        @And("I Select Software {string}")
        public void iSelectSoftware() {
        new BuildYourOwnComputerPage().clickOnSoftware();
        }

        @And("I Click on {string} Button")
        public void iClickOnButton(String arg0) {
        new BuildYourOwnComputerPage().clickOnAddCart();
        }

        @Then("I Verify message {string}")
        public void iVerifyMessage(String result) {
            String expectedMessage = "The product has been added to your shopping cart";
            String actualMessage = new BuildYourOwnComputerPage().verifyShoppingCart(result);
            Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

        }
    }












//    @Test
//    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
//
//        //Click on Computer tab
//        computer.clickOnComputerTab();
//        //Verify "Computer" text
//        Assert.assertEquals("Computers",computer.verifyTextOnComputer(),"Message not displayed");
//
//    }
//    @Test
//    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
//
//        //Click on Computer tab
//        computer.clickOnComputerTab();
//        //Click on Desktops link
//        desktop.clickOnDesktopLink();
//        //Verify "Desktops" text
//        Assert.assertEquals("Desktops",desktop.verifyOnDesktop(),"Message not displayed");
//
//    }
//    @Test
//    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
//
//        //Click on Computer tab
//        computer.clickOnComputerTab();
//        //Click on Desktops link
//        desktop.clickOnDesktopLink();
//        //Click on product name "Build your own computer"
//        buildYourOwn.clickOnBuildYourOwnComputer();
//        //Select processor "processor"
//        buildYourOwn.selectProcessor(processor);
//        //Select RAM "ram"
//        buildYourOwn.selectRam(ram);
//        //Select HDD "hdd"
//        buildYourOwn.clickOnHdd();
//        //Select OS "os"
//        buildYourOwn.clickOnOS();
//        //Select Software "software"
//        buildYourOwn.clickOnSoftware();
//        //Click on "ADD TO CART" Button
//        buildYourOwn.clickOnAddCart();
//        //Verify message "The product has been added to your shopping cart"
//        Assert.assertEquals("The product has been added to your shopping cart",buildYourOwn.verifyShoppingCart(),"Message not displayed");
//
//
//
//    }
//}
