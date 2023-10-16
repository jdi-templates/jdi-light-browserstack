package org.mytests.tests;

import com.epam.jdi.light.driver.WebDriverFactory;
import org.mytests.uiobjects.example.site.SiteJdi;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.composite.WebPage.openSite;
import static com.epam.jdi.light.settings.JDISettings.DRIVER;
import static com.epam.jdi.light.settings.WebSettings.logger;

public interface TestsInit {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        openSite(SiteJdi.class);
        logger.info("Run Tests");
    }

//    @AfterSuite
    @AfterClass(alwaysRun = true)
    static void tearDown() {
        WebDriverFactory.quit();
    }
}
