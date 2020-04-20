import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {

    public static void main(String[] args) {

        //set up web driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        //launch chrome and direct it to base url
        driver.get(baseUrl);

        //get the actual value of the title
       actualTitle = driver.getTitle();

       if (actualTitle.contentEquals(expectedTitle)) {
           System.out.println("Test Passed!");
       }
       else {
           System.out.println("Test Failed");
       }

       //close browser
        driver.close();




       }



    }

