package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Herokuapp {

    public Herokuapp(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath="(//input[@type='checkbox'])[1]")
    public WebElement checkbox1;
    @FindBy(xpath="(//input[@type='checkbox'])[2]")
    public WebElement checkbox2;
    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    public WebElement simpleAlert;
    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    public WebElement simpleConfrim;
    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement JsPromptButton;
    @FindBy(xpath = "//p[@id='result']")
    public WebElement resultText;

}
