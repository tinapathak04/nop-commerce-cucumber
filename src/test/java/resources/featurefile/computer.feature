@regression
Feature: Login Test
  As user I want to login into nop commerce website


  Scenario: User should navigate to computer page successfully
    Given I click on Computer tab
    When I verify Computer text

@smoke
Scenario:  User should navigate to Desktop page successfully
    Given I Click on Computer tab
    When I Click on Desktops link
    And I Verify Desktops text

@sanity
Scenario Outline: User should build you own computer and add them to cart successfully (String processor, String ram,
String hdd, String os, String software)

    Given I Click on the Computer tab
    When I Click on Desktops link
    And I Click on product name "<Build your own computer>"
    And I Select processor "<processor>"
    And I Select RAM "<ram>"
    And I Select HDD "<hdd>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I Click on "<ADD TO CART>" Button
    Then I Verify message "<The product has been added to your shopping cart>"

Examples:
| processor                                       | ram           | hdd               | os                      | software                   |
| 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |


