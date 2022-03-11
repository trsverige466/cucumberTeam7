package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Test;
import pages.DemoqaPage;

public class WebTableDemoStepDefination {

    DemoqaPage demoqaPage=new DemoqaPage();
    @Test
    public void demoqaTest(){



    }
    @Then("Headers da bulunan department isimlerini yazdirin")
    public void headers_da_bulunan_department_isimlerini_yazdirin() {
        System.out.println("baslik satiri elementi :" +demoqaPage.baslikSatiriElementi.getText());
    }
    @Then("sutunun basligini yazdirin")
    public void sutunun_basligini_yazdirin() {
        System.out.println("3.sutun basligi : "+demoqaPage.basliklarWebelementiListesi.get(2).getText());
    }
    @Then("Tablodaki tum datalari yazdirin")
    public void tablodaki_tum_datalari_yazdirin() {
        System.out.println("===========Tum body==========");
        System.out.println(demoqaPage.bodyTekWebelement.getText());
    }
    @Then("Tabloda kac cell \\(data) oldugunu yazdirin")
    public void tabloda_kac_cell_data_oldugunu_yazdirin() {
        System.out.println("Tablodaki data sayisi : "+demoqaPage.tumDataWebelementList.size());
    }
    @Then("Tablodaki satir sayisini yazdirin")
    public void tablodaki_satir_sayisini_yazdirin() {
        System.out.println("Tum satir sayisi : "+demoqaPage.tumSatirlarWebelementList.size());
    }
    @Then("Tablodaki sutun sayisini yazdirin")
    public void tablodaki_sutun_sayisini_yazdirin() {
        //hucre sayisi / satir sayisi
        System.out.println("tablodaki sutun sayisi : " +
                (demoqaPage.tumDataWebelementList.size()/demoqaPage.tumSatirlarWebelementList.size()));
    }
    @Then("Tablodaki {int}.kolonu yazdirin")
    public void tablodaki_kolonu_yazdirin(Integer int1) {
        demoqaPage.sutunYazdir(2);
    }
    @Then("Tabloda {string} i Kierra olan kisinin Salary'sini yazdirin")
    public void tabloda_i_kierra_olan_kisinin_salary_sini_yazdirin(String string) {
        demoqaPage.ismeGoreMaasYazdir("Alden");
    }
    @Then("Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin")
    public void page_sayfasinda_bir_method_olusturun_test_sayfasindan_satir_ve_sutun_sayisini_girdigimde_bana_datayi_yazdirsin() {
        demoqaPage.hucreYazdir(3,2);
    }

}
