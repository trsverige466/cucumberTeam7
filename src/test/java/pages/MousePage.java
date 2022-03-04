package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MousePage {
    public MousePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='hot-spot']")
    public WebElement ciziliAlan;

    @FindBy(xpath = "//a[@target='_blank']")
    public  WebElement ElementalSelenium;

    @FindBy(xpath = "/html/body/header/div/div/h1")
    public  WebElement h1Tag;

    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement DragMe;

    @FindBy(xpath= ("(//div[@id='droppable'])[1]"))
    public WebElement DropHere;
}
