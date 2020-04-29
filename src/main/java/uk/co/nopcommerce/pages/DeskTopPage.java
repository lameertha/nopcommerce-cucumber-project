package uk.co.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.nopcommerce.utility.Utility;

/* Created
 * by Lamee */
public class DeskTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DeskTopPage.class.getName());
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement deskTopText;
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourOwnComputer;
    @FindBy(id= "product_attribute_3_6")
    WebElement selectHDD;
    @FindBy (id = "add-to-cart-button-1")
    WebElement addToCart;
    @FindBy (xpath = "//a[contains(text(),'shopping cart')]")
    WebElement _successAddToCartMessage;

    public String deskTopPageText(){
        Reporter.addStepLog("Getting text from : " + deskTopText.toString() + "<br>");
        log.info("Getting text from " +deskTopText.toString());
        return getTextFromElement(deskTopText);
    }
    public void clickOnBuildYourOwnComputer(){
        Reporter.addStepLog("clicking on build your own computer tab : " + buildYourOwnComputer.toString()+"<br>");
        log.info("clicking on build your own computer tab : " + buildYourOwnComputer.toString());
        mouseHoverToElementAndClick(buildYourOwnComputer);
    }

    public void clickOnHDDSize(){
        Reporter.addStepLog("selecting HDD : " + selectHDD.toString()+"<br>");
        log.info("selecting HDD : " + selectHDD.toString());
        clickOnElement(selectHDD);

    }
    public void clickOnAddToCart(){
        Reporter.addStepLog("clicking on add to cart button : " +addToCart.toString()+"<br>");
        log.info("clicking on add to cart button : " +addToCart.toString());
        clickOnElement(addToCart);

    }
    public String addToCartMessage(){
        Reporter.addStepLog("Getting text from : " + _successAddToCartMessage.toString() + "<br>");
        log.info("Getting text from " +_successAddToCartMessage.toString());
        return getTextFromElement(_successAddToCartMessage);

    }
}
