package com.ctm_energy_journey.pages;

import com.ctm_energy_journey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourDetailsPage {

    public YourDetailsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@id='EnergyComparison_YourDetails_YourPreferences_WhatTariffAreYouInterestedIn_fixed']")
    public WebElement yourPreferencesFixedTariff;

    @FindBy(xpath = "//input[@id='EnergyComparison_YourDetails_YourPreferences_WhatTariffAreYouInterestedIn_variable']")
    public WebElement yourPreferencesVariableTariff;

    @FindBy(xpath = "//input[@id='EnergyComparison_YourDetails_YourPreferences_WhatTariffAreYouInterestedIn_allTariffs']")
    public WebElement yourPreferencesAllTariffs;

    @FindBy(xpath = "//input[@id='EnergyComparison_YourDetails_YourContactDetails_WhatIsYourEmailAddress']")
    public WebElement yourEmailAddressInput;

    @FindBy(xpath = "//input[@id='EnergyComparison_YourDetails_YourContactDetails_LetUsKeepYouUpToDate_email']")
    public WebElement yourEmailAddressUpdatesRadio;

    @FindBy(xpath = "//button[@id='EnergyComparison_YourDetails_GoToPrices']")
    public WebElement seeResultsMyDetailsPageButton;


}
