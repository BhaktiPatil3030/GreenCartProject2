package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LandingPage;
import utils.TestContext;

import java.time.Duration;

public class LandingPageStepDefination {

    WebDriver driver;
    TestContext testContext;
    String productOnLandingPage;


    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User search with shortname {string} and extracted actual name of product")
    public void user_search_with_shortname_and_extracted_actual_name_of_product(String productName) {
        //search > getText > clickon offers
        LandingPage landingPage= testContext.pageObjectManager.getLandingPage();
        landingPage.searchProduct(productName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("input.product-name")));

        productOnLandingPage=productTitle.getText().split("-")[0].trim();
        System.out.println(productOnLandingPage+": Product extracted from landing page " );


    }


}
