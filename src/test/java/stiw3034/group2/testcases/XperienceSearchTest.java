package stiw3034.group2.testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

public class XperienceSearchTest extends BaseDriverTest {

    @Test
    public void uc0710searchActivitiesInjakarta() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the Xperience feature button
        WebElement xperienceBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[10]/div"));
        xperienceBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Input the city name as the destination
        WebElement input = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/input"));

        input.click();
        input.sendKeys("Jakarta");

        //Assert the input
        Assert.assertEquals(input,("Jakarta"));

    }
    @Test
    public void uc0720searchActivitiesWithGibberishInput() {
        driver.get("https://www.traveloka.com/en-id/");

        WebElement xperienceBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[10]/div"));
        xperienceBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement input = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/input"));

        input.click();
        input.sendKeys("asdfas");

    }
    @Test
    public void uc0730filteringTheSearchResult() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the Xperience feature button
        WebElement xperienceBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[10]/div"));
        xperienceBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Input the city name as the destination
        WebElement input = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/input"));

        input.click();
        input.sendKeys("Jakarta");

        //Click the Special Promo checklist under More FIlter menu
        WebElement specialPromo = driver.findElement(By.xpath("//*[@id=\"filter-section\"]/div[3]/div[2]/div[1]/div/div/div[2]/div"));
        specialPromo.click();

    }
    @Test
    public void uc0740sortingTheResultWithMostPopular() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the Xperience feature button
        WebElement xperienceBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[10]/div"));
        xperienceBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Input the city name as the destination
        WebElement input = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/input"));

        input.click();
        input.sendKeys("Jakarta");

        //Click the Sort By Drop-down menu
        WebElement sortByDropDownMenu = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div/div[1]/div/h4"));
        sortByDropDownMenu.click();

        //Click the Most Popular option
        WebElement mostPopularOpt = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]"));
        mostPopularOpt.click();

    }
    @Test
    public void uc0750sortingtheResultWithTrendingNow() {
        // Go to Traveloka site
        driver.get("https://www.traveloka.com/en-id/");

        // Click the Xperience feature button
        WebElement xperienceBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[10]/div"));
        xperienceBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Input the city name as the destination
        WebElement input = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/input"));

        input.click();
        input.sendKeys("Jakarta");

        //Click the Sort By Drop-down menu
        WebElement sortByDropDownMenu = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div/div[1]/div/h4"));
        sortByDropDownMenu.click();

        //Click the Trending Now option
        WebElement mostPopularOpt = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]"));
        mostPopularOpt.click();
    }
}

