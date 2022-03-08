package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import pages.Herokuapp;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuappStepdefinitions {
Herokuapp herokuapp =new Herokuapp();
    @Then("user clicks {string}")
    public void userClicks(String checkbox) {
if(!herokuapp.checkbox1.isSelected()){
herokuapp.checkbox1.click();
}
if(!herokuapp.checkbox2.isSelected()){
    herokuapp.checkbox2.click();
}

    }

    @Then("user get over search Allert")
    public void userGetOverSearchAllert() {

        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("user clicks to simpleAlert")
    public void userClicksToSimpleAlert() {

        herokuapp.simpleAlert.click();
    }

    @And("user controls text")
    public void userControlsText() {
        System.out.println(herokuapp.resultText.getText());
      Assert.assertTrue(herokuapp.resultText.getText().contains("successfully"));

        Driver.closeDriver();
    }
        @Given("user clicks to second Alert")
        public void user_clicks_to_second_alert () {
        herokuapp.simpleConfrim.click();

        }
        @Then("user dismiss to Alert")
        public void user_dismiss_to_alert () {
        Driver.getDriver().switchTo().alert().dismiss();

        }
        @Then("user controls dismission")
        public void user_controls_dismission () {
        Assert.assertTrue(herokuapp.resultText.getText().contains("Cancel"));
        Driver.closeDriver();
        }

    @And("user clicks to Prompt Alert")
    public void userClicksToPromptAlert() {
        ReusableMethods.waitForVisibility(herokuapp.JsPromptButton,2);
        herokuapp.JsPromptButton.click();
    }

    @Then("user sendKeys to Alert")
    public void userSendKeysToAlert() {
        Driver.getDriver().switchTo().alert().sendKeys("Prompt");
        Driver.getDriver().switchTo().alert().accept();
        Assert.assertTrue(herokuapp.resultText.getText().contains("Prompt"));

        Driver.closeDriver();
    }

    @Then("user tests “An IFrame containing….” text is enable")
    public void userTestsAnIFrameContainingTextIsEnable() {
       Assert.assertTrue(herokuapp.frameText.isDisplayed());
    }

    @And("user writes “Merhaba Dunya!” at textBox")
    public void userWritesMerhabaDunyaAtTextBox() {
        WebElement frame= Driver.getDriver().findElement(By.tagName("iframe"));
        Driver.getDriver().switchTo().frame(frame);
        WebElement textBox= Driver.getDriver().findElement(By.tagName("P"));
        textBox.clear();
        textBox.sendKeys("Merhaba Dunya!");
    }

    @And("user verifies “Elemental Selenium” is visible")
    public void userVerifiesElementalSeleniumIsVisible() {
        Driver.getDriver().switchTo().parentFrame();// bir ustteki frame gecer
      //  Driver.getDriver().switchTo().defaultContent();// EN usttekine gider
        Assert.assertTrue(herokuapp.elementerSelenium.isDisplayed());
    }

    @And("user get written {string} on the console")
    public void userGetWrittenOnTheConsole(String arg0) {
        System.out.println(herokuapp.elementerSelenium.getText());

        Driver.closeDriver();
    }

    @Then("user tests that title contains {string}")
    public void user_tests_that_title_contains(String string1) {
String title1=Driver.getDriver().getTitle();
Assert.assertTrue(title1.contains(string1));
String windowHandle1=Driver.getDriver().getWindowHandle();
    }
    String windowHandle1=Driver.getDriver().getWindowHandle();
    @Then("user goes to {string}   website on new tab")
    public void user_goes_to_website_on_new_tab(String string) {
Driver.getDriver().switchTo().newWindow(WindowType.TAB);
Driver.getDriver().get(ConfigReader.getProperty("TechproedUrl"));
        String windowHandle2=Driver.getDriver().getWindowHandle();
    }
    @Then("user goes to {string}   website on new page")
    public void user_goes_to_website_on_new_page(String string) {
Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        Driver.getDriver().get(ConfigReader.getProperty("WalmartUrl"));
        String windowHandle3=Driver.getDriver().getWindowHandle();



    }
    @Then("user back to first page and tests to return")
    public void user_back_to_first_page_and_tests_to_return() {

        Driver.getDriver().switchTo().window(windowHandle1);
    }




}



