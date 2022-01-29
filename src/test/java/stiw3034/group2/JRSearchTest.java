package stiw3034.group2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

import java.util.concurrent.TimeUnit;

public class JRSearchTest extends BaseDriverTest {
    @Test
    public void searchFood() {
        driver.get("https://www.traveloka.com/en-id/");
        WebElement eatsBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[5]"));

        eatsBtn.click();

        WebElement areaInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div[1]/div[2]/div/div/div[1]/input"));

        areaInput.sendKeys("pizza");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addAnotherValidCityDestination() {
        driver.get("https://www.traveloka.com/en-id/");

        WebElement JRPass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[7]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JRPass.click();


        WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        destinationInput.sendKeys("Tokyo");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement chooseTokyo =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]"));
        chooseTokyo.click();


        WebElement searchPasses = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[3]"));
        searchPasses.click();

    }

    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    public void addAnotherInvalidCityDestination() {
        driver.get("https://www.traveloka.com/en-id/");

        WebElement JRPass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[7]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JRPass.click();


        WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/input"));

        destinationInput.sendKeys("sdfjklasdfas");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement chooseCity =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[3]"));
        chooseCity.click();


    }
}
