package uk.co.nopcommerce.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.nopcommerce.pages.HomePage;
import uk.co.nopcommerce.pages.LoginPage;
import uk.co.nopcommerce.pages.RegisterPage;

public class RegisterStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }


    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().getRegisterMessage(), "Your Personal Details");
    }


    @And("^I click on female radio button$")
    public void iClickOnFemaleRadioButton() {
        new RegisterPage().clickOnRadioButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new RegisterPage().enterFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new RegisterPage().enterLastName(lastName);

    }
    @And("^I  select Day Of Birth \"([^\"]*)\"$")
    public void iSelectDayOfBirth(int dayOfBirth)  {
        new RegisterPage().selectDayOfBirth(dayOfBirth);

    }

    @And("^I select Date Of Birth Month \"([^\"]*)\";$")
    public void iSelectDateOfBirthMonth(String dateOfBirthMonth)  {
        new RegisterPage().selectDateOfBirthMonth(dateOfBirthMonth);

    }

    @And("^I select Date Of Birth Year \"([^\"]*)\";$")
    public void iSelectDateOfBirthYear(String dateOfBirthYear)  {
        new RegisterPage().selectDateOfBirthYear(dateOfBirthYear);

    }

    @And("^I enter emailId \"([^\"]*)\"$")
    public void iEnterEmailId(String email)  {
        new RegisterPage().setEmailemail(email);

    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String companyName)  {
        new RegisterPage().enterCompanyName(companyName);

    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new RegisterPage().enterPassword(password);

    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword )  {
        new RegisterPage().enterConfirmPassword(confirmPassword);

    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
    }

    @Then("^I should get registration complition message \"([^\"]*)\"$")
    public void iShouldGetRegistrationComplitionMessage(String registrationMessage)  {

    }


}
