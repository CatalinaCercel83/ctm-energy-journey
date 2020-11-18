@CTM
  Feature: USER JOURNEY TO PREVIOUS QUOTES WITHOUT QUOTES TAKES YOU TO HOME PAGE

    Scenario: Verify that the user would be able to register from previous quotes and return to energy quotes from home page
      Given The user should select previous energy quotes page
      When The user redirected to sign in page looking for register and wants to navigate to home page
      And The user should be on the Home Page
      And The user should select Start Comparing for Energy
      Then The Home Page should direct the user back to start a new Energy Quote
