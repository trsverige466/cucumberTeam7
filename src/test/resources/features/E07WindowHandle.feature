Feature: Wındow Handle Test

    Scenario:Take Wındow Handles

    Given user goes to "AmazonUrl" website
Then user tests that title contains "Amazon"
        Then user goes to "TechproedUrl"   website on new tab
And user tests that title contains "Techpro"
        Then user goes to "WalmartUrl"   website on new page
        And user tests that title contains "Walmart"
    And user back to first page and tests to return



#● Sayfa’nin window handle degerini String bir degiskene atayin
#● Sayfa title’nin “Amazon” icerdigini test edin
#● Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
#● Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
#● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
#● Sayfa title’nin “Walmart” icerdigini test edin
#● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin



