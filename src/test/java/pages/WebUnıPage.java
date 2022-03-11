package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUnıPage {
    public WebUnıPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//button[@class='dropbtn'])[1]")
    public WebElement HoveroverButton;

@FindBy(xpath = "(//a[@class='list-alert'])[1]")
    public WebElement link1Button;
@FindBy(xpath = "(//div[@class='col-lg-12 text-center'])[3]")
    public WebElement clickmeButton;

@FindBy(tagName="h2")
    public WebElement DoubleClickButton;



}
