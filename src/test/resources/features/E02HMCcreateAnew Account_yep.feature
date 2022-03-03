Feature: hmc create new account

  Scenario: TC01 Create a new account
    Given user goes to "HMCUrl" web site
    Then user clicks to login
    Then user gets create a new account button
    And user gives fills the blanks
    And user clicks to save button
