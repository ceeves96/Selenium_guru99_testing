
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class linksAndTables {

    public static void main(String[] args) {

        //linkedText();
        //partialLinkedText();
        caseSensLinkText();

    }

        //accessing by linked text
    /*when there are two linked texts both with the text 'click here' selenium will click the first one only*/
        public static void linkedText() {
            String baseURL = "http://demo.guru99.com/test/link.html";

            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get(baseURL);
            driver.findElement(By.linkText("click here")).click();

            System.out.println("title of page is: " + driver.getTitle());

            driver.quit();
        }

        public static void partialLinkedText(){

            /*
            Accessing links using a part of their text is by.partiallinktext. for example, two links one is 'go here'
            and one is 'click here' if we search for 'here' it will automatically pick the first link with the text 'here'
             */
            String baseURL2 = "http://demo.guru99.com/test/accessing-link.html";

            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get(baseURL2);
            driver.findElement(By.partialLinkText("here")).click();

            System.out.println("title of page is: " + driver.getTitle());

            driver.quit();


        }

        public static void caseSensLinkText(){

            /* Accessing 2 links one which is 'REGISTER' one which is 'Register'. We must specify the capital
            letters to get the desired result
             */

            String baseURL3 = "http://demo.guru99.com/test/newtours/";

            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get(baseURL3);

            String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
            System.out.println(theLinkText);

            theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
            System.out.println(theLinkText);

            driver.close();
        }




}
