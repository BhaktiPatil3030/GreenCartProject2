package utils;

import pageObjects.OfferPage;
import pageObjects.PageObjectManager;

import java.io.IOException;


public class TestContext {
    public Base base;
    public PageObjectManager pageObjectManager;
    public Utility utility;
    public OfferPage offerPage;
    public String productOnLandingPage;


    public TestContext() throws IOException {
        base = new Base();
        pageObjectManager = new PageObjectManager(base.webDriverManager());
        utility = new Utility(base.webDriverManager());
        //productOnLandingPage = "Tomato";
//productOnLandingPage = PageObjectManager.getLandingPage().getProduct();

    }


}
