package stiw3034.group2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stiw3034.group2.common.BaseDriverTest;

public class RegisterTestCase extends BaseDriverTest {
	@Test
	public void tc1()  {
		
		driver.get("https://www.traveloka.com/en-my/");
		driver.get("https://www.traveloka.com/en-my/");
		WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]"));
	    register.click();
	   
	    WebElement areacode = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"));
	     Select select = new Select( areacode);
	    select.selectByValue("my");
	    
	    WebElement phoneno = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input"));
	    phoneno.sendKeys("");
	    
	    WebElement join = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
	    join.click();
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
		WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]"));
	    register.click();
	   
	    WebElement areacode = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"));
	     Select select = new Select( areacode);
	    select.selectByValue("my");
	    
	    WebElement phoneno = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input"));
	    phoneno.sendKeys("abc123dfg56");
	    
	    WebElement join = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
	    join.click();
	    
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
		WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]"));
	    register.click();
	   
	    WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div"));
	    email.click();
	
	 
	    
	    WebElement emailinput = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input"));
	    emailinput.sendKeys("sfjkCGSDUIUvfas ghvgsdugcviHSDCGSUFhSCSDGDFBDFNFGHFGHSSRFGRGEFQWGQEGRTHRTFGBDFVZDFSEFFERYRTHGFBFBSDFVSAGRHGRTHFDBGFDCFGDFAESGERDHRTHDFGBGAREGTRSHDRTHTYJYUJFGHRGRTYRTYHTRGVHFGHJGHKCHJGHJVGKGKGKUGUGKJHGJVHJVHJVGHCGHCGHVGHFCHGHJVHVHJVHGHJGBJKGBJHMGJKGKKBHUHGUGKJY@gmail.com");
	    
	    WebElement join = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
	    join.click();
	    
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
		WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]"));
	    register.click();
	   
	    WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div"));
	    email.click();
	    
	    WebElement emailinput = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input"));
	    emailinput.sendKeys("idahz99@gmail.com");
	    
	    WebElement join = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
	    join.click();
	    
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
	WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]"));
    register.click();
   
    WebElement areacode = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"));
     Select select = new Select( areacode);
    select.selectByValue("my");
    
    WebElement phoneno = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input"));
    phoneno.sendKeys("435");
    
    WebElement join = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div"));
    join.click();
	    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
	     
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
