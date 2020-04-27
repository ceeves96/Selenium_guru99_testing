import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElementLearning {



       public static void exercise1() {
            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //go to webpage
            driver.get("http://demo.guru99.com/test/ajax.html");

            //find the radio btton for no using its ID
            driver.findElement(By.id("no")).click();

            //click on check button
            driver.findElement(By.id("buttoncheck")).click();

            //close it
            driver.close();
        }

        public static void exercise2() {

            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/test/ajax.html");

            List<WebElement> elements = driver.findElements(By.name("name"));

            System.out.println("Number of elements: " + elements.size());

            //basic for loop

            for (int i = 0; i < elements.size(); i++) {
                System.out.println("Radio button text: " + elements.get(i).getAttribute("value"));
            }



            driver.close();
        }


    public static void main(String[] args) {

           exercise1();
           exercise2();

    }


}
