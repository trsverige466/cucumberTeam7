package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class HMCpage {
    public HMCpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public WebElement createANewAccountButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement registrationUsername;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement registrationPassword;
    public void dropboxrandomsecim(WebElement a){
        Faker faker = new Faker();
        Select select = new Select(a);
        List<WebElement> dropbox = select.getOptions();
        int rnd = faker.random().nextInt(1, dropbox.size() - 1);
        select.selectByIndex(rnd);
select.selectByIndex(rnd);

    }
}
