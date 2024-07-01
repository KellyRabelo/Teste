package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTeste {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = DriverFactory.getDriver();
    }

    @AfterClass
    public static void tearDown() {
        DriverFactory.quitDriver();
    }
}
