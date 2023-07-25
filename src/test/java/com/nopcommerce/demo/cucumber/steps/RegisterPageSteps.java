package com.nopcommerce.demo.cucumber.steps;


import demo.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterPageSteps {


    @Given("I Click on Register Link")
    public void iClickOnRegisterLink() {
    new RegisterPage().clickOnRegister();
    }

    @When("I Verify {string} text")
    public void iVerifyText(String result) {
        String expectedMessage = "Register";
        String actualMessage = new RegisterPage().verifyRegister(result);
        Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

    }

    @When("I Click on {string} button")
    public void iClickOnButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I Verify the error message {string}")
    public void iVerifyTheErrorMessage(String result) {
        String expectedMessage = "First name is required.";
        String actualMessage = new RegisterPage().verifyOnFirstName(result);
        Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

    }

    @When("I Select gender {string}")
    public void iSelectGender() {
        new RegisterPage().clickOnFemale();
    }

    @And("I Enter {string}")
    public void iEnter(String firstname) {
        new RegisterPage().firstNameField(firstname);
    }

    @And("I Select {string}")
    public void iSelect(String lastname) {
        new RegisterPage().lastNameField(lastname);
    }

}

//    @Test
//    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
//
//        //Click on Register Link
//        register.clickOnRegister();
//       // Verify "Register" text
//        Assert.assertEquals("Register",register.verifyRegister(),"Message not displayed");
//    }
//
//    @Test
//    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
//
//        //Click on Register Link
//        register.clickOnRegister();
//        //Click on "REGISTER" button
//        register.clickOnRegisterButton();
//        //Verify the error message "First name is required."
//        Assert.assertEquals("First name is required.",register.verifyOnFirstName(),"Message not displayed");
//        //Verify the error message "Last name is required."
//        Assert.assertEquals("Last name is required.",register.verifyOnLastName(),"Message not displayed");
//        //Verify the error message "Email is required."
//        Assert.assertEquals("Email is required.",register.verifyOnEmail(),"Message not displayed");
//        //Verify the error message "Password is required."
//        Assert.assertEquals("Password is required.",register.verifyOnPassword(),"Message not displayed");
//        //Verify the error message "Password is required."
//        Assert.assertEquals("Password is required.",register.verifyOnConfirmPassword(),"Message not displayed");
//    }
//
//    @Test
//    public void VerifyThatUserShouldCreateAccountSuccessfully(){
//
//        //Click on Register Link
//        register.clickOnRegister();
//        //Select gender "Female"
//        register.clickOnFemale();
//        //Enter firstname
//        register.firstNameField("Tina");
//        //Enter lastname
//        register.lastNameField("Pathak");
//        // Select day
//        register.selectOnDay("1");
//        //Select month
//        register.selectOnMonth("January");
//        //Select year
//        register.selectOnYear("1913");
//        //Enter email
//        register.typeOnEmail("tinaP@gmail.com");
//        //Enter password
//        register.typeOnPassword("tina123");
//        //Enter Confirm Password
//        register.typeConfirmPassword("tina123");
//        //Click on "REGISTER" button
//        register.clickOnRegisterButton();
//        //Verify message "Your registration completed"
//        Assert.assertEquals("Your registration completed",register.verifyOnRegisterCompleted(),"Message not displayed");
//
//    }

