package com.ctm_energy_journey.pages;

import com.ctm_energy_journey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourSupplierPage {

    public YourSupplierPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = " //a[@id='EnergyComparison_YourSupplier_BeenHereBefore_PreviousEnergyQuote']")
    public WebElement previousEnergyQuotesButton;

    @FindBy(xpath="//input[@id='EnergyComparison_YourSupplier_YourCurrentSupplier_postcodeInput_Question']")
    public WebElement postCodeInput;

    @FindBy(xpath = "//button[@id='EnergyComparison_YourSupplier_YourCurrentSupplier_FindPostcode']")
    public WebElement findPostCodeButton;

    @FindBy(xpath = "//span[contains(text(),'business energy')]")
    public WebElement compareBusinessEnergy;

    @FindBy(xpath ="//input[@id='EnergyComparison_YourSupplier_YourCurrentSupplier_DoYouHaveYourEnergyBill_NoIDontHaveMyBill']")
    public WebElement noIDontHaveMyBillButton;

    @FindBy(xpath = "//input[@id='EnergyComparison_YourSupplier_YourCurrentSupplier_WhatWouldYouLikeToCompare_Electricity']")
    public WebElement electricityCompareButton;

    @FindBy(xpath = "//input[@id='EnergyComparison_YourSupplier_YourCurrentSupplier_CurrentElectricitySupplier_IDontKnow']")
    public WebElement iDontKnowMyElectricitySupplierRadio;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/section[3]/div[1]/div[1]/section[1]/div[1]/div[3]/p[1]")
    public WebElement wrongPostCodeInputText;

    @FindBy(xpath = "//button[@id='EnergyComparison_YourSupplier_Next']")
    public WebElement nextButtonYourSupplier;
}
