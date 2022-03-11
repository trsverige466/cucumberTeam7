Feature:Amazon Search with Scenario Outline

  Scenario Outline: Amazon Search
    Given user goes to "AmazonUrl" website
    Then user search "<things>"
    And user control contains "<things>"








    Examples:
    |things|
    |Apple |
    |Armut |
    |Samsung J7|
    |Nutella|