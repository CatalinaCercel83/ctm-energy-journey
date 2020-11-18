package com.ctm_energy_journey.step_def;

import com.ctm_energy_journey.pages.HomePage;
import com.ctm_energy_journey.pages.SignInPage;
import com.ctm_energy_journey.pages.YourSupplierPage;
import com.ctm_energy_journey.utilities.BrowserUtils;
import com.ctm_energy_journey.utilities.ConfigurationReader;
import com.ctm_energy_journey.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageFunctionality {

    SignInPage signInPage = new SignInPage();
    YourSupplierPage yourSupplierPage = new YourSupplierPage();
    HomePage homePage = new HomePage();
    @Given("The user should select previous energy quotes page")
    public void the_user_should_select_previous_energy_quotes_page() {
        String energyURL = ConfigurationReader.get("ENERGY_URL");
        Driver.get().get(energyURL);
        BrowserUtils.waitFor(1);
        yourSupplierPage.previousEnergyQuotesButton.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user redirected to sign in page looking for register and wants to navigate to home page")
    public void the_user_redirected_to_sign_in_page_looking_for_register_and_wants_to_navigate_to_home_page() {
        String signInPageURL = ConfigurationReader.get("SIGNIN_URL");
        String expectedSignInURL = "https://signin.comparethemarket.com/login?signin";
        Assert.assertEquals("Verify if SignInURL is correct!",expectedSignInURL,signInPageURL);
        Assert.assertTrue("Verify Register Now Button is displayed!", signInPage.registeredNowButton.isDisplayed());
        signInPage.homePageLogoButton.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user should be on the Home Page")
    public void the_user_should_be_on_the_Home_Page() {
        String homePageURL = ConfigurationReader.get("HOMEPAGE_URL");
        String expectedHomePageURL = "https://www.comparethemarket.com/";
        Assert.assertEquals("Verify if homePageURL is correct!",expectedHomePageURL,homePageURL);
    }
    @When("The user should select Start Comparing for Energy")
    public void the_user_should_select_Start_Comparing_for_Energy() {
        homePage.startComparingEnergy.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The Home Page should direct the user back to start a new Energy Quote")
    public void the_Home_Page_should_direct_the_user_back_to_start_a_new_Energy_Quote() {
        String energyJourneyPage = ConfigurationReader.get("ENERGY_URL");
        String expectedEnergyJourneyPage = "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT";
        Assert.assertEquals("Verify if Energy JourneyURL is correct!",expectedEnergyJourneyPage,energyJourneyPage);
    }
}
