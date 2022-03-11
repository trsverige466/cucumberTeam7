package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ScreenshotPage {
    public ScreenshotPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//input[@type='text']")
    public WebElement aramakutusu;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement sonucyazisi;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonText;
}
