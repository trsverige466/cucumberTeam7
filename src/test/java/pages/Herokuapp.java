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

}
