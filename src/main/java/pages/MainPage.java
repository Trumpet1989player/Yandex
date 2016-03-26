package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Олег on 16.03.2016.
 */
public class MainPage extends SitesBlocks {

    public MainMenu mainMenu;
    public Widgets widgets;

    public MainPage(WebDriver driver) {
        super(driver);
        mainMenu = new MainMenu(driver);
        widgets = new Widgets(driver);
    }

}

