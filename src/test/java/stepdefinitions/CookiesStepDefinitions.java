package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import utilities.Driver;

import java.util.Set;

public class CookiesStepDefinitions {


    Set<Cookie> cookieSet= Driver.getDriver().manage().getCookies();


    @Then("tum cookieler listelenir")
    public void tum_cookieler_listelenir() {


        System.out.println(cookieSet);

        int sayac=1;

        for (Cookie each: cookieSet
        ) {
            System.out.println(sayac+". cookie : " + each);
            sayac++;
        }

    }
    @Then("Sayfadaki cookies sayisinin {int}’den buyuk oldugunu test edilir")
    public void sayfadaki_cookies_sayisinin_den_buyuk_oldugunu_test_edilir(Integer int1) {

       // Set<Cookie> cookieSet= Driver.getDriver().manage().getCookies();
        Assert.assertTrue(cookieSet.size()>5);

    }
    @Then("ismi i18n-prefs olan cookie degerinin USD oldugunu test edilir")
    public void ismi_i18n_prefs_olan_cookie_degerinin_usd_oldugunu_test_edilir() {

        Cookie cookiei18n=Driver.getDriver().manage().getCookieNamed("i18n-prefs");
         System.out.println("cookiei18n degeri : " + cookiei18n);
        Assert.assertTrue(cookiei18n.getValue().equals("USD"));
       // Assert.assertTrue(Driver.getDriver().manage().getCookieNamed("i18n-prefs").getValue().equals("USD"));
    }
    @Then("ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturulur ve sayfaya eklenir")
    public void ismi_en_sevdigim_cookie_ve_degeri_cikolatali_olan_bir_cookie_olusturulur_ve_sayfaya_eklenir() {

        Cookie myCookie=new Cookie("en sevdigim cookie","cikolatali");
        Driver.getDriver().manage().addCookie(myCookie);



    }
    @Then("eklediginiz cookie’nin sayfaya eklendigini test edilir")
    public void eklediginiz_cookie_nin_sayfaya_eklendigini_test_edilir() {

        Cookie myCookie=new Cookie("en sevdigim cookie","cikolatali");
        Driver.getDriver().manage().addCookie(myCookie);
       int sayac=1;
        Set<Cookie> cookieSet2=Driver.getDriver().manage().getCookies();

        for (Cookie each: cookieSet2){
            System.out.println(sayac+ ". cookie : "+ each);
            sayac++;
        }
        Assert.assertTrue(cookieSet2.contains(myCookie));

    }
    @Then("ismi skin olan cookie’yi silinir ve silindigi test edİlir")
    public void ismi_skin_olan_cookie_yi_silinir_ve_silindigi_test_ed_ilir() {


        Driver.getDriver().manage().deleteCookieNamed("skin");


       int sayac=1;
        Set<Cookie> cookieSet3= Driver.getDriver().manage().getCookies();
        for (Cookie each: cookieSet3
        ) {
            System.out.println(sayac+". cookie : " + each);
            sayac++;
        }
        Assert.assertFalse(cookieSet3.contains(Driver.getDriver().manage().getCookieNamed("skin")));

    }
    @Then("tum cookie’leri silinir ve silindigi test edilir")
    public void tum_cookie_leri_silinir_ve_silindigi_test_edilir() {

        Driver.getDriver().manage().deleteAllCookies();

        Set<Cookie> cookieSet4= Driver.getDriver().manage().getCookies();

        Assert.assertTrue(cookieSet4.size()==0);

    }
}
