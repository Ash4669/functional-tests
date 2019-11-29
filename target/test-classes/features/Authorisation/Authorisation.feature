Feature: A description

  Scenario: Sign up process and login
    Given I sign up to the website
    When I am logged in
    Then I am presented with the main page and signed in

  Scenario: I cannot sign up to the website with a pre-existing email
    Given I sign up to the website with a pre-existin email
    Then I get an error message informing me of the pre-existing email