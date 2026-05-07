package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public WebDriver driver;

    public Base()
    {

      //  System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64.exe");
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }
}
