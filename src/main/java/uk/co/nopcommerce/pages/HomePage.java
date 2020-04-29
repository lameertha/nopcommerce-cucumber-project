package uk.co.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.nopcommerce.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(linkText="Log in")
    WebElement loginLink;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;
    @FindBy (xpath ="//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]" )
    WebElement computersLink;
    @FindBy(xpath = "//body/div/div/ul[1]/li[5]/a[1]")
    WebElement booksLink;

    public void clickOnLoginLink() {
        Reporter.addStepLog("Clicking on login link : " + loginLink.toString() + "<br>");
        log.info("Clicking on login link " +loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.addStepLog("Clicking on register link : " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        log.info("Clicking on register link : " +registerLink.toString());
    }

    public void clickOnComputersLink(){
        Reporter.addStepLog("Clicking on computers link : " + computersLink.toString() + "<br>");
        clickOnElement(computersLink);
        log.info("Clicking on computers link : " + computersLink.toString());
    }

    public void clickOnBooksLink(){
        Reporter.addStepLog("Clicking on books link : " + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
        log.info("Clicking on books link : " + booksLink.toString());
    }
}

