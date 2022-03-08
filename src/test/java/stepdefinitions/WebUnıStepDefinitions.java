package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.WebUnıPage;
import utilities.Driver;

public class WebUnıStepDefinitions {
WebUnıPage webUnıPage = new WebUnıPage();
    Actions actions=new Actions(Driver.getDriver());
    @Then("user goes to Hover over me First button")
    public void user_goes_to_hover_over_me_first_button() {
actions.click(webUnıPage.HoveroverButton).perform();

    }
    @Then("user clicks Link {int} button")
    public void user_clicks_link_button(Integer int1) {
actions.click(webUnıPage.link1Button).perform();
    }


    @And("user clicks to okey pop-up")
    public void userClicksToOkeyPopUp() {
        System.out.println(Driver.getDriver().switchTo().alert().getText());
        Driver.getDriver().switchTo().alert().accept();

    }

    @And("user clicks to Click and hold Button")
    public void userClicksToClickAndHoldButton() {
        actions.clickAndHold(webUnıPage.clickmeButton).perform();
        System.out.println(webUnıPage.clickmeButton.getText());
    }

    @Then("user clicks to double click button")
    public void userClicksToDoubleClickButton() {
        actions.doubleClick(webUnıPage.DoubleClickButton).perform();
    }
}
