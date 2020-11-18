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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvalidPostCode {

    YourSupplierPage yourSupplierPage = new YourSupplierPage();
    HomePage homePage = new HomePage();

    @Given("As a user I am looking to insert an invalid postcode PE{int}YS for an energyQuote I am expecting an error message")
    public void as_a_user_I_am_looking_to_insert_an_invalid_postcode_PE_YS_for_an_energyQuote_I_am_expecting_an_error_message(Integer int1) {
        String energyURL = ConfigurationReader.get("ENERGY_URL");
        Driver.get().get(energyURL);
        BrowserUtils.waitFor(1);
        yourSupplierPage.postCodeInput.sendKeys("PE"+int1+"YS");
        BrowserUtils.waitFor(1);
        yourSupplierPage.findPostCodeButton.click();
        BrowserUtils.waitFor(2);

        String actualErrorText = yourSupplierPage.wrongPostCodeInputText.getText();
        String expectedErrorText = "Your postcode has not been recognised, please check you have entered it correctly and " +
                "if you still need help call the switching support team on 0800 093 6831.";
        Assert.assertEquals("Verify if WrongInput Postcode Message is correct!",expectedErrorText,actualErrorText);
    }
    @When("Switching for business energy compare I am looking to be redirected to the homePage for finding the business postcode PE{int}YS")
    public void switching_for_business_energy_compare_I_am_looking_to_be_redirected_to_the_homePage_for_finding_the_business_postcode_PE_YS(Integer int1) {
        yourSupplierPage.compareBusinessEnergy.click();
        String homePageURL = ConfigurationReader.get("HOMEPAGE_URL");
        String expectedHomePageURL = "https://www.comparethemarket.com/";
        Assert.assertEquals("Verify if homePageURL is correct!",expectedHomePageURL,homePageURL);
        BrowserUtils.waitFor(1);
        homePage.inputBusinessPostCode.sendKeys("PE"+int1+"YS");
        BrowserUtils.waitFor(1);
        homePage.findBusinessPostCode.click();
        BrowserUtils.waitFor(2);
    }
    @Then("I am expecting a similar error message for invalid postcode")
    public void i_am_expecting_a_similar_error_message_for_invalid_postcode() {
        WebElement validResultPostCode = Driver.get().findElement(By.xpath("//div[@id='address-input']"));
        Assert.assertTrue("Verify if a similar error message is displayed!",validResultPostCode.isDisplayed());
    }
}
