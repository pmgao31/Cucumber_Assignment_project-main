@bing @search
@severity=normal
@issue=1234
@tmslink=1234

@Testing
Feature: Wrong Username feature
  

  @SanityTest
  Scenario: Invalid User Id
    Given Open chrome and launch the Url "https://www.saucedemo.com/"
    And Enter wrong usernamme as "wrongname" and pwd as "wrong_password"
    Then verify the page title "Swag Labs" is not displayed
