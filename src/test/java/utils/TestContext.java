package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;

public class TestContext {
    public Base base;
    public PageObjectManager pageObjectManager;
    public Utility utility;
    public OfferPage offerPage;
    public String productOnOffersPage;

    public TestContext(WebDriver driver)
    {
        base=new Base();
        pageObjectManager=new PageObjectManager(base.driver);
        utility=new Utility(base.driver);


    }


}
