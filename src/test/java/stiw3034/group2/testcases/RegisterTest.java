package stiw3034.group2.testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stiw3034.group2.common.BaseDriverTest;

public class RegisterTest extends BaseDriverTest {
    @Test
    public void UC011Registerwithphoneleftblank()  {

        driver.get("https://www.traveloka.com/en-my/");
        //Click register button
        WebElement register = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[4]"));

        register.click();
        //Choose malaysia area code
        WebElement areacode = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"));
        Select select = new Select( areacode);
        select.selectByValue("my");
        // Enter blank on phone number textfield
        WebElement phoneno = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input"));
        phoneno.sendKeys("");
        WebElement join = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
        join.click();
        //find error message
        WebElement errormsg = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[7]/div[1]/div"));
        //if error message is displayed ,test pass
        Assert.assertEquals(true,errormsg.isDisplayed());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
    @Test
    public void UC012RegisterwithphoneInsertalphanumeric() {

        driver.get("https://www.traveloka.com/en-my/");
        //Click register button
        WebElement register = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[4]"));
        register.click();
        //Choose malaysia area code
        WebElement areacode = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"));
        Select select = new Select( areacode);
        select.selectByValue("my");
        // Enter alphanumeric
        WebElement phoneno = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input"));
        phoneno.sendKeys("abc123dfg56");

        WebElement join = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
        join.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //get 'Account verification' text from verification form
        WebElement verification = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/h1"));
        //pass if it does not go the the account verification form
        Assert.assertFalse(verification.isDisplayed());


    }
    @Test
    public void UC013RegisterwithEmailInsertMoreThan254char() {

        driver.get("https://www.traveloka.com/en-my/");
        //Click register button
        WebElement register = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[4]"));
        register.click();
        //Choose click register with email
        WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div"));
        email.click();


        //Enter email with more than 254 characters
        WebElement emailinput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input"));

        emailinput.sendKeys("sfjkCGSDUIUvfas ghvgsdugcviHSDCGSUFhSCSDGDFBDFNFGHFGHSSRFGRGEFQWGQEGRTHRTFGBDFVZDFSEFFERYRTHGFBFBSDFVSAGRHGRTHFDBGFDCFGDFAESGERDHRTHDFGBGAREGTRSHDRTHTYJYUJFGHRGRTYRTYHTRGVHFGHJGHKCHJGHJVGKGKGKUGUGKJHGJVHJVHJVGHCGHCGHVGHFCHGHJVHVHJVHGHJGBJKGBJHMGJKGKKBHUHGUGKJY@gmail.com");
        //Click join
        WebElement join = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
        join.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

    @Test
    public void UC014RegisterwithEmailInsertvalidEmail() {

        driver.get("https://www.traveloka.com/en-my/");
        //Click register button
        WebElement register = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[4]"));
        register.click();
        //Choose click register with email
        WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div"));
        email.click();
        //enter valid email
        WebElement emailinput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input"));
        emailinput.sendKeys("idahz99@gmail.com");
        //Click join
        WebElement join = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
        join.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //get 'Account verification' text from verification form
        WebElement verification = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/h1"));
        // if the Account verification form is displayed then test case pass
        Assert.assertTrue(verification.isDisplayed());

    }





    @Test
    public void UC015UC014RegisterwithPhonelessThan4Digits() {

        driver.get("https://www.traveloka.com/en-my/");
        //Click register button
        WebElement register = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[4]"));
        register.click();
        //Choose malaysia area code
        WebElement areacode = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"));
        Select select = new Select( areacode);
        select.selectByValue("my");
        WebElement phoneno = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input"));
        phoneno.sendKeys("435");
        //Click join
        WebElement join = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
        join.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

