Feature: HMC create a new account

  Scenario: TC01 create a new account

    Given user goes to "HMCUrl" website
  Then user clicks to logIn button
    Then user gets to create a new account button
    And user fiils the blanks
    And user clicks to save button
