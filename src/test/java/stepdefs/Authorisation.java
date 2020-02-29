package stepdefs;

import Faker.FakerUtils;
import IntegerUtils.IntegerUtils;
import SeleniumUtils.SeleniumUtils;
import cucumber.api.java8.En;

import java.util.Random;

import static junit.framework.TestCase.assertTrue;

public class Authorisation extends SeleniumUtils implements En{
    private FakerUtils faker = new FakerUtils();
    private String firstName = faker.generateFirstName();
    private String lastName = faker.generateLastName();
    private String email = String.format("%s_%s@banterCardGames.com", this.firstName, this.lastName);
    private String username = String.format("%s_%s%s", this.firstName, this.lastName, String.valueOf(IntegerUtils.getRandomNumberInRange(1000, 9999)));
    private String password = faker.generatePassword(16);

    public String getEmail(){ return this.email; }
    public void setEmail(String email){ this.email = email; }

    public String getPassword(){ return this.password; }
    public void setPassword(String password){ this.password = password; }

    public String getUsername(){ return this.username; }
    public void setUsername(String username){ this.username = username; }

    public String getFirstName(){ return this.firstName; }
    public void setFirstName(String firstName){ this.firstName = firstName; }

    public String getLastName(){ return this.lastName; }
    public void setLastName(String lastName){ this.lastName = lastName; }

    public Authorisation() {
        And("^I am logged in$", () -> {
            clickByLinkText("Login");
            enterText("//*[@id='login-email']", getEmail());
            enterText("//*[@id='login-password']", getPassword());
            click("//*[@id='submit']");
        });
        Given("^I sign up to the website$", () -> {
            clickByLinkText("Sign Up");
            enterTextById("sign-up-email", getEmail());
            enterTextById("sign-up-username", getUsername());
            enterTextById("sign-up-password", getPassword());
            enterTextById("sign-up-first-name", getFirstName());
            enterTextById("sign-up-last-name", getLastName());
            clickById("submit");
        });
        Given("^I sign up to the website with a pre-existin email$", () -> {

        });
        And("^I log out of the website$", () -> {

        });
        Then("^I get an error message informing me of the pre-existing email$", () -> {
        });
    }
}
