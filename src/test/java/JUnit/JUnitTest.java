package JUnit;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class JUnitTest {

    @Test
    public void testNumbers(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\David Franzel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com");
        Assert.assertEquals(true,driver.getTitle().startsWith("Facebook"));
        driver.manage().window().maximize();
        System.exit(0);


        //region THIS IS AN EXAMPLE FROM ANOTHER PROJECT

//        @Autowired
//        private ElementRepository elementRepository;
//
//        @Test
//        public void testSaveElement(){
//            // setup element
//
//            Element element = new Element();
//            element.setElementName("Phone");
//
//            // save element and verify it has ID after the save
//
//            assertNull(element.getId());
//            elementRepository.save(element);
//            assertNotNull(element.getId());
//
//            //fetch
//            Element fetchedElement = elementRepository.findOne(element.getId());
//            assertNotNull(fetchedElement);
//            assertEquals(element.getId(), fetchedElement.getId());
//
//            //update
//            fetchedElement.setElementName("Email");
//            elementRepository.save(fetchedElement);
//
//            Element updatedElement = elementRepository.findOne(fetchedElement.getId());
//            assertEquals(updatedElement.getElementName(), "Email");
//
//        }
//
//        @Test
//        public void testSaveElementList(){
//            List<Element> elementList = new ArrayList<>();
//
//            elementList.add(new Element("Phone"));
//            elementList.add(new Element("Email"));
//            elementList.add(new Element("Laptop"));
//            elementList.add(new Element("PayRate"));
//
//            elementRepository.save(elementList);
//
//            Iterable<Element> fetchedElementList = elementRepository.findAll();
//
//            int count = 0;
//            for(Element element : fetchedElementList){
//                count++;
//            }
//
//            // gets an element from the previous test and includes it in the count
//            //assertEquals(4, count);
//
//        }
//
//        @Test
//        public void testFindByName(){
//            Element element = new Element("FindTestSingle");
//            elementRepository.save(element);
//
//            Element foundByNameElement = elementRepository.findByElementName("FindTestSingle");
//
//            assertEquals(element.getId(), foundByNameElement.getId());
//
//        }
//
//        @Test
//        public void testFindAllByElementName(){
//            Element element1 = new Element("FindTest");
//            elementRepository.save(element1);
//            Element element2 = new Element("FindTest");
//            elementRepository.save(element2);
//            Element element3 = new Element("FindTest");
//            elementRepository.save(element3);
//
//            List<Element> foundAllByNameElement = elementRepository.findAllByElementName("FindTest");
//
//            assertEquals(3, foundAllByNameElement.size());
//        }

        //end

    }

}
