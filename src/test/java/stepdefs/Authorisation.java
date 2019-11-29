package stepdefs;

import Browser.Browser;
import SeleniumUtils.SeleniumUtils;
import cucumber.api.java8.En;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;

public class Authorisation extends SeleniumUtils implements En{
    public Authorisation() {

        String userEmail;
        String userPassword;
        String userUsername;
        String userFirstName;
        String userLastName;

        And("^I am logged in$", () -> {
            clickByLinkText("Login");
            enterText("//*[@id='login-email']","admin@admin.com");
            enterText("//*[@id='login-password']","password");
            click("//*[@id='submit']");
            assertTrue(isTextPresent("Welcome, admin!"));
        });
        Given("^I sign up to the website$", () -> {

        });
    }
}
