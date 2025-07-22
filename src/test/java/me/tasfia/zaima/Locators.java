
package me.tasfia.zaima;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Locators {
    WebDriver driver;
    // Driver setup and config
    @BeforeSuite
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    // Driver close
    @AfterSuite
    public void stopBrowser(){

        driver.quit();
    }
    // Test C

    @Test(priority=0)
    public void openURL() throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @Test(priority=1)
    public void locateById() throws InterruptedException{
        //driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement firstName = driver.findElement(By.id("name"));
        firstName.sendKeys("Tasfia Zaima");
        Thread.sleep(5000);
        //firstName.clear();
        //Thread.sleep(5000);

    }
    @Test(priority=2)
    public void locateByName() throws InterruptedException {
       // driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("tasfia.zaima000@gmail.com");
        Thread.sleep(5000);
        //element.clear();
        //Thread.sleep(5000);
    }
}
