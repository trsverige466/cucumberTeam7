Feature:HMC Webtable

@1
  Scenario: Webtable Tests

    Given user goes to "HotelMyCampAdmin" website
    Then enter username and password
    Then Tüm table body’sinin boyutunu(sutun sayisi) bulun
  And Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın
  And table body’sinde bulunan toplam satir(row) sayısını bulun
And Table body’sinde bulunan satirlari(rows) konsolda yazdırın
  And 4.satirdaki(row) elementleri konsolda yazdırın




    # ● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
    #  ○ Username : manager ○ Password : Manager1!
    #  ● table( ) metodu oluşturun
    #  ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    #  ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    #  ● printRows( ) metodu oluşturun //tr ○
    #  table body’sinde bulunan toplam satir(row) sayısını bulun. ○
    #  Table body’sinde bulunan satirlari(rows) konsolda yazdırın. ○
    #  4.satirdaki(row) elementleri konsolda yazdırın