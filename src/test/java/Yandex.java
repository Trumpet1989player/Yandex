import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

/**
 * Created by Олег on 16.03.2016.
 */
public class  Yandex {
    WebDriver driver;

//    @BeforeClass
//    public static void before() {
//    }

    @Before
    public void setup() {
        driver = new FirefoxDriver();
    }

    @Test
    public void page() throws InterruptedException {
        driver.get("https://www.yandex.ru/");
        MainPage mainPage = new MainPage(driver);
//        TranslatePage translatePage = mainPage.mainMenu.openTanslatePage();
//        translatePage.search("Hello");
        //mainPage.widgets.clickToWeather();
        WebElement pogodaWi =
                driver.findElement(By.xpath("//*[@id=\"wd-_weather\"]/div/h1/a[2]"));
        new Actions(driver).moveToElement(pogodaWi).perform();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wd-wrapper-_weather\"]/div[2]/a/div"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"widget_pref_form\"]/div/div[3]/div/div[1]/button[2]"))).click();
        WebElement movePogodaWi =
                driver.findElement(By.xpath("//*[@id=\"wd-wrapper-_weather-1\"]/div[3]"));
        WebElement staticWi = driver.findElement(By.xpath("//*[@id=\"wd-wrapper-_geo-1\"]/div[3]"));
        Actions hold = new Actions(driver);
        hold.perform();
        hold.clickAndHold().moveByOffset(50,0);
                //dragAndDrop(movePogodaWi,staticWi);
                //dragAndDropBy(movePogodaWi,50,0);
        //driver.findElement(By.xpath("//*[@id=\"widget_pref_form\"]/div/div[3]/div/div[1]/button[2]/span")).click();
//     driver.findElement(By.xpath()).click();
    }


//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
