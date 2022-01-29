package stiw3034.group2.common;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseDriverAllTest {
    protected static WebDriver driver;


    @BeforeClass
    public static void beforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\Development\\webdrivers\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--start-maximized");
        opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
    }

    @AfterClass
    public static void tearDown() throws Exception {
//        driver.quit();
    }
}
