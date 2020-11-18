@CTM

Feature: NEW TENANT ENERGY QUOTATION JOURNEY WITH RESULTS

    Scenario Outline: Verify as a non-registered user I should get energy quotes results
      Given As non-registered user I should be able to open the energy-journey URL and select my postcode
      And Looking to compare Electricity without a bill an unknown supplier


      When The user is selecting Pay as you go meter and not having an Economy meter
      And Having no estimates for how much electricity it`s been used
      And Providing more details about energy usage for the whole energy usage page
      And The user preferences for tariff should be "<type of tariffs>"
      And The Email contact address details are given selecting email to keep me updated


      Then The user should assert an estimate so he can compare the prices

      Examples: filters
        |type of tariffs |
        |fixed tariff    |
        |variable tariff |
        |all tariffs     |







