package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import pages.MousePage;
import utilities.Driver;

import java.util.Set;

public class MouseStepDefinations {
    MousePage mouse = new MousePage();
    Actions action=new Actions(Driver.getDriver());

    @Then("Cizili alan uzerinde sag click yapilir")
    public void cizili_alan_uzerinde_sag_click_yapilir() {

        action.contextClick(mouse.ciziliAlan).perform();

    }

    @And("yazinin “You selected a context menu” test edilir")
    public void yazininYouSelectedAContextMenuTestEdilir() {
        Assert.assertEquals(Driver.getDriver().switchTo().alert().getText(),"You selected a context menu");
    }

    @And("TAMAM butonu tiklanir")
    public void tamamButonuTiklanir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Elemental Selenium linkine tiklanir")
    public void elementalSeleniumLinkineTiklanir() {
        String ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();


        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

        mouse.ElementalSelenium.click();

        String ikinciSayfaHandleDegeri="";

        Set<String>  handleSeti= Driver.getDriver().getWindowHandles();

        for (String each:handleSeti){

            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);


    }

    @And("h{int} taginda “Elemental Selenium” yazdigi test edilir")
    public void hTagindaElementalSeleniumYazdigiTestEdilir(int arg0) {


        System.out.println(Driver.getDriver().getWindowHandle()+ "2.sayfa");
        System.out.println(mouse.h1Tag.getText());
        Assert.assertEquals(mouse.h1Tag.getText(),"Elemental Selenium");

        Driver.closeDriver();
    }



    //dragdrop sorusu buralar
    @Then("“Drag me” butonunu tutup “Drop here” kutusunun ustune birakilir")
    public void dragMeButonunuTutupDropHereKutusununUstuneBirakilir() {

        action.dragAndDrop(mouse.DragMe, mouse.DropHere).perform();

    }

    @And("“Drop here” yazisi yerine “Dropped!” oldugunu test edilir")
    public void dropHereYazisiYerineDroppedOldugunuTestEdilir() {
        Assert.assertEquals(mouse.DropHere.getText(),"Dropped!");
        //Assert.assertTrue(mouse.DropHere.getText().contains("Dropped"));
        Driver.closeDriver();
    }
}