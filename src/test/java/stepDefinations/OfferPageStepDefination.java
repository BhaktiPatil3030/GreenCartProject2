package stepDefinations;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TestContext;

public class OfferPageStepDefination {

    TestContext testContext;
    LandingPage landingPage;
    OfferPage offerPage;
    String productOnOffersPage;

    

    public OfferPageStepDefination(TestContext testContext) {
        this.testContext=testContext;
    }

    public void switchToWindow()
    {
        landingPage=testContext.pageObjectManager.getLandingPage();
        landingPage.clickOnTopDeals();
        testContext.utility.switchToWindow();
    }
        @Then("User search for {string} in offer page to check if product exist with same name.")
    public void user_search_for_in_offer_page_to_check_if_product_exist_with_same_name(String string) {
        //switchto window> search >Get text
        switchToWindow();
        offerPage=testContext.pageObjectManager.offerPage;
        offerPage.searchProduct(string);

        productOnOffersPage= offerPage.getProduct();
    }
    @Then("validate productname in offer page matches with landing page")
    public void validate_productname_in_offer_page_matches_with_landing_page() {
        Assert.assertEquals(productOnOffersPage,testContext.productOnOffersPage);

    }
}
