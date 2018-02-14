package TestSuite;

import AsdaProject.BasePage;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private BasePage basePage = new BasePage();
    static WebDriver driver;


    @cucumber.api.java.Before
    @Before
    public void setUp() {
        basePage.openBrowser();
        basePage.maximiseBrowser();
        basePage.navigateTo("http://www.asda.com/");
        basePage.applyImpWaits();
    }

    @cucumber.api.java.After
    @After
    public void quitDriver() {
        //if (scenario.isFailed()) {
            // utils.capScreenshot(driver, scenario.getName());
        }
    /*public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            utils.capScreenshot("Screenshot");
        }
        //base.closeBrowser();
    }*/
    }




