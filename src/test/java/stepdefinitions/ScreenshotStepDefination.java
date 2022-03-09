package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.HMCpage;
import pages.ScreenshotPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotStepDefination {

    ScreenshotPage ScreenshotPage=new ScreenshotPage();

    @Then("Nutella icin arama yapin")
    public void nutella_icin_arama_yapin() {
    ScreenshotPage.aramakutusu.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Then("sonucun Nutella icerdigini test edin ve sayfanin goruntusunu alin")
    public void sonucun_nutella_icerdigini_test_edin_ve_ilk_urunun_goruntusunu_alin() throws IOException {
        Assert.assertTrue(ScreenshotPage.sonucyazisi.getText().contains("Nutella"));



        // 1- adim TakeScreenShot objesi olusturma

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver();

        // 2- kaydedecegimiz dosyayi olusturalim

        File tumSayfaSS = new File("target/screenShot/tumsayfa.png");

        // 3- bir dosya daha olusturup screenshot objesi ile screenshot'i alalim

        File geciciResim=tss.getScreenshotAs(OutputType.FILE);

        // 4- gecici resmi kaydetmek istedigimiz asil dosyaya copy yapalim

        FileUtils.copyFile(geciciResim,tumSayfaSS);

    }

    @And("sonucun Nutella icerdigini test edin ve sayfanin goruntusunu alina")
    public void sonucunNutellaIcerdiginiTestEdinVeSayfaninGoruntusunuAlina() throws IOException {
        TakesScreenshot screenshot1= (TakesScreenshot) Driver.getDriver();

        String date1= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) ;

        File tumNutella= new File("src/test/java/screenshot/sayfascc"+ date1 +".png");

        File geciciResim1=screenshot1.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(geciciResim1,tumNutella);
    }

    @And("sonucun Nutella icerdigini test edin reusable methodla ekran goruntu alin")
    public void sonucunNutellaIcerdiginiTestEdinReusableMethodlaEkranGoruntuAlin() {
        ReusableMethods.getScreenshot("MAHMUT");
    }

    @And("sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin")
    public void sonucunNutellaIcerdiginiTestEdinVeIlkUrununGoruntusunuAlin() throws IOException {

        String date1= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) ;
        TakesScreenshot screenshot1= (TakesScreenshot) Driver.getDriver();

        File tumNutella= new File("src/test/java/screenshot/sayfascc"+ date1 +".png");

        File geciciResim1=ScreenshotPage.sonText.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(geciciResim1,tumNutella);
    }

    @And("sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu bizim methodla alin")
    public void sonucunNutellaIcerdiginiTestEdinVeIlkUrununGoruntusunuBizimMethodlaAlin() {

        ReusableMethods.getScreenshotWebelement("bizim oglan", ScreenshotPage.sonText );

    }
}
