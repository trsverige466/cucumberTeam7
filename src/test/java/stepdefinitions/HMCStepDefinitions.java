package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HMCpage;
import utilities.ConfigReader;
import utilities.Driver;

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
    // ************************

    @Given("user goes to {string} web site")
    public void user_goes_to_web_site(String string) {

    }
    @Then("user gets create a new account button")
    public void user_gets_create_a_new_account_button() {
        hmCpage.createANewAccountButton.click();
    }
    @Then("user gives fills the blanks")
    public void user_gives_fills_the_blanks() {
        hmCpage.registrationUsername.click();
        Faker faker=new Faker();
        String userName=faker.name().firstName();
        String password=faker.internet().password()+"Ye.";
        hmCpage.registrationUsername.sendKeys(userName);


    }
    @Then("user clicks to save button")
    public void user_clicks_to_save_button() {

    }


    @Then("user clicks to login")
    public void userClicksToLogin() {
        hmCpage.loginButonu.click();
    }
}
