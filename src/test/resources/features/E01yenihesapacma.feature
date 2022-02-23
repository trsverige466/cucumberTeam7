Feature: E01 HMC yenı hesap olusturma

  @HMCStepDefinitions
  Scenario: HMC de hesap olusum testı

    Given kullanici "AmazonUrl" sayfasina gider
    Then kullanici loginButonu linkine tıklar
    And kullanici create a new account linkine tıklar
    Then kullanici istenen bilgileri girer
    And kullanici save linkine tıklar




