package pages;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Олег on 16.03.2016.
 */
public class MainMenu extends SitesBlocks {
    public MainMenu(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "//a[contains(@data-id,'translate')]")
    public WebElement translate;

    @FindBy(xpath = "//a[contains(@data-id,'market')]")
    public WebElement market;

    @FindBy(xpath = "//a[contains(@data-id,'news')]")
    public WebElement news;


    public TranslatePage openTanslatePage() {
        translate.click();
        return new TranslatePage(driver);
    }

}
