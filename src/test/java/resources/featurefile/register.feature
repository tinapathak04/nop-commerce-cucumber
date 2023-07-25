@regression
Feature: Register


  Scenario: user should navigate to register page successfully
   Given I Click on Register Link
   When I Verify "Register" text

@smoke
  Scenario: User should verify that firstname, lastname, email ,password And confirm password fields are mandatory
   Given  I Click on Register Link
   When  I Click on "REGISTER" button
   And I Verify the error message "First name is required."
   And I Verify the error message "Last name is required."
   And I Verify the error message "Email is required."
   And I Verify the error message "Password is required."
   Then I Verify the error message "Password is required."

@sanity
  Scenario Outline: Verify that user should create account successfully
    Given I Click on Register Link
    When I Select "<gender>"
   And I Enter "<firstname>"
   And I Enter "<lastname>"
   And I Select "<day>"
   And I Select "<month>"
   And I Select "<year>"
   And I Enter "<email>"
   And I Enter "<password>"
   And I Enter "<Confirm Password>"
   And I Click on "REGISTER" button
   Then I Verify message "Your registration completed"

  Examples:
   |  gender | firstname| lastname | day | month   | year | email           | password | Confirm Password  |
   |  Female | Tina     | Pathak   | 01  | January | 1913 | tinaP@gmail.com | tina123  |  tina123          |