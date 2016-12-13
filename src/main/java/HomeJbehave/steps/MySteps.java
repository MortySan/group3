package HomeJbehave.steps;

import HomeJbehave.pages.CityPage;
import HomeJbehave.pages.WeatherMain;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MySteps {
    WebDriver driver;
    WeatherMain weatherMain;
    CityPage cityPage;

    @Given("$browser started")
    public void startDriver (String browser) {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTemp\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTemp\\chromedriver.exe");
        if (browser.equals("firefox")) driver = new FirefoxDriver();
        if (browser.equals("chrome")) driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("proceed to $url")
    public void goToPage (String url) {
        driver.get(url);
    }

    @When("you input $capital name in the search input")
    public void searchCapital ( String capital) {

        driver.findElement(By.xpath("//input[@id='location']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//input[@id='location']")).sendKeys(capital);

//        weatherMain.searchCountry(capital);
    }

    @When("proper $country will be selected")
    public void selectCountry (String flag) {
        driver.findElement(By.xpath("//*[@id='location_autocomplete']/div/nobr/div[@class='flag flag-"+flag+"']")).click();

    }

    @Then("Temperature for today will be printed")
    public void temperaturePrint () {
        WebElement maxTemp = driver.findElement(By.xpath("//tr[@class='max-temp-row']/td[1]/span"));
        WebElement minTemp = driver.findElement(By.xpath("//tr[@class='min-temp-row']/td[1]/span"));
        System.out.println("Max Temp:"+maxTemp.getText()+" C");
        System.out.println("Min Temp:"+minTemp.getText()+" C");
//        cityPage.tempPrint();

    }
    @Then("Change to F and print")
    public void farengheitPrint() {
        driver.findElement(By.xpath("//a[@class='units imperial']")).click();
        WebElement maxTempF = driver.findElement(By.xpath("//tr[@class='max-temp-row']/td[1]/span"));
        WebElement minTempF = driver.findElement(By.xpath("//tr[@class='min-temp-row']/td[1]/span"));
        System.out.println("Max Temp:"+maxTempF.getText()+" F");
        System.out.println("Min Temp:"+minTempF.getText()+" F");

    }

    @Then("Driver quit")
    public void driverQuit() {
        driver.quit();
    }
}
