package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;


    public static void setup() {
        System.setProperty(ConfProperties.getProperty("chromedriver_route"), ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("home_page"));
    }
}