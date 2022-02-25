Feature: HMC create a new account yap

  @H1
  Scenario: TC01 create a new account
    Given user goes to "HMCUrl" web site
    Then user clicks to log in button
    Then user gets create a new account button
    And user gives fills the blanks
    And user clicks to save button
