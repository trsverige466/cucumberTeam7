package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.Herokuapp;

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

}
