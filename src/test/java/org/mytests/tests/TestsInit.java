package org.mytests.tests;

import com.epam.jdi.light.driver.WebDriverFactory;
import org.mytests.uiobjects.example.site.SiteJdi;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.composite.WebPage.openSite;
import static com.epam.jdi.light.settings.JDISettings.DRIVER;
import static com.epam.jdi.light.settings.WebSettings.logger;

public interface TestsInit {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        DRIVER.capabilities.safari.put("browserName", "iPhone");
        DRIVER.capabilities.safari.put("device", "iPhone 11");
        DRIVER.capabilities.safari.put("realMobile", "true");
        DRIVER.capabilities.safari.put("os_version", "13");
        DRIVER.capabilities.safari.put("name", "BStack iOS Sample Test");


        openSite(SiteJdi.class);
        logger.info("Run Tests");
    }

    @AfterSuite(alwaysRun = true)
    static void teardown() {
        killAllSeleniumDrivers();
        WebDriverFactory.quit();
    }
}
