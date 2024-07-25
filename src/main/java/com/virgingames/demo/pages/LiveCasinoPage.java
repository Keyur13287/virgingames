package com.virgingames.demo.pages;

import com.virgingames.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LiveCasinoPage extends Utility {
    private static final Logger log = Logger.getLogger(LiveCasinoPage.class);
    @CacheLookup
    @FindBy(css = "a[title='Live Casino']")
    WebElement livCasinoButton;
    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='Live Blackjack Games'])[1]")
    WebElement messageofCasino;

    public  void clickOnLivveCasinoButton(){
        log.info("Click on the live casino button ");
        clickOnElement(livCasinoButton);
    }

    public  String getTextFromlivetext(){
        log.info("Get text  "+messageofCasino.toString());
        return getTextFromElement(messageofCasino);
    }
}
