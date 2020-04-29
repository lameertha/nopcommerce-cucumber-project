#@login
#Feature: Login feature
#  As a user I want to login into nope commerce website
#
#  Scenario:  User should login successfully
#    Given I am on home page
#    When I click on login link
#    Then I should navigate to login page successfully
#
#
#  Scenario: User should login successfully with valid credentials
#    Given  I am on home page
#    When I click on login link
#    And I enter email "    lameethev25@gmail.com"
#    And I enter password "lameertha1988"
#    And I click on login button
#    Then I should login successfully
#
#  Scenario Outline: Verify the error message with invalid credentials
#    Given I am on home page
#    When I click on login link
#    And I enter email "<username>"
#    And I enter password "<password>"
#    And I click on login button
#    Then I should get an error message
#    Examples:
#      | username            | password |
#      | lamee123@gmail.com  | lamee123 |
#      | lamee234@gmail.com  | lamee234 |
#      | lamee345@gmail.com  | lamee345 |
#      | lamee678gmail.com |  lamee 678|
#      | lamee912gmail.com  |   lamee912|
#
