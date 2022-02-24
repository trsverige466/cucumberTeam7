package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Yeni Hesap Oluştur']")
    public WebElement newAccountElement;

    @FindBy(xpath="(//input[@type='text'])[2]")
    public WebElement nameBox;

    @FindBy(xpath = "//select[@name='birthday_day']")
    public WebElement dayBoxElement;

    @FindBy(xpath = "//select[@name='birthday_month']")
    public WebElement monthBoxElement;

    @FindBy(xpath = "//select[@name='birthday_year']")
    public WebElement yearBoxElement;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement radioButtonElement;

@FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submitButton;


}
