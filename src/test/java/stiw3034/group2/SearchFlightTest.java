package stiw3034.group2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stiw3034.group2.common.BaseDriverTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class SearchFlightTest extends BaseDriverTest {

    /**
     * short description : Tests the search flight functionality (one-way)
     * this tests based on the following input
     * INPUT "Kuala Lumpur"
     * TO "Jakarta"
     */
    @Test
    @Ignore
    public void searchFlightOnlyFromAndToFields() {
        final String FROM = "Kuala Lumpur";
        final String TO = "Jakarta";

        // go to traveloka page
        driver.get("https://www.traveloka.com/en-id/");
        // find flights button
        WebElement flights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[1]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click flights button
        flights.click();

        // find 'from' input field and key in some value
        WebElement from = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/input"));
        from.click();
        from.sendKeys(FROM);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement firstChoiceDropdownFromField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(firstChoiceDropdownFromField.getText());
        firstChoiceDropdownFromField.click();


        // find 'to' input field and key in some value
        WebElement to = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/div/div[1]/input"));
        to.click();
        to.sendKeys(TO);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement firstChoiceDropdownToField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdownToField.click();

        // find searchFlightsButton and click it
        WebElement searchFlights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[2]"));
        searchFlights.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // get the title h3 text in search page e.g Jakarta (JKTA) → Kuala Lumpur (XKLA)
        WebElement searchTitle = driver.findElement(By.xpath("//*[@id=\"flight-ow-header\"]/div/div/div/div[1]/div/div/h3"));
        String[] splittedTitle = searchTitle.getText().split("→");

        // check if the title is the same as our input
        Assert.assertTrue(splittedTitle[0].trim().contains(FROM));
        Assert.assertTrue(splittedTitle[1].trim().contains(TO));
    }


    /**
     * short description : Tests the search flight functionality (roundtrip)
     * this tests based on the following input
     * INPUT "Kuala Lumpur"
     * TO "Jakarta"
     * Departure Date : Thu, 03 Feb 2022
     * Return Date: 2 Days ahead from Departure Date (Sat, 05 Feb 2022)
     */
    @Test
    @Ignore
    public void searchFlightFromAndToFieldsWithDepartureDate() throws InterruptedException {
        final String FROM = "Kuala Lumpur";
        final String TO = "Jakarta";

        // go to traveloka page
        driver.get("https://www.traveloka.com/en-id/");
        // find flights button
        WebElement flights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[1]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click flights button
        flights.click();

        // find 'from' input field and key in some value
        WebElement from = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/input"));
        from.click();
        Thread.sleep(600);
        from.sendKeys(FROM);

        Thread.sleep(2000);


        WebElement firstChoiceDropdownFromField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(firstChoiceDropdownFromField.getText());
        firstChoiceDropdownFromField.click();


        // find 'to' input field and key in some value
        WebElement to = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/div/div[1]/input"));
        to.click();
        to.sendKeys(TO);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement firstChoiceDropdownToField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdownToField.click();


        // click departure date
        WebElement departureDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]"));
        departureDate.click();

        // choose departure date
        WebElement secondSectionBoxDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]"));
        List<WebElement> boxes = secondSectionBoxDate.findElements(By.xpath("./child::*"));
        Thread.sleep(200);
        System.out.println(boxes.get(4).getText());
        boxes.get(4).click();

        WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]"));
        Thread.sleep(200);

        returnDate.click();


        // find searchFlightsButton and click it
        WebElement searchFlights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[2]"));
        searchFlights.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // get the title h3 text in search page e.g Jakarta (JKTA) → Kuala Lumpur (XKLA)
        WebElement searchTitle = driver.findElement(By.xpath("//*[@id=\"flight-rt-header\"]/div/div/div/div[1]/div/div[2]/h3"));
        String[] splittedTitle = searchTitle.getText().split("→");

        // check if the title is the same as our input
        Assert.assertTrue(splittedTitle[0].trim().contains(FROM));
        Assert.assertTrue(splittedTitle[1].trim().contains(TO));

        // check if the departure and return date are the same
    }

    /**
     * short description : Tests the search flight functionality (roundtrip) with gibberish input on from and to fields
     * this tests based on the following input
     * INPUT "jkljkj;jk"
     * TO "1nlfpsdr"
     * Departure Date : Thu, 03 Feb 2022
     * Return Date: 2 Days ahead from Departure Date (Sat, 05 Feb 2022)
     */
    @Test
//    @Ignore
    public void searchFlightFromAndToFieldsWithGiberrishInput() throws InterruptedException {
        final String FROM = "jkljkj;jk";
        final String TO = "1nlfpsdr";

        // go to traveloka page
        driver.get("https://www.traveloka.com/en-id/");
        // find flights button
        WebElement flights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[1]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click flights button
        flights.click();

        // find 'from' input field and key in some value
        WebElement from = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/input"));
        from.click();
        Thread.sleep(600);
        from.sendKeys(FROM);

        Thread.sleep(2000);


        // find 'to' input field and key in some value
        WebElement to = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/div/div[1]/input"));
        to.click();
        to.sendKeys(TO);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // click departure date
        WebElement departureDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]"));
        departureDate.click();

        // choose departure date
        WebElement secondSectionBoxDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]"));
        List<WebElement> boxes = secondSectionBoxDate.findElements(By.xpath("./child::*"));
        Thread.sleep(200);
        System.out.println(boxes.get(4).getText());
        boxes.get(4).click();

        WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]"));
        Thread.sleep(200);

        returnDate.click();


        // find searchFlightsButton and click it
        WebElement searchFlights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[3]"));
        searchFlights.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // get the title h3 text in search page e.g Jakarta (JKTA) → Kuala Lumpur (XKLA)
        WebElement searchTitle = driver.findElement(By.xpath("//*[@id=\"flight-rt-header\"]/div/div/div/div[1]/div/div[2]/h3"));
        String[] splittedTitle = searchTitle.getText().split("→");

        // check the title should not be the same as our input
        Assert.assertFalse(splittedTitle[0].trim().contains(FROM));
        Assert.assertFalse(splittedTitle[1].trim().contains(TO));
        // check if the departure and return date are the same
    }


    /**
     * short description : Tests the search flight functionality (roundtrip) with gibberish input on from and to fields
     * this tests based on the following input
     * INPUT "jkljkj;jk"
     * TO "1nlfpsdr"
     */
    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    //    @Ignore
    public void searchFlightFromAndToFieldsWithSameCity() throws InterruptedException {
        final String FROM = "jakarta";
        final String TO = "jakarta";

        // go to traveloka page
        driver.get("https://www.traveloka.com/en-id/");
        // find flights button
        WebElement flights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[1]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click flights button
        flights.click();

        // find 'from' input field and key in some value
        WebElement from = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/input"));
        from.click();
        Thread.sleep(600);
        from.sendKeys(FROM);

        Thread.sleep(2000);


        WebElement firstChoiceDropdownFromField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(firstChoiceDropdownFromField.getText());
        firstChoiceDropdownFromField.click();


        // find 'to' input field and key in some value
        WebElement to = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/div/div[1]/input"));
        to.click();
        to.sendKeys(TO);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement firstChoiceDropdownToField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/div/div[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firstChoiceDropdownToField.click();


        // click departure date
        WebElement departureDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]"));
        departureDate.click();

        // choose departure date
        WebElement secondSectionBoxDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]"));
        List<WebElement> boxes = secondSectionBoxDate.findElements(By.xpath("./child::*"));
        Thread.sleep(200);
        System.out.println(boxes.get(4).getText());
        boxes.get(4).click();

        WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]"));
        Thread.sleep(200);

        returnDate.click();


        // find searchFlightsButton and click it
        WebElement searchFlights = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[3]"));
        searchFlights.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // get the title h3 text in search page e.g Jakarta (JKTA) → Kuala Lumpur (XKLA)
        driver.findElement(By.xpath("//*[@id=\"flight-rt-header\"]/div/div/div/div[1]/div/div[2]/h3"));

    }
}
