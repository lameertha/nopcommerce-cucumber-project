package uk.co.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import org.apache.commons.logging.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.nopcommerce.utility.Utility;

public class RegisterPage extends Utility {
    /* By RegisterText = By.xpath("//strong[contains(text(),'Your Personal Details')]");*/
    /*By clickOnRadio = By.xpath("//input[@id='gender-female']");*/
    /*By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    By email = By.xpath("//input[@id='Email']");
    By companyName = By.xpath("//input[@id='Company']");
    By newsLetterCheckBox = By.xpath("//input[@id='Newsletter']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//input[@id='register-button']");
    By confirmRegistrationMessage = By.className("result");*/
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @FindBy(xpath = "//strong[contains(text(),'Your Personal Details')]")
    WebElement _RegisterText;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement _clickOnRadio;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement _firstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement _lastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _dayOfBirth;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _dateOfBirthMonth;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _dateOfBirthYear;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement _email;
    @FindBy(xpath = "//input[@id='Company']")
    WebElement _companyName;
    @FindBy(xpath = "//input[@id='Newsletter']")
    WebElement _newsLetterCheckBox;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement _password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement _confirmPassword;
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement _registerButton;
    @FindBy(className = "result")
    WebElement _confirmRegistrationMessage;


    public String getRegisterMessage() {
        Reporter.addStepLog("get register message from :" + _RegisterText.toString());
        log.info("get register message from :" + _RegisterText.toString());
        return getTextFromElement(_RegisterText);
    }

    public void clickOnRadioButton() {
        Reporter.addStepLog("click on radio Button :" + _clickOnRadio.toString());
        log.info("click on radio Button :" + _clickOnRadio.toString());
        clickOnElement(_clickOnRadio);
    }

    public void enterFirstName(String firstName) {
        Reporter.addStepLog("Entering first name : " + firstName + " to first name: " + _firstName.toString());
        sendTextToElement(_firstName, firstName);
        log.info("Entering first name : " + firstName + " to first name: " + _firstName.toString());
    }

    public void enterLastName(String lastName) {
        Reporter.addStepLog("Entering first name : " + lastName + " to first name: " + _lastName.toString());
        sendTextToElement(_lastName, lastName);
        log.info("Entering first name : " + lastName + " to first name: " + _lastName.toString());
    }

    public void selectDayOfBirth(int dayOfBirth) {
        Reporter.addStepLog("Selecting Day Of Birth :" + dayOfBirth + "to day of birth :" + _dayOfBirth.toString());
        selectByIndexFromDropDown(_dayOfBirth, dayOfBirth);
        log.info("Selecting Day Of Birth :" + dayOfBirth + "to day of birth :" + _dayOfBirth.toString());
    }

    public void selectDateOfBirthMonth(String dateOfBirthMonth) {
        Reporter.addStepLog("Selecting Birth Of Month :" + dateOfBirthMonth + " to date of birth month:" + _dateOfBirthMonth.toString());
        selectByVisibleTextFromDropDown(_dateOfBirthMonth, dateOfBirthMonth);
        log.info("Selecting Birth Of Month :" + dateOfBirthMonth + " to date of birth month:" + _dateOfBirthMonth.toString());
    }

    public void selectDateOfBirthYear(String dateOfBirthYear) {
        Reporter.addStepLog("Select Date of birth year :" + dateOfBirthYear + "to date of birth year :" + _dateOfBirthYear.toString());
        selectByVisibleTextFromDropDown(_dateOfBirthYear, dateOfBirthYear);
        log.info("Select Date of birth year :" + dateOfBirthYear + "to date of birth year :" + _dateOfBirthYear.toString());
    }

    public void setEmailemail(String email) {
        Reporter.addStepLog("Set Email :" + email + "to email field :" + _email.toString());
        sendTextToElement(_email, email);
        log.info("Set Email :" + email + "to email field :" + _email.toString());
    }

    public void enterCompanyName(String companyName) {
        Reporter.addStepLog("Enter the company Name :" + companyName + "to company name:" + _companyName.toString());
        sendTextToElement(_companyName, companyName);
        log.info("Enter the company Name :" + companyName + "to company name:" + _companyName.toString());
    }

    public void selectCheckBoxOfNewsLetter() {
        Reporter.addStepLog("Select check Box Of News Letter :" + _newsLetterCheckBox.toString());
        clickOnElement(_newsLetterCheckBox);
        log.info("Select check Box Of News Letter :" + _newsLetterCheckBox.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter the password:" + password + "To Password :" + _password.toString());
        sendTextToElement(_password, password);
        log.info("Enter the password:" + password + "To Password :" + _password.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        Reporter.addStepLog("Enter the confirm password :" + confirmPassword + "to confirmPassword :" + _confirmPassword.toString());
        sendTextToElement(_confirmPassword, confirmPassword);
        log.info("Enter the confirm password :" + confirmPassword + "to confirmPassword :" + _confirmPassword.toString());
    }

    public void ClickOnRegisterButton() {
        Reporter.addStepLog("Click On Register Button :" + _registerButton.toString());
        clickOnElement(_registerButton);
        log.info("Click On Register Button :" + _registerButton.toString());
    }

    public void setConfirmRegistrationMessage(String registrationMessage) {
        Reporter.addStepLog("Set Confirm RegistrationMessage:" +registrationMessage+"to confirm message :"+ _confirmRegistrationMessage.toString());
        clickOnElement(_confirmRegistrationMessage);
        log.info("Set Confirm RegistrationMessage:" +registrationMessage+"to confirm message :"+ _confirmRegistrationMessage.toString());
    }

    public void verifyUserShouldRegisterSuccessfullyWithValidCredentials(String firstName,String lastName,int dayOfBirth,String dateOfBirthMonth,String dateOfBirthYear,String email,String companyName,String password,String confirmPassword) {

        getRegisterMessage();
        clickOnRadioButton();
        enterFirstName(firstName);
        enterLastName(lastName);
        selectDayOfBirth(dayOfBirth);
        selectDateOfBirthMonth(dateOfBirthMonth);
        selectDateOfBirthYear( dateOfBirthYear);
        setEmailemail(email);
        enterCompanyName(companyName);
        selectCheckBoxOfNewsLetter();
        enterPassword( password);
        enterConfirmPassword(confirmPassword);
        ClickOnRegisterButton();
        setConfirmRegistrationMessage("");

    }
}
