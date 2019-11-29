Feature: Navigation throughout the website work as expected

    Scenario: Main page links are correct for logged out user
        Given I am on the website
        When I navigate to the main page
        Then the correct logged out main page links are displayed

    Scenario: Main page links are correct for logged in user
        Given I am on the website
        And I am logged in
        When I navigate to the main page
        Then the correct logged in main page links are displayed