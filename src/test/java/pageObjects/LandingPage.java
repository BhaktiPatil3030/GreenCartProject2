package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LandingPage {

    WebDriver driver;

    By search = By.cssSelector("input.search-keyword");
    By product = By.xpath("//div[@class='product']/h4[@class='product-name']");   ////div[@class='product']/h4
    By topDeals = By.linkText("Top Deals");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public void searchProduct(String name) {
        driver.findElement(search).clear();
        driver.findElement(search).sendKeys(name);
    }

    public String getProduct() {
        return driver.findElement(product).getText();


    }

    public void clickOnTopDeals() {
        driver.findElement(topDeals).click();
    }


}
