package stiw3034.group2.testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

import java.util.concurrent.TimeUnit;


public class LoginTest extends BaseDriverTest {

    @Test
    public void UC021LoginWithvalidCredentials() {

        driver.get("https://www.traveloka.com/en-my/");
        //open the dropdown login form
        WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));

        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()", login);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //Enter valid email address
        WebElement loginemail = driver.findElement(By.id("username"));
        loginemail.sendKeys("idahz99@gmail.com");
        //Enter password
        WebElement loginpassword = driver.findElement(By.id("password"));
        loginpassword.sendKeys("Test123");
        //Click login
        WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
        loginbutton.click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//Verification
        WebElement confirmationNeededPrompt = driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/h1"));
        Assert.assertEquals(true,confirmationNeededPrompt.isDisplayed());

    }

    @Test
    public void UC022LoginblankEmail() {

        driver.get("https://www.traveloka.com/en-my/");
        //open the drop down login form
        WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()", login);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //Enter blank on email text field
        WebElement loginemail = driver.findElement(By.id("username"));
        loginemail.sendKeys("");
        //Enter password
        WebElement loginpassword = driver.findElement(By.id("password"));
        loginpassword.sendKeys("Test1234");
        //Click login button
        WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
        loginbutton.click();



        //check if error message appear
        WebElement errormsg = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div"));
        Assert.assertEquals(true,errormsg.isDisplayed());



    }

    @Test
    public void UC023LoginIncompleteEmail() {

        driver.get("https://www.traveloka.com/en-my/");
        //open the dropdown login form
        WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()", login);
        //Enter incomplete email
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement loginemail = driver.findElement(By.id("username"));
        loginemail.sendKeys("idahz99");
        //Enter password
        WebElement loginpassword = driver.findElement(By.id("password"));
        loginpassword.sendKeys("Test123");
        //Click login button
        WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
        loginbutton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    @Test
    public void UC024LoginwithPhoneNoWithLessthan4digits() {

        driver.get("https://www.traveloka.com/en-my/");
        //open the dropdown login form
        WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()", login);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //Enter a number with less than 6 digits
        WebElement loginemail = driver.findElement(By.id("username"));
        loginemail.sendKeys("2");
        //Enter password
        WebElement loginpassword = driver.findElement(By.id("password"));
        loginpassword.sendKeys("Test123");
        //click login button
        WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
        loginbutton.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void UC025LoginEmailwithMoreThanOneDot() {
        //open the dropdown login form
        driver.get("https://www.traveloka.com/en-my/");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()", login);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //enter email with extra character on domain
        WebElement loginemail = driver.findElement(By.id("username"));
        loginemail.sendKeys("idahz99@gmail..com");
        //Insert password
        WebElement loginpassword = driver.findElement(By.id("password"));
        loginpassword.sendKeys("Test123");
        //click login
        WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
        loginbutton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
