package stepDefinations;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utils.TestContext;

import java.io.IOException;

public class Hooks {
    TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @After
    public void closeBrowser() throws IOException {
        testContext.base.webDriverManager().quit();
    }

}
