package stiw3034.group2.common;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseDriverTest {
    protected WebDriver driver;


    @BeforeClass
    public static void beforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\Development\\webdrivers\\chromedriver.exe");

    }

    @Before
    public void setUp() throws Exception {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--start-maximized");
        opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
