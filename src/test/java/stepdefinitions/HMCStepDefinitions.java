package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
        .sendKeys("a").sendKeys(Keys.TAB).perform();





    }
    @Then("user clicks to save button")
    public void user_clicks_to_save_button() {

    }


    @Then("user clicks to logIn button")
    public void userClicksToLogInButton() {
        hmCpage.loginButonu.click();

    }




}
