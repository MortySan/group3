package HomeJbehave.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by MortySan on 06.12.2016.
 */
public class BasePage {
    private WebDriver driver;

    public BasePage (WebDriver driver) {
//        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



}