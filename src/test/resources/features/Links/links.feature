Feature: Links with the website work as excpected

    Scenario: Main page links are correct for logged out user
    Given I am on the website
    And I am logged out
    When I navigate to the main page
    Then the correct main page links are displayed

    Scenario: Main page links are correct for logged in user
        Given I am on the website
        And I am logged in
        When I navigate to the main page
        Then the correct main page links are displayed

    Scenario: Profile page links are correct
        Given I am on the website
        And I am logged in
        When I navigate to the profile page
        Then correct profile links are displayed