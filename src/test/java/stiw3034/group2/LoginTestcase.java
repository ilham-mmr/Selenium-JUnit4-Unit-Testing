package stiw3034.group2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

import java.util.concurrent.TimeUnit;

public class LoginTestcase extends BaseDriverTest {

@Test
public void tc1() {
	
	driver.get("https://www.traveloka.com/en-my/");
    WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
    JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()", login);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	WebElement loginemail = driver.findElement(By.id("username"));
    loginemail.sendKeys("idahz99@gmail.com");
    
    WebElement loginpassword = driver.findElement(By.id("password"));
    loginpassword.sendKeys("Test123");

    WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
    loginbutton.click();	
    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}

@Test
public void tc2() {
	
	driver.get("https://www.traveloka.com/en-my/");
    WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
    JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()", login);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	WebElement loginemail = driver.findElement(By.id("username"));
    loginemail.sendKeys("");
    
    WebElement loginpassword = driver.findElement(By.id("password"));
    loginpassword.sendKeys("Test123");

    WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
    loginbutton.click();
    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}

@Test
public void tc3() {
	
	driver.get("https://www.traveloka.com/en-my/");
    WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
    JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()", login);
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	WebElement loginemail = driver.findElement(By.id("username"));
	loginemail.sendKeys("idahz99");
    
    WebElement loginpassword = driver.findElement(By.id("password"));
    loginpassword.sendKeys("Test123");

    WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
    loginbutton.click();	
    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


@Test
public void tc4() {
	
	driver.get("https://www.traveloka.com/en-my/");
    WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
    JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()", login);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	WebElement loginemail = driver.findElement(By.id("username"));
    loginemail.sendKeys("2");
    
    WebElement loginpassword = driver.findElement(By.id("password"));
    loginpassword.sendKeys("Test123");

    WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
    loginbutton.click();
    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Test
public void tc5() {
	
	driver.get("https://www.traveloka.com/en-my/");
    WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
    JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()", login);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	WebElement loginemail = driver.findElement(By.id("username"));
    loginemail.sendKeys("idahz99@gmail..com");
    
    WebElement loginpassword = driver.findElement(By.id("password"));
    loginpassword.sendKeys("Test123");

    WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]"));
    loginbutton.click();	
    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







}
