Feature: E09 cookies class Work

  @Hello
  Scenario:cookies Work

  Given user goes to "AmazonUrl" website
  Then tum cookieler listelenir
    And Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edilir
    And ismi i18n-prefs olan cookie degerinin USD oldugunu test edilir
    Then ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturulur ve sayfaya eklenir
    And eklediginiz cookie’nin sayfaya eklendigini test edilir
    And ismi skin olan cookie’yi silinir ve silindigi test edİlir
    And tum cookie’leri silinir ve silindigi test edilir




#Cookies Class Work
  #CONFLICT YAPTIM
#Yeni bir class olusturun : cookiesAutomation
#1- Amazon anasayfaya gidin
#2- tum cookie’leri listeleyin
#3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
#4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
#5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie
#olusturun ve sayfaya ekleyin
#6- eklediginiz cookie’nin sayfaya eklendigini test edin
#7- ismi skin olan cookie’yi silin ve silindigini test edin
#8- tum cookie’leri silin ve silindigini test edin


