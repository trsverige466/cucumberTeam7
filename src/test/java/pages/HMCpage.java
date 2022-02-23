package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class HMCpage {
    public HMCpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public WebElement createANewAccountButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement registrationUsername;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement registrationPassword;

    @FindBy(xpath = "(//select[@class='form-control input-lg required'])[1]")
    public WebElement countryBoxElement;


    public void dropDownRandom(WebElement dropDown) {
        Select select = new Select(dropDown);
        List<WebElement> dropDownList = select.getOptions();
        Random random = new Random();
        int country = random.nextInt(1, dropDownList.size() - 1);
        select.selectByIndex(country);


    }



}
