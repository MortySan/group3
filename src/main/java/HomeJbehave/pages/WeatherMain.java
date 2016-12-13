package HomeJbehave.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by MortySan on 06.12.2016.
 */
public class WeatherMain extends BasePage {
    WebDriver driver;
    public WeatherMain(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='location']")
    WebElement input;


    public void searchCountry (String capital) {
        input.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        input.sendKeys(capital);

    }


}
