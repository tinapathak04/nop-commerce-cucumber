@regression
Feature: Login Test
  As user I want to login into nop commerce website


  Scenario Outline: User should navigate to login page successfully
    Given Click on login link
    When verify that <result> message display
    Examples:
      | result                       |
      | "Welcome, Please Sign In!"   |

@smoke
  Scenario : verify the error message with invalid credentials.
  Given I Click on login link
  When I Enter EmailId
  And I Enter Password
  And I Click on Login Button
  Then I Verify that the Error message
  | EmailId          |    Password       |
  | tinaP@gmail.com  |  tina1234         |

@sanity
Scenario: verify that user should logIn successfully with valid credentials.
   Given I Click on login link
   When I Enter EmailId
   And I Enter Password
   And I Click on Login Button
   Then I Verify that LogOut link is display

Scenario: verify that user should logOut successfully
   Given I Click on login link
   When I Enter EmailId
   And I Enter Password
   And I Click on Login Button
   And I Click on LogOut Link
   Then I Verify that LogIn Link Display