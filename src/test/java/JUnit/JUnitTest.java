package JUnit;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitTest {

    @Test
    public void testNumbers(){
        Assert.assertEquals(1,1);
        Assert.assertEquals(1,1);
        Assert.assertEquals(1,1);

        System.setProperty("webdriver.chrome.driver","C:\\Users\\David Franzel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com");
        Assert.assertEquals(true,driver.getTitle().startsWith("Facebook"));
        driver.manage().window().maximize();
        System.exit(0);

    }

}
