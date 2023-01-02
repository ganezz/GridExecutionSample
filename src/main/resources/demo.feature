Feature: Account creation on Self register in Retail Onboarding Application

  Scenario: Validating the flow of Savings Account's Index page
    Given User landed on Welcome page while opening Application
    Then Click the register button
    Then In Product Details page click the Accounts category's Apply button
    Then In Sub products of Accounts page, click the Savings Account category's Apply button
    And User landed on Index page with 8 steps.

  Scenario: In OTP screen, Validate Mobile number upto 15 only digis and Verify Valid email
    Given User landed on Welcome page while opening Application
    Then Click the register button
    Then In Product Details page click the Accounts category's Apply button
    Then In Sub products of Accounts page, click the Savings Account category's Apply button
    And User landed on Index page with 8 steps.
    When click the LET GO BUTTON
    Then User will landed on OTP page
    When input the required deatils with invalid Mobile number and Click the submit button
    Then proper message should appear
    And input the required details with invalid email Idd Click the submit button
    Then proper message should appear.

# In Occupassion Screem i cannot move forward , just i'm giving small example with understand from your scenario

    Scenario: Validate mandatory fields on Occupation Screen
      Given User landed on Welcome page while opening Application
      Then Click the register button
      Then In Product Details page click the Accounts category's Apply button
      Then In Sub products of Accounts page, click the Savings Account category's Apply button
      And User landed on Index page with 8 steps.
      Then Click the flow icon then select the Occupation
      And Select the choices in Questions 1/6
      Then Choose any of the range in Questions 2/6
      Then Choose any of the range in Questions 3/6
      Then Selects the required choices in Questions 4/6
      Then Selects the Source of Income in Questions 5/6
      And Select the Required Countries in anticipate countries in Question 6/6
      And click the Continue button
      When Any of the Deatils has not given ,
      Then it should give proper message




