$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HomePageFunctionality.feature");
formatter.feature({
  "name": "USER JOURNEY TO PREVIOUS QUOTES WITHOUT QUOTES TAKES YOU TO HOME PAGE",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.scenario({
  "name": "Verify that the user would be able to register from previous quotes and return to energy quotes from home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should select previous energy quotes page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageFunctionality.the_user_should_select_previous_energy_quotes_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user redirected to sign in page looking for register and wants to navigate to home page",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageFunctionality.the_user_redirected_to_sign_in_page_looking_for_register_and_wants_to_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be on the Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageFunctionality.the_user_should_be_on_the_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should select Start Comparing for Energy",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageFunctionality.the_user_should_select_Start_Comparing_for_Energy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Home Page should direct the user back to start a new Energy Quote",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageFunctionality.the_Home_Page_should_direct_the_user_back_to_start_a_new_Energy_Quote()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/InvalidPostCode.feature");
formatter.feature({
  "name": "AS A USER I WANT TO USE AN INVALID POSTCODE FOR YOUR CURRENT SUPPLIER THAT RETURNS BEING A VALID POSTCODE FOR BUSINESS",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.scenario({
  "name": "As a user I want to assert an invalid postcode between personal use and business",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user I am looking to insert an invalid postcode PE260YS for an energyQuote I am expecting an error message",
  "keyword": "Given "
});
formatter.match({
  "location": "InvalidPostCode.as_a_user_I_am_looking_to_insert_an_invalid_postcode_PE_YS_for_an_energyQuote_I_am_expecting_an_error_message(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Switching for business energy compare I am looking to be redirected to the homePage for finding the business postcode PE260YS",
  "keyword": "When "
});
formatter.match({
  "location": "InvalidPostCode.switching_for_business_energy_compare_I_am_looking_to_be_redirected_to_the_homePage_for_finding_the_business_postcode_PE_YS(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am expecting a similar error message for invalid postcode",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidPostCode.i_am_expecting_a_similar_error_message_for_invalid_postcode()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/NewTenantEnergyQuoteResult.feature");
formatter.feature({
  "name": "NEW TENANT ENERGY QUOTATION JOURNEY WITH RESULTS",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify as a non-registered user I should get energy quotes results",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As non-registered user I should be able to open the energy-journey URL and select my postcode",
  "keyword": "Given "
});
formatter.step({
  "name": "Looking to compare Electricity without a bill an unknown supplier",
  "keyword": "And "
});
formatter.step({
  "name": "The user is selecting Pay as you go meter and not having an Economy meter",
  "keyword": "When "
});
formatter.step({
  "name": "Having no estimates for how much electricity it`s been used",
  "keyword": "And "
});
formatter.step({
  "name": "Providing more details about energy usage for the whole energy usage page",
  "keyword": "And "
});
formatter.step({
  "name": "The user preferences for tariff should be \"\u003ctype of tariffs\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The Email contact address details are given selecting email to keep me updated",
  "keyword": "And "
});
formatter.step({
  "name": "The user should assert an estimate so he can compare the prices",
  "keyword": "Then "
});
formatter.examples({
  "name": "filters",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "type of tariffs"
      ]
    },
    {
      "cells": [
        "fixed tariff"
      ]
    },
    {
      "cells": [
        "variable tariff"
      ]
    },
    {
      "cells": [
        "all tariffs"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify as a non-registered user I should get energy quotes results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As non-registered user I should be able to open the energy-journey URL and select my postcode",
  "keyword": "Given "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.as_non_registered_user_I_should_be_able_to_open_the_energy_journey_URL_and_select_my_postcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Looking to compare Electricity without a bill an unknown supplier",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.looking_to_compare_Electricity_without_a_bill_an_unknown_supplier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is selecting Pay as you go meter and not having an Economy meter",
  "keyword": "When "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_is_selecting_Pay_as_you_go_meter_and_not_having_an_Economy_meter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Having no estimates for how much electricity it`s been used",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.having_no_estimates_for_how_much_electricity_it_s_been_used()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Providing more details about energy usage for the whole energy usage page",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.providing_more_details_about_energy_usage_for_the_whole_energy_usage_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user preferences for tariff should be \"fixed tariff\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_preferences_for_tariff_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Email contact address details are given selecting email to keep me updated",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_Email_contact_address_details_are_given_selecting_email_to_keep_me_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should assert an estimate so he can compare the prices",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_should_assert_an_estimate_so_he_can_compare_the_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify as a non-registered user I should get energy quotes results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As non-registered user I should be able to open the energy-journey URL and select my postcode",
  "keyword": "Given "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.as_non_registered_user_I_should_be_able_to_open_the_energy_journey_URL_and_select_my_postcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Looking to compare Electricity without a bill an unknown supplier",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.looking_to_compare_Electricity_without_a_bill_an_unknown_supplier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is selecting Pay as you go meter and not having an Economy meter",
  "keyword": "When "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_is_selecting_Pay_as_you_go_meter_and_not_having_an_Economy_meter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Having no estimates for how much electricity it`s been used",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.having_no_estimates_for_how_much_electricity_it_s_been_used()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Providing more details about energy usage for the whole energy usage page",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.providing_more_details_about_energy_usage_for_the_whole_energy_usage_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user preferences for tariff should be \"variable tariff\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_preferences_for_tariff_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Email contact address details are given selecting email to keep me updated",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_Email_contact_address_details_are_given_selecting_email_to_keep_me_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should assert an estimate so he can compare the prices",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_should_assert_an_estimate_so_he_can_compare_the_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify as a non-registered user I should get energy quotes results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CTM"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As non-registered user I should be able to open the energy-journey URL and select my postcode",
  "keyword": "Given "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.as_non_registered_user_I_should_be_able_to_open_the_energy_journey_URL_and_select_my_postcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Looking to compare Electricity without a bill an unknown supplier",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.looking_to_compare_Electricity_without_a_bill_an_unknown_supplier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is selecting Pay as you go meter and not having an Economy meter",
  "keyword": "When "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_is_selecting_Pay_as_you_go_meter_and_not_having_an_Economy_meter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Having no estimates for how much electricity it`s been used",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.having_no_estimates_for_how_much_electricity_it_s_been_used()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Providing more details about energy usage for the whole energy usage page",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.providing_more_details_about_energy_usage_for_the_whole_energy_usage_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user preferences for tariff should be \"all tariffs\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_preferences_for_tariff_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Email contact address details are given selecting email to keep me updated",
  "keyword": "And "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_Email_contact_address_details_are_given_selecting_email_to_keep_me_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should assert an estimate so he can compare the prices",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTenantEnergyQuoteResult.the_user_should_assert_an_estimate_so_he_can_compare_the_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});