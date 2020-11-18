package com.ctm_energy_journey.step_def;

import com.ctm_energy_journey.pages.*;
import com.ctm_energy_journey.utilities.BrowserUtils;
import com.ctm_energy_journey.utilities.ConfigurationReader;
import com.ctm_energy_journey.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class NewTenantEnergyQuoteResult {

        YourSupplierPage yourSupplierPage = new YourSupplierPage();
        YourEnergyPage yourEnergyPage = new YourEnergyPage();
        YourEnergyUsagePage yourEnergyUsagePage = new YourEnergyUsagePage();
        YourDetailsPage yourDetailsPage = new YourDetailsPage();

    @Given("As non-registered user I should be able to open the energy-journey URL and select my postcode")
    public void as_non_registered_user_I_should_be_able_to_open_the_energy_journey_URL_and_select_my_postcode() {
        String energyURL = ConfigurationReader.get("ENERGY_URL");
        Driver.get().get(energyURL);
        BrowserUtils.waitFor(1);
        yourSupplierPage.postCodeInput.sendKeys("PE2 6YS");
        BrowserUtils.waitFor(1);
        yourSupplierPage.noIDontHaveMyBillButton.click();
    }
    @Given("Looking to compare Electricity without a bill an unknown supplier")
    public void looking_to_compare_Electricity_without_a_bill_an_unknown_supplier() throws MalformedURLException {
        yourSupplierPage.electricityCompareButton.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(yourSupplierPage.iDontKnowMyElectricitySupplierRadio);
        yourSupplierPage.iDontKnowMyElectricitySupplierRadio.click();
        yourSupplierPage.nextButtonYourSupplier.click();
    }
    @When("The user is selecting Pay as you go meter and not having an Economy meter")
    public void the_user_is_selecting_Pay_as_you_go_meter_and_not_having_an_Economy_meter() throws MalformedURLException {
        BrowserUtils.waitFor(3);
        yourEnergyPage.yesIDoHavePayAsYouGoMeter.click();
        yourEnergyPage.noIDontHaveEconomy7Meter.click();
    }

    @When("Having no estimates for how much electricity it`s been used")
    public void having_no_estimates_for_how_much_electricity_it_s_been_used() {
        yourEnergyPage.gasIDontKnowMyElectricityUsage.click();
        yourEnergyPage.nextButtonYourEnergyNoBill.click();
        BrowserUtils.waitFor(3);
    }
    @When("Providing more details about energy usage for the whole energy usage page")
    public void providing_more_details_about_energy_usage_for_the_whole_energy_usage_page() throws MalformedURLException {
        yourEnergyUsagePage.iHave1_2Bedrooms.click();
        yourEnergyUsagePage.adultsLiveThere1_2.click();
        yourEnergyUsagePage.electricityMainSourceOfHeating.click();
        yourEnergyUsagePage.cosy.click();
        yourEnergyUsagePage.wellWrapped.click();
        yourEnergyUsagePage.electricityCooking.click();
        yourEnergyUsagePage.mostOfTheTime.click();
        yourEnergyUsagePage.nextButtonEnergyUsage.click();
        BrowserUtils.waitFor(3);
    }
    @When("The user preferences for tariff should be {string}")
    public void the_user_preferences_for_tariff_should_be(String string) {

        if(string.equals("fixed tariff")){
            yourDetailsPage.yourPreferencesFixedTariff.click();
        }else if(string.equals("variable tariff")){
            yourDetailsPage.yourPreferencesVariableTariff.click();
        }else if(string.equals("all tariffs")){
            yourDetailsPage.yourPreferencesAllTariffs.click();
        }
    }
    @When("The Email contact address details are given selecting email to keep me updated")
    public void the_Email_contact_address_details_are_given_selecting_email_to_keep_me_updated() {
        yourDetailsPage.yourEmailAddressInput.sendKeys("catalinacerceltasi@gmail.com");
        yourDetailsPage.yourEmailAddressUpdatesRadio.click();
        yourDetailsPage.seeResultsMyDetailsPageButton.click();
        BrowserUtils.waitFor(3);
    }
    @Then("The user should assert an estimate so he can compare the prices")
    public void the_user_should_assert_an_estimate_so_he_can_compare_the_prices() {

        List<WebElement> getCurrentEnergyUsage = Driver.get().
                findElements(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/section[1]/section[1]/div[1]"));

            List<String> elemTexts = new ArrayList<>();
            for (WebElement myNewEstimate : getCurrentEnergyUsage) {
                elemTexts.add(myNewEstimate.getText());
            }
            System.out.println("LIST OF ELEMENTS" + elemTexts);
        BrowserUtils.waitFor(1);
        }
    }




