package com.ctm_energy_journey.pages;

import com.ctm_energy_journey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourEnergyUsagePage {

    public YourEnergyUsagePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@id='EnergyComparison_ConsumptionCalculator_YourEnergyUsage_HowManyBedrooms_2']")
    public WebElement iHave1_2Bedrooms;

    @FindBy(xpath = "//input[@id='EnergyComparison_ConsumptionCalculator_YourEnergyUsage_HowManyAdultsLiveThere_2']")
    public WebElement adultsLiveThere1_2;

    @FindBy(xpath = "//input[@id='EnergyComparison_ConsumptionCalculator_YourEnergyUsage_WhatWillBeTheMainSourceOfEnergyForYourHeating_electricity']")
    public WebElement electricityMainSourceOfHeating;

    @FindBy(xpath = "//input[@id='EnergyComparison_ConsumptionCalculator_YourEnergyUsage_HowDoYouLikeTheTemperatureInsideYourHome_temperate']")
    public WebElement cosy;

    @FindBy(xpath = "//input[@id='EnergyComparison_ConsumptionCalculator_YourEnergyUsage_HowWellIsYourHomeInsulated_well-wrapped']")
    public WebElement wellWrapped;

    @FindBy(xpath = "//input[@id='EnergyComparison_ConsumptionCalculator_YourEnergyUsage_WhatIsYourMainSourceOfEnergyForCooking_electricity']")
    public WebElement electricityCooking;

    @FindBy(xpath = "//input[@id='EnergyComparison_ConsumptionCalculator_YourEnergyUsage_HowOftenIsSomeoneAtHome_most-of-the-time']")
    public WebElement mostOfTheTime;

    @FindBy(xpath = "//button[@id='EnergyComparison_ConsumptionCalculator_Next']")
    public WebElement nextButtonEnergyUsage;

}
