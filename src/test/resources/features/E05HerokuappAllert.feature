Feature: E05 Herokuapp Olusturma
@t1
  Scenario: Allert handle

     Given user goes to "HerokuappAllert" website
     Then user clicks to simpleAlert
     Then user get over search Allert
     And user controls text

  Scenario: E05 dismissAlert
  Given user goes to "HerokuappAllert" website
  And user clicks to second Alert
  Then user dismiss to Alert
  And user controls dismission

  Scenario: E05 SendKeysAlert
    Given user goes to "HerokuappAllert" website
    And user clicks to Prompt Alert
    Then user sendKeys to Alert

