Feature: Login As a user, I want to se my home page in linkedin So that I can update my profile

  Scenario: As user i have able to success login
    Given I as on the login page
    When I enter my alex@mail.com and 123123 correctly
    And I click sign in button
    Then I am on the home page
