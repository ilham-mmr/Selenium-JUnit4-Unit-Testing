package stiw3034.group2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverAllTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SavedListTest extends BaseDriverAllTest {

    @Test
    public void addHotelToSavedWithoutLogin() throws InterruptedException {
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

        WebElement loginRequiredTitle = driver.findElement(By.xpath("/html/body/div[29]/div/div[2]/div/h2"));

        // check if it has login requried
        Assert.assertEquals(loginRequiredTitle.getText(), "Login Required");
    }

    @Test
    @Ignore
    public void addHotelToSavedLoggedIn() throws InterruptedException {
        driver.get("https://www.traveloka.com/en-id/");
        // click login button
        WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[4]/div[1]/div/div"));
        login.click();

        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        emailField.sendKeys("ilhamuum0919@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordField.sendKeys("ilham321");

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[4]/div[2]/div/div/div/div[1]/div[3]/div[1]/div[2]/div"));
        loginBtn.click();

        Thread.sleep(1000);

        WebElement confirmation = driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div/a"));
        confirmation.click();

        // sleep so a tester can manually put the code
        Thread.sleep(20000);



        // click hotels button
        WebElement hotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[1]/div/div/div[1]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        hotels.click();


        // enter city name
        WebElement placeField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/input"));
        placeField.sendKeys("bandung");

        Thread.sleep(3000);
        // click the first suggestion in the dropdown
        WebElement firstChoiceDropdown = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdown.click();

        WebElement searchHotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[5]/div[2]/div"));
        searchHotels.click();

        Thread.sleep(3000);

        WebElement modalButton = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[1]/div[2]/div[3]/div[2]/div[3]/div[102]/div/div/div/div/div/div/div/div[4]/button"));
        modalButton.click();

        Thread.sleep(3000);
        WebElement firstHotel = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[3]/div[2]/div[3]/div[1]/div"));
        firstHotel.click();

        // switch to a new tab
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));


        WebElement savedButton = driver.findElement(By.xpath("//*[@id=\"OVERVIEW\"]/div[1]/div[1]/div[1]/div/span/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        savedButton.click();

    }
}
