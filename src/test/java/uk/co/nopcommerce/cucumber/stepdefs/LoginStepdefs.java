package uk.co.nopcommerce.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.nopcommerce.pages.HomePage;
import uk.co.nopcommerce.pages.LoginPage;

/* Created
 * by Lamee*/

public class LoginStepdefs {

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeText(),"Welcome, Please Sign In!");
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword( password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeText(), "Welcome to our store");
    }

    @Then("^I should get an error message$")
    public void iShouldGetAnErrorMessage() {
        Assert.assertTrue(new LoginPage().getErrorMessage().contains("Login was unsuccessful. Please correct the errors and try again"));   }
}
