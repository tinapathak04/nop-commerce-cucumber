package com.nopcommerce.demo.cucumber.steps;

import demo.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {

    @Given("Click on login link")
    public void clickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @When("verify that {string} message display")
    public void verifyThatMessageDisplay(String result) {
        String expectedMessage = "Log in";
        String actualMessage = new LoginPage().verifyByLoginLink(result);
        Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

    }

    @Given("I Click on login link")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @When("I Enter EmailId")
    public void iEnterEmailId(String EmailId) {
        new LoginPage().enterEmail(EmailId);
    }

    @And("I Enter Password")
    public void iEnterPassword(String Password) {
        new LoginPage().enterPassword(Password);
    }

    @And("I Click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I Verify that the Error message")
    public void iVerifyThatTheErrorMessage(String result) {
        String expectedMessage = "No customer account found";
        String actualMessage = new LoginPage().verifyErrorMessage(result);
        Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");


    }

    @Then("I Verify that LogOut link is display")
    public void iVerifyThatLogOutLinkIsDisplay(String result) {
        String expectedMessage = "Log Out";
        String actualMessage =new LoginPage().verifyLogOutLink(result);
        Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

    }

    @And("I Click on LogOut Link")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogout();
    }

    @Then("I Verify that LogIn Link Display")
    public void iVerifyThatLogInLinkDisplay(String result) {
        new LoginPage().verifyByLoginLink(result);
    }
}
