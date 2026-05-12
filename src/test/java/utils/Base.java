package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public WebDriver driver;

    public WebDriver webDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream( System.getProperty("user.dir") + "/src/test/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("QAUrl");

        if (driver == null) {
            if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");  //chromedriver path
                driver = new ChromeDriver();
                driver.manage().window().maximize();

            }
            if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
                //firefoc code
            }

            driver.get(url);
        }
        return driver;

    }
}
