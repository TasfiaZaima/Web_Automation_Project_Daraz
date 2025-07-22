package me.tasfia.zaima;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CrossBrowser {
    WebDriver driver;
    // Driver setup and config
    //@BeforeSuite
    public void startBrowser(String browser) {
        String browserName=browser;
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else if(browser.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
       }else if(browser.equalsIgnoreCase("ie")){
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
       }else if(browser.equalsIgnoreCase("safari")) {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        driver.manage().window().maximize();
       }else{
        System.out.println("Browser not supported");
    }
}
    // Driver close
    @AfterSuite
    public void stopBrowser(){
        driver.close();
    }
    // Test C
@Test
    public void openURL(){
        startBrowser("chrome");
        driver.get("https://www.daraz.com.bd");
        driver.get("https://www.msn.com/");
}
}
