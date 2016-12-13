package HomeJbehave.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by MortySan on 06.12.2016.
 */
public class Temp {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTemp\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.weather-forecast.com/");
//        String country = "Kiev";
////        driver.findElement(By.xpath("//input[@id='location']")).click();
//        driver.findElement(By.xpath("//input[@id='location']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
//        driver.findElement(By.xpath("//input[@id='location']")).sendKeys(country);

        driver.get("http://www.weather-forecast.com/locations/Kyiv/forecasts/latest");


        WebElement minTemp = driver.findElement(By.xpath("//tr[@class='max-temp-row']/td[1]/span"));
        System.out.println(minTemp.getText());


    }
}
