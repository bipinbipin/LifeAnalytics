package LifeStats;


import LifeStats.configuration.RepositoryConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by David Franzel on 5/4/2017.
 */

public class SeleniumTests {

    @Test
    public void SeleniumWebDriverTest() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\David Franzel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org");
        String title = driver.getTitle();
        System.out.println(title);
        WebElement link;
        link = driver.findElement(By.id("js-link-box-en"));
        link.click();
        Thread.sleep(2000);
        WebElement searchBox;
        searchBox = driver.findElement(By.id("searchInput"));
        searchBox.clear();
        searchBox.sendKeys("David ");
        searchBox.sendKeys("Franzel");
        searchBox.submit();
        WebElement link1;

        link1 = driver.findElement(By.className("mw-search-result-heading"));

        Thread.sleep(2000);
//		driver.quit();
        driver.close();
        System.exit(0);
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