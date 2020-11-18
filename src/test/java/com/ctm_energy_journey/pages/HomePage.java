package com.ctm_energy_journey.pages;

import com.ctm_energy_journey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@id='Market_HomePage_HomepageHeroBlock_Energy']")
    public WebElement startComparingEnergy;

    @FindBy(xpath = "//input[@id='postcode']")
    public WebElement inputBusinessPostCode;

    @FindBy(xpath = "//button[@id='BusinessEnergyComparison_Energy-Business_BusinessEnergyPostcodeEntryHeroBlock_FindBusiness']")
    public WebElement findBusinessPostCode;

}
