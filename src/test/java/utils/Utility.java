package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Utility {
    public WebDriver driver;

    public Utility(WebDriver driver)
    {
        this.driver=driver;
    }
    public void switchToWindow()
    {
       Set<String> allIds=driver.getWindowHandles();
       ArrayList<String> al=new ArrayList<String>(allIds);
       driver.switchTo().window(al.get(1));

    }





}
