package stiw3034.group2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchHotelTest extends BaseDriverTest {
    /**
     * short description :  Tests the search hotel functionality
     * this tests based on the following input
     * City, destination, or hotel name: "Bandung"
     * Check in date : Feb 1, 2022
     * duration max : 30
     */
    @Test
//    @Ignore
    public void searchHotelDurationMax() throws InterruptedException {
        String cityName = "bandung";
        String checkin = "Feb 1, 2022";
        // go to the page
        driver.get("https://www.traveloka.com/en-id/");

        // click hotels button
        WebElement hotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        hotels.click();

        // enter city name
        WebElement placeField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/input"));
        placeField.sendKeys(cityName);

        Thread.sleep(3000);
        // click the first suggestion in the dropdown
        WebElement firstChoiceDropdown = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdown.click();

        // choose check in date
        WebElement checkInDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div[1]/div/div[1]"));
        checkInDate.click();

        // get the box of section 2 of calendar
        WebElement section2Calendar = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]"));
        List<WebElement> boxes = section2Calendar.findElements(By.xpath("./child::*"));
        boxes.get(2).click();

        List<WebElement> durations = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/child::*"));
        // choose the max duration
        WebElement duration30Night = durations.get(durations.size() - 1);
        Thread.sleep(500);
        duration30Night.click();

        // assert that the result city is the same

        WebElement searchHotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[5]/div[2]/div"));
        searchHotels.click();

        // get search result title
        // city
        WebElement city = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[1]/div/div/div[1]"));
        String cityResult = city.getText();

        WebElement rangeDate = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[1]/div/div/div[2]"));
        String rangeDateResult = rangeDate.getText();

        Assert.assertTrue(cityResult.toLowerCase().contains(cityName));
        Assert.assertTrue(rangeDateResult.contains(checkin));
    }

    /**
     * short description :  Tests the search hotel functionality
     * this tests based on the following input
     * City, destination, or hotel name: "bandung"
     * Check in date : Feb 1, 2022
     * duration max : 1
     * adult number : 3
     */
    @Test
//    @Ignore
    public void searchHotelDurationMin() throws InterruptedException {
        String cityName = "bandung";
        String checkin = "Feb 1, 2022";
        // go to the page
        driver.get("https://www.traveloka.com/en-id/");

        // click hotels button
        WebElement hotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        hotels.click();

        // enter city name
        WebElement placeField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/input"));
        placeField.sendKeys(cityName);

        Thread.sleep(3000);
        // click the first suggestion in the dropdown
        WebElement firstChoiceDropdown = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdown.click();

        // choose check in date
        WebElement checkInDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div[1]/div/div[1]"));
        checkInDate.click();

        // get the box of section 2 of calendar
        WebElement section2Calendar = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]"));
        List<WebElement> boxes = section2Calendar.findElements(By.xpath("./child::*"));
        boxes.get(2).click();

        List<WebElement> durations = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/child::*"));
        // choose the max duration
        WebElement duration1Night = durations.get(0);
        Thread.sleep(500);
        duration1Night.click();

        // assert that the result city is the same

        WebElement searchHotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[5]/div[2]/div"));
        searchHotels.click();

        // get search result title
        // city
        WebElement city = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[1]/div/div/div[1]"));
        String cityResult = city.getText();
        System.out.println(cityResult);

        WebElement rangeDate = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[1]/div/div/div[2]"));
        String rangeDateResult = rangeDate.getText();

//        Assert.assertFalse(cityResult.toLowerCase().contains(cityName));
        Assert.assertTrue(rangeDateResult.contains(checkin));
    }

    /**
     * short description :  Tests the search hotel functionality
     * this tests based on the following input
     * City, destination, or hotel name: "asdfasdfadfsadf"
     * Check in date : Feb 1, 2022
     * duration max : 30
     * cannot view the hotels
     */
    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    @Ignore
    public void searchHotelwithGibberishInput() throws  InterruptedException {
        String cityName = "asdfasdfadfsadf";
        String checkin = "Feb 1, 2022";
        // go to the page
        driver.get("https://www.traveloka.com/en-id/");

        // click hotels button
        WebElement hotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        hotels.click();

        // enter city name
        WebElement placeField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/input"));
        placeField.sendKeys(cityName);

//        Thread.sleep(3000);
//        // click the first suggestion in the dropdown
//        WebElement firstChoiceDropdown = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div"));
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        firstChoiceDropdown.click();

        // choose check in date
        WebElement checkInDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div[1]/div/div[1]"));
        checkInDate.click();

        // get the box of section 2 of calendar
        WebElement section2Calendar = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]"));
        List<WebElement> boxes = section2Calendar.findElements(By.xpath("./child::*"));
        boxes.get(2).click();

        List<WebElement> durations = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/child::*"));
        // choose the max duration
        WebElement duration30Night = durations.get(durations.size() - 1);
        Thread.sleep(500);
        duration30Night.click();

        // assert that the result city is the same

        WebElement searchHotels = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5    ]/div[2]/div[1]/div/div/div[3]/div[2]/div/div[5]/div[2]/div"));
        searchHotels.click();

        // get search result title
        // city
        WebElement city = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[1]/div/div/div[1]"));
        String cityResult = city.getText();

        WebElement rangeDate = driver.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[1]/div/div/div[2]"));
        String rangeDateResult = rangeDate.getText();

    }
}
