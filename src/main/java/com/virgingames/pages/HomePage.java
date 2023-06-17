package com.virgingames.pages;


import com.virgingames.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement acceptCookie;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Virgin Games']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//div[@class='StyledNavigationMenuWrapper-sc-v46bks-0 gLfsfR']//li")
    List<WebElement> header;

    @CacheLookup
    @FindBy(xpath = "//section[@class='StyledContent-sc-rrhwky-0 flIPPD']/h1")
    WebElement textMessage;

    public void clickOnAcceptCookie() {
        clickOnElement(acceptCookie);
        log.info("Clicking on acceptCookie: " +acceptCookie.toString());
    }
    public boolean verifyLogoIsDisplay(){
        log.info("Verify VirginGames Logo : " +logo);
        boolean image = logo.isDisplayed();
        return image;
    }
    public void verifyHeaderOnHomePage(String menu){
        for (WebElement list : header) {
            if (list.getText().contains(menu)) {
                log.info("Click on top menu " + list.getText());
                System.out.println(list);
                clickOnElement(list);
                break;
            }
        }
    }
    public String  VerifyMessageOnPage(){
        log.info("Verify the text " + textMessage);
        return getTextFromElement(textMessage);
    }
}
