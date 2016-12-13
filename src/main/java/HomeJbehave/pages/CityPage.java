package HomeJbehave.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by MortySan on 06.12.2016.
 */
public class CityPage extends BasePage {
    WebDriver driver;
    public CityPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tr[@class='max-temp-row']/td[1]/span")
    private WebElement maxTemp;
    @FindBy(xpath = "//tr[@class='min-temp-row']/td[1]/span")
    private WebElement minTemp;

    public void tempPrint () {
        System.out.println("Max temp : "+maxTemp.getText());
        System.out.println("Min temp :"+minTemp.getText());
    }

}
