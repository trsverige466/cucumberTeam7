package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}
