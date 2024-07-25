package com.virgingames.demo.pages;

import com.virgingames.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = Logger.getLogger(HomePage.class);




    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Allow all cookies']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Online Slots'])[1]")
    WebElement onlineSlot;
    @CacheLookup
    @FindBy(css = "section[class='StyledContent-sc-rrhwky-0 qfwFJ'] h1")
    WebElement messageOfPlay;


    public  void clickOnAcceptCookies(){
        log.info("click on "+acceptCookies.toString());
        clickOnElement(acceptCookies);
    }
    public  void clickOnOnlinSlotButton(){
        log.info("click on "+onlineSlot.toString());
        clickOnElement(onlineSlot);
    }
  public  String getTextFromMessage(){
        log.info("Get text  "+onlineSlot.toString());
       return getTextFromElement(messageOfPlay);
    }




}
