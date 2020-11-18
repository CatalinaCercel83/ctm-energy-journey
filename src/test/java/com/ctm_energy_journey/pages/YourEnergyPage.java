package com.ctm_energy_journey.pages;

import com.ctm_energy_journey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourEnergyPage {

    public YourEnergyPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@id='EnergyComparison_NoBill_YourEnergy_Electricity_DoYouUseAPrepaymentMeter_yes']")
    public WebElement yesIDoHavePayAsYouGoMeter;

    @FindBy(xpath = "//input[@id='EnergyComparison_NoBill_YourEnergy_Electricity_DoYouHaveAnEconomy7Meter_no']")
    public WebElement noIDontHaveEconomy7Meter;

    @FindBy(xpath = "//input[@id='EnergyComparison_NoBill_YourEnergy_Electricity_HowMuchDoYouSpendOnElectricity_IDontKnow']")
    public WebElement gasIDontKnowMyElectricityUsage;

    @FindBy(xpath = "//button[@id='EnergyComparison_NoBill_YourEnergy_Electricity_Next']")
    public WebElement nextButtonYourEnergyNoBill;








}
