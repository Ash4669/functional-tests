Feature: A description

  Background:
    Given I am on the website
    And I sign up to the website

  Scenario: Redirected to profile page when signing in
    And I am logged in
    Then I am presented with the main page and signed in

  Scenario: I cannot sign up to the website with a pre-existing email
    And I log out of the website
    Given I sign up to the website with a pre-existin email
    Then I get an error message informing me of the pre-existing email