package stiw3034.group2.testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

import java.util.concurrent.TimeUnit;

public class JRSearchTest extends BaseDriverTest {

    @Test
    public void uc0610addAnotherValidCityDestination() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the JRPass feature button
        WebElement JRPass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[7]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JRPass.click();

        // Input the city name
        WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        destinationInput.sendKeys("Tokyo");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click the first suggestion in the drop-down
        WebElement chooseTokyo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]"));
        chooseTokyo.click();

        // Click the Search Passes button
        WebElement searchPasses = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[3]"));
        searchPasses.click();

        //Assert the input
        Assert.assertEquals(destinationInput,chooseTokyo.getText());

    }

    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    public void uc0620addAnotherInvalidCityDestination() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the JRPass feature button
        WebElement JRPass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[7]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JRPass.click();

        // Input the city name
        WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        destinationInput.sendKeys("sdfjklasdfas");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Choose the recommendation city
        WebElement chooseCity = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]"));
        chooseCity.click();


    }

    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    public void uc0630addMoreCitiesDestination() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the JRPass feature button
        WebElement JRPass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[7]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JRPass.click();


        // Input the cities name
        WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        destinationInput.sendKeys("Tokyo");
        destinationInput.sendKeys("Shinjuku");
        destinationInput.sendKeys("Kyoto");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click all the suggestions in the drop-down
        WebElement chooseTokyo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]/h3"));
        chooseTokyo.click();

        WebElement chooseKyoto = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[4]"));
        chooseKyoto.click();

        WebElement chooseShinjuku = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]"));
        chooseShinjuku.click();

        // Click the Search Passes button
        WebElement searchPasses = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[3]/div[2]/div"));
        searchPasses.click();

    }

    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    public void uc0640changeTheCityDestination() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the JRPass feature button
        WebElement JRPass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[7]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JRPass.click();


        // Input the city name
        WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        destinationInput.sendKeys("Tokyo");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the suggestion in the drop-down
        WebElement chooseTokyo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]/h3"));
        chooseTokyo.click();

        // Click the Search Passes button
        WebElement searchPasses = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[3]/div[2]/div"));
        searchPasses.click();

        //Click Change Search button
        WebElement changeSearch = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[1]/div[1]/div[2]/div/div[2]"));
        changeSearch.click();

        // Input the new city name
        WebElement newDestinationInput = driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        newDestinationInput.sendKeys("Shinjuku");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the suggestion in the drop-down
        WebElement chooseShinjuku = driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]/h3"));
        chooseShinjuku.click();

        // Click the Search Passes button
        WebElement secSearchPasses = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[3]/div[2]/div"));
        secSearchPasses.click();
    }

    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    public void uc0650sortingTheResult() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the JRPass feature button
        WebElement JRPass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[7]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JRPass.click();

        // Input the city name
        WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        destinationInput.sendKeys("Tokyo");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click the first suggestion in the drop-down
        WebElement chooseTokyo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[5]/h3"));
        chooseTokyo.click();

        // Click the Search Passes button
        WebElement searchPasses = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[3]/div[2]/div"));
        searchPasses.click();

        // Choose "Lowest Price" radio button to the new sorted list
        WebElement sortLowestPrice = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[3]/div[1]/div/div[2]/div[2]/div[2]"));
        sortLowestPrice.click();
    }
}

