package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContext;

public class LandingPageStepDefination {


    TestContext testContext;
    //String productOnLandingPage;

    public LandingPageStepDefination(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {

    }

    @When("^User search with shortname (.+) and extracted actual name of product$")
    public void user_search_with_shortname_and_extracted_actual_name_of_product(String productName) {
        //search > getText > clickon offers
        LandingPage landingPage = testContext.pageObjectManager.getLandingPage();
        landingPage.searchProduct(productName);
        testContext.productOnLandingPage = landingPage.getProduct().split("-")[0].trim();

        System.out.println(testContext.productOnLandingPage + ": Product extracted from landing page ");


    }


}
