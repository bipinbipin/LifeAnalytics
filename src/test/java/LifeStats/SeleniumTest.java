package LifeStats;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by David Franzel on 5/4/2017.
 */

public class SeleniumTest {

    @Test
    public void SeleniumWebDriverTest() throws InterruptedException{


        //sets the system property for chrome driver location
        System.setProperty("webdriver.chrome.driver","C:\\Users\\David Franzel\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //instantiates driver object and opens chrome
        WebDriver driver = new ChromeDriver();

        //maximizes window
        driver.manage().window().maximize();

        //navigates to page of your choice
        driver.get("http://localhost:8080/new-entry");

        //locates a WebElement object and clicks
        WebElement toggleBox = driver.findElement(By.className("show-all-btn"));
        toggleBox.click();

        //populates all inputs/checkboxes etc. by targeting name
        WebElement input = driver.findElement(By.name("vegFruit"));
        input.sendKeys("4");
        input = driver.findElement(By.name("carbohydrate"));
        input.sendKeys("6");
        input = driver.findElement(By.name("dairy"));
        input.sendKeys("1");
        input = driver.findElement(By.name("protein"));
        input.sendKeys("5");
        input = driver.findElement(By.name("sugar"));
        input.sendKeys("1");
        input = driver.findElement(By.name("dietNotes"));
        input.sendKeys("Drank lots of coffee!");
        input = driver.findElement(By.name("run"));
        input.sendKeys("2");
        input = driver.findElement(By.name("bike"));
        input.sendKeys("0");
        input = driver.findElement(By.name("bench"));
        input.sendKeys("200");
        input = driver.findElement(By.name("dip"));
        input.sendKeys("40");
        input = driver.findElement(By.name("pullUp"));
        input.sendKeys("32");
        input = driver.findElement(By.name("exerciseNotes"));
        input.sendKeys("Felt more tired today.");
        input = driver.findElement(By.name("energyLevel"));
        input.sendKeys("4");
        input = driver.findElement(By.name("sleepHours"));
        input.sendKeys("6");
        input = driver.findElement(By.name("sleepQuality"));
        input.sendKeys("5");
        input = driver.findElement(By.name("sick"));
        input.click();
        input = driver.findElement(By.name("healthNotes"));
        input.sendKeys("Overall feeling very healthy!");
        input = driver.findElement(By.name("temperature"));
        input.sendKeys("65");
        input = driver.findElement(By.name("precipitation"));
        Select select = new Select(input);
        select.selectByValue("rain");
        input = driver.findElement(By.name("sunExposure"));
        input.sendKeys("35");
        input = driver.findElement(By.name("lifeThreatened"));
        input.click();
        input = driver.findElement(By.name("financialStress"));
        input.click();
        input = driver.findElement(By.name("environmentNotes"));
        input.sendKeys("My tribe is doing well. ");
        input = driver.findElement(By.name("interactions"));
        input.sendKeys("4");
        input = driver.findElement(By.name("interactionQuality"));
        input.sendKeys("3");
        input = driver.findElement(By.name("socialNotes"));
        input.sendKeys("My people have taken the red-pill. ");
        input = driver.findElement(By.name("reading"));
        input.click();
        input = driver.findElement(By.name("video"));
        input = driver.findElement(By.name("podcast"));
        input.click();
        input = driver.findElement(By.name("conversation"));
        input.click();
        input = driver.findElement(By.name("intellectualQuality"));
        input.sendKeys("4");
        input = driver.findElement(By.name("workHours"));
        input.sendKeys("10");
        input = driver.findElement(By.name("workQuality"));
        input.sendKeys("4");
        input = driver.findElement(By.name("workNotes"));
        input.sendKeys("Felt very productive in the morning. ");
        input = driver.findElement(By.name("actualizationLevel"));
        input.sendKeys("6");
        input = driver.findElement(By.name("closingNotes"));
        input.sendKeys("Today was a decent day.");
        Thread.sleep(10000);
        input.submit();


//        driver.quit();


//        String title = driver.getTitle();
//        System.out.println(title);
//        WebElement link = driver.findElement(By.id("js-link-box-en"));
//        link.click();
//        Thread.sleep(2000);
//        WebElement searchBox;
//        searchBox = driver.findElement(By.id("searchInput"));
//        searchBox.clear();
//        searchBox.sendKeys("David ");
//        searchBox.sendKeys("Franzel");
//        searchBox.submit();
//
//        Thread.sleep(2000);
////		driver.quit();
//        driver.close();
//        System.exit(0);
/*
        //kinds of Locator Types
        //gets by ID
        driver.findElement(By.id(""));
        //gets by CLASS
        driver.findElement(By.className(""));
        //gets by TEXT-VALUE
        driver.findElement(By.linkText(""));
        //gets by SUB-LINK-TEXT
        driver.findElement(By.partialLinkText(""));
        //gets by NAME
        driver.findElement(By.name(""));
        //gets by XPATH
        driver.findElement(By.xpath(""));
        //gets by cssSelector
        driver.findElement(By.cssSelector(""));
        //gets by TAGNAME
        driver.findElement(By.tagName(""));
*/
    }

}
