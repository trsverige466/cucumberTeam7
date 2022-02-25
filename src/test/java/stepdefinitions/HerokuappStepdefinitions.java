package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Herokuapp;
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
            System.out.println(herokuapp.resultText.getText());
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
    }
}


