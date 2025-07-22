package me.tasfia.zaima;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChromeBrowser {
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
@Test
    public void openURL(){
        driver.get("https://www.daraz.com.bd");
}
}
