package LifeStats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LifeStatsApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(LifeStatsApplication.class, args);

		WebDriver driver = new FirefoxDriver(); //new object instantiation to open firefox
		//end Firefox setup
		//for Internet Explorer
		//System.setProperty("webdriver.ie.driver","path of file");
		//WebDriver driver = new InternetExplorerDriver();
		//end IE setup
		driver.get("http://www.wikipedia.org"); //sends http request
		WebElement link; //instantiates link
		link = driver.findElement(By.linkText("English")); //sets value of link to look for
		link.click(); //click action of link
		Thread.sleep(5000); //stops application for 5 seconds
		WebElement searchBox; //instantiates new action
		searchBox = driver.findElement(By.id("searchInput")); //sets object to value
		searchBox.sendKeys("Software"); //assigns a value to the keys
		searchBox.submit(); //submits the search request
		Thread.sleep(5000); //stops the process for 5 seconds
		driver.quit(); //then quits the whole application

	}

}
