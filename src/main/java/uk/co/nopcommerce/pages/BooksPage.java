package uk.co.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.nopcommerce.utility.Utility;

public class BooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(BooksPage.class.getName());

    @FindBy (xpath = "//h1[contains(text(),'Books')]")
    WebElement _booksPageText;
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement _sortByAToZ;
    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement _sortByZToA;
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement _dropDown;
    @FindBy(xpath ="//option[contains(text(),'Price: Low to High')] ")
    WebElement _sortLowToHigh;



    public String booksPageText(){
        Reporter.addStepLog("Getting text from : " + _booksPageText.toString() + "<br>");
        log.info("Getting text from " +_booksPageText.toString());
        return getTextFromElement(_booksPageText);
    }
    public void clickOnSortByAToZ() {
        Reporter.addStepLog("clicking on A to Z sort by : " + _sortByAToZ.toString() + "<br>");
        log.info("clicking on A to Z sort by : " + _sortByAToZ.toString());
        clickOnElement(_sortByAToZ);
    }
    public void checkSortingOrder(){
        Reporter.addStepLog("Checking order of product : ");
        log.info("Checking order of product : ");
        mouseHoverToElement(By.tagName("h2"));
    }
    public void clickOnSortByZToA(){
        Reporter.addStepLog("clicking on Z to A sort by : " + _sortByZToA.toString() + "<br>");
        log.info("clicking on A to Z sort by : " + _sortByZToA.toString());
        clickOnElement(_sortByZToA);
    }
    public void clickOnLowToHigh(){
        Reporter.addStepLog("clicking on price low to high : " + _sortLowToHigh.toString() + "<br>");
        log.info("clicking on price low to high : " + _sortLowToHigh.toString());
        clickOnElement(_sortLowToHigh);

    }
    public void checkPriceOrder(){
        Reporter.addStepLog("Checking price order of product : ");
        log.info("Checking price order of product : ");
        mouseHoverToElementAndClick(By.xpath("//span[@class='price actual-price']"));

    }
}



