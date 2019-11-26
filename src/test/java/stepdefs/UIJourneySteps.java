package stepdefs;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIJourneySteps implements En {
    String baseUrl = "http://127.0.0.1:5000";

    public UIJourneySteps() {
        Then("^I am on the website", () -> {
//            Browser.getDriver().get(baseUrl);
        });
        And("^I am logged out$", () -> {
        });
        When("^I navigate to the main page$", () -> {
        });
    }
}
