Feature: E06 handle ıframe

  Scenario: herokuapp handle ıframe

    Given user goes to "HerokuappIframe" website
    Then user tests “An IFrame containing….” text is enable
    And user writes “Merhaba Dunya!” at textBox
    And user verifies “Elemental Selenium” is visible
    And user get written "elemental selenium" on the console




