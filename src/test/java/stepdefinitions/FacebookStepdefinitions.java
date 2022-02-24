package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.FacebookPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class FacebookStepdefinitions {
FacebookPage facebookPage=new FacebookPage();
    @Then("clicks to  {string}")
    public void clicksTo(String arg0) {
     facebookPage.newAccountElement.click();
      Actions actions=new Actions(Driver.getDriver());
      facebookPage.nameBox.click();
      String password=Faker.instance().internet().password()+"Aa.1";
actions.sendKeys(Faker.instance().name().firstName()).sendKeys(Keys.TAB).sendKeys(Faker.instance().name().lastName())
        .sendKeys(Keys.TAB).sendKeys(Faker.instance().phoneNumber().cellPhone()).sendKeys(Keys.TAB)
        .sendKeys(password).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        .perform();

Select select = new Select(facebookPage.dayBoxElement);
List<WebElement> dayList=select.getOptions();

select.selectByIndex(Faker.instance().random().nextInt(1,dayList.size()));
        Select select1 = new Select(facebookPage.monthBoxElement);
        List<WebElement> monthList=select1.getOptions();
select1.selectByIndex(Faker.instance().random().nextInt(1,monthList.size()));
        Select select3 = new Select(facebookPage.yearBoxElement);
        List<WebElement> yearList=select3.getOptions();
select3.selectByValue("1990");

actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

 List<Integer> numbers=new ArrayList<>();
 numbers.add(-1);
 numbers.add(1);
 numbers.add(2);

 int randomnumbers=numbers.get(Faker.instance().random().nextInt(1,3));
 String radioButtonxpath="(//input[@type='radio'])["+randomnumbers+"]";
      Driver.getDriver().findElement(By.xpath(radioButtonxpath)).click();
facebookPage.submitButton.click();


    }

}
