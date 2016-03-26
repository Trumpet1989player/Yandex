package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by boroa on 25.03.2016.
 */
public class Widgets extends SitesBlocks {
    public Widgets(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href, '/pogoda.yandex.ru')]")
    public List<WebElement> weather;

    @FindBy(xpath = "//*[@id=\"wd-_weather\"]/div/h1/a[2]")
    public WebDriver penis;

    public void clickToWeather() {

        weather.get(1).click();
    }

}
