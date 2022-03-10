Feature: E11 webtable Work

  @table
  Scenario: webtable

  Given user goes to "DemoQaUrlweb" website
  Then Headers da bulunan department isimlerini yazdirin
  And sutunun basligini yazdirin
  And Tablodaki tum datalari yazdirin
  And Tabloda kac cell (data) oldugunu yazdirin
  And Tablodaki satir sayisini yazdirin
  Then Tablodaki sutun sayisini yazdirin
  And Tablodaki 3.kolonu yazdirin
  And  Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
  And Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin


#1. “https://demoqa.com/webtables” sayfasina gidin
#2. Headers da bulunan department isimlerini yazdirin
#3. sutunun basligini yazdirin
#4. Tablodaki tum datalari yazdirin
#5. Tabloda kac cell (data) oldugunu yazdirin
#6. Tablodaki satir sayisini yazdirin
#7. Tablodaki sutun sayisini yazdirin
#8. Tablodaki 3.kolonu yazdirin
#9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
#10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini
#girdigimde bana datayi yazdirsin
