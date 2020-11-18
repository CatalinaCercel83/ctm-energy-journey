@CTM
  Feature: AS A USER I WANT TO USE AN INVALID POSTCODE FOR YOUR CURRENT SUPPLIER THAT RETURNS BEING A VALID POSTCODE FOR BUSINESS
    Scenario: As a user I want to assert an invalid postcode between personal use and business
      Given As a user I am looking to insert an invalid postcode PE260YS for an energyQuote I am expecting an error message
      When Switching for business energy compare I am looking to be redirected to the homePage for finding the business postcode PE260YS
      Then I am expecting a similar error message for invalid postcode
