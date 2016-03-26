package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Олег on 16.03.2016.
 */
public class TranslatePage extends SitePages {


    public TranslatePage(WebDriver driver) {
        super(driver);


    }

    @FindBy(id = "textarea")
    public WebElement textArea;



    public void search(String data) {

        textArea.sendKeys(data);
    }
}
