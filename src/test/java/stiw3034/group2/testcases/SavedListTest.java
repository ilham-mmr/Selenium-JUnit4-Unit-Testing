package stiw3034.group2.testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SavedListTest extends BaseDriverTest {
    /**
     * Test case : UC5.10
     * short description :Tests the Saved list functionality (not loggedin)
     * condition : add the first hotel
     */
    @Test
    public void uc510addHotelToSavedWithoutLogin() throws InterruptedException {
        driver.get("https://www.traveloka.com/en-id/");

        // click hotels button
        WebElement hotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        hotels.click();

        // enter city name
        WebElement placeField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/input"));
        placeField.sendKeys("bandung");

        Thread.sleep(3000);
        // click the first suggestion in the dropdown
        WebElement firstChoiceDropdown = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdown.click();

        WebElement searchHotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[5]/div[2]/div"));
        searchHotels.click();

        Thread.sleep(3000);
        WebElement firstHotel = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
        firstHotel.click();

        // switch to a new tab
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));


        WebElement savedButton = driver.findElement(By.xpath("//*[@id=\"room-search-bar\"]/div[1]/div[2]/div[3]/div/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        savedButton.click();

        WebElement loginRequiredTitle = driver.findElement(By.xpath("/html/body/div[23]/div/div[2]/div/h2"));

        // check if it has login requried
        Assert.assertEquals(loginRequiredTitle.getText(), "Login Required");
    }
    /**
     * Test case : UC5.20
     * short description :Tests the Saved list functionality (not loggedin)
     * condition : add the second hotel
     */
    @Test
    public void uc520addHotelToSavedWithoutLogin() throws InterruptedException {
        driver.get("https://www.traveloka.com/en-id/");

        // click hotels button
        WebElement hotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        hotels.click();

        // enter city name
        WebElement placeField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/input"));
        placeField.sendKeys("bandung");

        Thread.sleep(3000);
        // click the first suggestion in the dropdown
        WebElement firstChoiceDropdown = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdown.click();

        WebElement searchHotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[5]/div[2]/div"));
        searchHotels.click();

        Thread.sleep(3000);
        WebElement secondHotel = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[3]/div[2]/div[3]/div[2]/div"));
        secondHotel.click();

        // switch to a new tab
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));


        WebElement savedButton = driver.findElement(By.xpath("//*[@id=\"room-search-bar\"]/div[1]/div[2]/div[3]/div/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        savedButton.click();

        WebElement loginRequiredTitle = driver.findElement(By.xpath("/html/body/div[23]/div/div[2]/div/h2"));

        // check if it has login requried
        Assert.assertEquals(loginRequiredTitle.getText(), "Login Required");
    }


}
