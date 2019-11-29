package stepdefs;

import Browser.Browser;
import SeleniumUtils.SeleniumUtils;
import cucumber.api.java8.En;
import org.junit.Assert;

public class Navigation extends SeleniumUtils implements En{
    public Navigation() {
        String baseUrl = "http://127.0.0.1:5000";

        Then("^I am on the website", () -> {
            Browser.getDriver().get(baseUrl);
        });
        When("^I navigate to the main page$", () -> {
        });
        Then("^the correct logged out main page links are displayed$", () -> {
            Assert.assertTrue(isTextPresent("Home"));
            Assert.assertTrue(isTextPresent("Play"));
            Assert.assertTrue(isTextPresent("Login"));
            Assert.assertTrue(isTextPresent("Sign Up"));
        });
        Then("^the correct logged in main page links are displayed$", () -> {
            Assert.assertTrue(isTextPresent("Home"));
            Assert.assertTrue(isTextPresent("Profile"));
            Assert.assertTrue(isTextPresent("Play"));
            Assert.assertTrue(isTextPresent("Logout"));
        });
        Then("^I am able to move around all the logged out nav bar pages$", () -> {
        });
        Then("^I am presented with the main page and signed in$", () -> {
        });
        When("^I navigate to the profile page$", () -> {
        });
    }
}
