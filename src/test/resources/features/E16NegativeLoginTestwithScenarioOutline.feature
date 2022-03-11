Feature:HMC Search with Scenario Outline

  Scenario Outline: HMC Search
    Given user goes to "HMCUrl" website
    And user clicks logInButton
    Then kullanici olarak "<username>" password olarak "<password>" girer
    Then logIn butonuna basar
    And giris yapilamadigini test eder



    Examples:
|username|password|
    |MANAGER |MANAGER1|
    |man ager|manager1!!|
    |MAN ager|manager 1 |
    |.  |. |
    | manager| manager1|
    |manager |manager1 |