package com.ctm_energy_journey.pages;

import com.ctm_energy_journey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@id='setup-password-link']")
    public WebElement registeredNowButton;

    @FindBy(xpath = "//a[@id='ctm-logo']")
    public WebElement homePageLogoButton;

}
