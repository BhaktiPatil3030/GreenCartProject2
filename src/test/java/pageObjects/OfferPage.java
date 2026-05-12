package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OfferPage {
    WebDriver driver;

    By search = By.xpath("//input[@type='search']");
    By product =By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]");

    public OfferPage(WebDriver driver) {
        this.driver=driver;
    }

    public void searchProduct(String product){
        driver.findElement(search).clear();
        driver.findElement(search).sendKeys(product);
    }

    public String getProductOnOP() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement product =
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]")
                ));

        return product.getText();
    }


}
