package com.virgingames.demo.steps;


import com.virgingames.demo.pages.HomePage;
import com.virgingames.demo.pages.LiveCasinoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSteps {
//    @Given("I click On Bank Manager Login Tab")
//    public void iClickOnBankManagerLoginTab() {
//        new HomePage().clickOnBankManagerLoginTab();
//    }
//
//
//
//    @Given("I click on Customer Login Tab")
//    public void iClickOnCustomerLoginTab() {
//        new HomePage().clickOnCustomerLoginTab();
//    }
@Given("I click on accept cookies button")
public void iClickOnAcceptCookiesButton() {
    new HomePage().clickOnAcceptCookies();
}

    @And("I click On online slot button")
    public void iClickOnOnlineSlotButton() {
    new HomePage().clickOnOnlinSlotButton();
    }

    @Then("I should verify the text of page")
    public void iShouldVerifyTheTextOfPage() {
        Assert.assertEquals(new HomePage().getTextFromMessage(),"Play Online Slots at Virgin Games","not matched");
    }

    @When("I click On live casino button")
    public void iClickOnLiveCasinoButton() {
        new LiveCasinoPage().clickOnLivveCasinoButton();
    }

    @Then("I should verify the text of casino page")
    public void iShouldVerifyTheTextOfCasinoPage() {
    Assert.assertEquals(new LiveCasinoPage().getTextFromlivetext(),"Live Blackjack Games","Not matched");
    }
}
