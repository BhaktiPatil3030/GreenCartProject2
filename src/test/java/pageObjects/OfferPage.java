package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    WebDriver driver;

    By search = By.xpath("//input[@type='search']");
    By product =By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]");

    public OfferPage(WebDriver driver) {
        this.driver=driver;
    }

    public void searchProduct(String productName){
        driver.findElement(search).sendKeys(productName);
    }
    public void getProduct(){
         driver.findElement(product).getText();

    }



}
