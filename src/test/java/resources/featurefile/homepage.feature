Feature: Homepage Functionality

  As a user i want to verify homepage functionality
@smoke
  Scenario: Verify company logo on homepage
    Given I am on homepage
    When I click on Accept Cookies
    Then Verify that logo is present

@smoke
Scenario Outline: Verify the top menu on the homepage
  Given I am on homepage
  When I click on Accept Cookies
  And I click on menu "<menu>"
  Then Text is displays on page "<menu>"

  Examples:
    |menu        |
    |Online Slots|
    |Live Casino |
    |Casino      |
    |Slingo      |
    |Online Bingo|
    |Free Games  |
    |Poker       |

