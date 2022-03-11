package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HMCpage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class HMCStepDefinitions {
    HMCpage hmCpage=new HMCpage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String girilenlink) {
      //  Driver.getDriver().get("https://www.hotelmycamp.com");
        Driver.getDriver().get(ConfigReader.getProperty(girilenlink));
    }
    @Then("kullanici loginButonu linkine tıklar")
    public void kullaniciLoginButonuLinkineTıklar() {

        hmCpage.loginButonu.click();
    }

    @Then("kullanici istenen bilgileri girer")
    public void kullanici_istenen_bilgileri_girer() {
        hmCpage.registrationUsername.click();
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.sendKeys(faker.name().username()).
                sendKeys(Keys.TAB);


    }

    @And("kullanici create a new account linkine tıklar")
    public void kullaniciCreateANewAccountLinkineTıklar() {
        hmCpage.createANewAccountButton.click();

    }
//***************************************************************************//

    @Given("user goes to {string} website")
    public void user_goes_to_website(String givenUrl) {
       Driver.getDriver().get(ConfigReader.getProperty(givenUrl));
    }
    @Then("user gets to create a new account button")
    public void user_gets_to_create_a_new_account_button() {
hmCpage.createANewAccountButton.click();
    }
    @Then("user fiils the blanks")
    public void user_fiils_the_blanks() {

Faker faker=new Faker();
String userName=faker.name().username();
        hmCpage.registrationUsername.sendKeys(userName);
        Actions actions=new Actions(Driver.getDriver());
String password=faker.internet().password()+"Aa.1";
actions.sendKeys(Keys.TAB).sendKeys(password).sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
        .sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
        .sendKeys(Keys.TAB).sendKeys("000000000").sendKeys(Keys.TAB).sendKeys("yes").sendKeys(Keys.TAB)
        .sendKeys("a").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB)
        .sendKeys("IT").sendKeys(Keys.TAB).sendKeys("12/12/1990").perform();





    }
    @Then("user clicks to save button")
    public void user_clicks_to_save_button() {
hmCpage.saveButton.click();
hmCpage.okButton.click();
    }


    @Then("user clicks to logIn button")
    public void userClicksToLogInButton() {
        hmCpage.loginButonu.click();

    }



    @Then("user clicks to Rooms Button")
    public void user_clicks_to_rooms_button() {
hmCpage.RoomsButton.click();
    }
    @Then("user clicks to Middle Room Button")
    public void user_clicks_to_middle_room_button() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",hmCpage.HotelRoomButton);
        jse.executeScript("arguments[0].click();",hmCpage.HotelRoomButton);
    }
    @Then("user checks to opening page")
    public void user_checks_to_opening_page() {
        Assert.assertTrue(hmCpage.HotelRoomText.isDisplayed());

    }


    @And("user clicks to middle Rooms Button")
    public void userClicksToMiddleRoomsButton() {
        JavascriptExecutor jse1= (JavascriptExecutor) Driver.getDriver();
        jse1.executeScript("arguments[1].scrollIntoView(true);arguments[0].click();",hmCpage.HotelRoomButton,hmCpage.HotelRoomButton);
      //  jse1.executeScript("arguments[0].click();",hmCpage.HotelRoomButton);

    }

    @Then("user logIn")
    public void userLogIn() {
        hmCpage.UserNameBox.sendKeys("manager");
        hmCpage.PasswordBox.sendKeys("Manager1!");
        hmCpage.logInButton.click();
    }

    @Then("Tum body boyutunu bulun\\(sutun sayısı)")
    public void tum_body_boyutunu_bulun_sutun_sayısı() {
        System.out.println(hmCpage.HucreSayisiList.size());
    }
    @Then("tum body yazdır")
    public void tum_body_yazdır() {
        System.out.println(hmCpage.TumbodyList.size());
        System.out.println(hmCpage.TumbodyList.get(0).getText());
    }
    @Then("tum satir sayisini bulun ve yazdirin")
    public void tum_satir_sayisini_bulun_ve_yazdirin() {
        System.out.println(hmCpage.SatirSayisiList.size());

        for (int i = 0; i <hmCpage.SatirSayisiList.size() ; i++) {
            System.out.println(hmCpage.SatirSayisiList.get(i).getText());
        }

    }
    @Then("{string} satir {string} sutun yazdır")
    public void satir_sutun_yazdır(String satir, String sutun) {
String dinamikXpath="//tbody//tr["+satir+"]//td["+sutun+"]";

WebElement istenen= Driver.getDriver().findElement(By.xpath(dinamikXpath));
        System.out.println(istenen.getText());
    }


    @And("user clicks logInButton")
    public void userClicksLogInButton() {
        hmCpage.loginButonu.click();
    }

    @Then("kullanici olarak {string} password olarak {string} girer")
    public void kullaniciOlarakPasswordOlarakGirer(String arg0, String arg1) {
        hmCpage.registrationUsername.sendKeys(arg0);
        hmCpage.registrationPassword.sendKeys(arg1);

    }

    @Then("logIn butonuna basar")
    public void logınButonunaBasar() {
        hmCpage.submitButton.click();
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmCpage.accessDeniedText.isDisplayed());
    }
}
