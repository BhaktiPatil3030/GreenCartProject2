package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LandingPage {

    WebDriver driver;

    By search=By.cssSelector("input.search-keyword");
    By product=By.cssSelector("input.product-name");
    By topDeals = By.linkText("Top Deals");

    public LandingPage(WebDriver driver) {
        this.driver=driver;
    }


    public void searchProduct(String productName)
    {
        driver.findElement(search).sendKeys(productName);
        }
    public void getProduct()
    {
       driver.findElement(product).getText();

    }
        public void clickOnTopDeals()
        {
            driver.findElement(topDeals).click();
        }


}
