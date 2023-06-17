package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I click on Accept Cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickOnAcceptCookie();
    }
    @Then("^Verify that logo is present$")
    public void verifyThatLogoIsPresent() {
        Assert.assertTrue(new HomePage().verifyLogoIsDisplay());
    }

    @And("^I click on menu \"([^\"]*)\"$")
    public void iClickOnMenu(String menu) {
        new HomePage().verifyHeaderOnHomePage(menu);
    }

    @Then("^Text is displays on page \"([^\"]*)\"$")
    public void textIsDisplaysOnPage(String textMessage) {
        Assert.assertTrue(new HomePage().VerifyMessageOnPage().contains(textMessage));
    }
}
