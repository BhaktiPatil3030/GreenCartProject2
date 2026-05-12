package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    static WebDriver driver;
    public static LandingPage landingPage;
    public OfferPage offerPage;

    public PageObjectManager(WebDriver driver){
    this.driver=driver;
    }
    public static LandingPage getLandingPage()
    {
        landingPage=new LandingPage(driver);
        return landingPage;
    }
    public OfferPage getOffersPage()
    {
        offerPage=new OfferPage(driver);
        return offerPage;
    }

}
