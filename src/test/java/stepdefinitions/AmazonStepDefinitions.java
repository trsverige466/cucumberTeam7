package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonPage;

public class AmazonStepDefinitions {
AmazonPage amazonPage=new AmazonPage();
    @Then("user search {string}")
    public void user_search(String string) {
       amazonPage.AmazonSearchTextBox.sendKeys(string);
       amazonPage.AmazonSearchClick.click();
    }
    @Then("user control contains {string}")
    public void user_control_contains(String string) {
        String resultText=amazonPage.resultTextElement.getText();
        Assert.assertTrue(resultText.contains(string));
    }
}
