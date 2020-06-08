import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTables {

    public static void main(String args[]){

       // xPath();
       // innerTable();
       // flightTable();
        copyXpath();
    }


    //learning how to write an xpath
        public static void xPath() {


            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://demo.guru99.com/test/write-xpath-table.html");

            // //parent element[table]/next element[tbody]/it is the 2nd tr[2]/it is the 2nd td[2]
            String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();

            System.out.println(innerText);
            driver.quit();


        }

        public static void innerTable(){
            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://demo.guru99.com/test/accessing-nested-table.html");

            //get the inner text of a table within a table
            String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
            System.out.println(innerText);
            driver.quit();

        }

        public static void flightTable(){
            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://demo.guru99.com/test/newtours/");

            String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
            System.out.println(innerText);
            driver.quit();





        }
//you can copy an xpath by using the inspect element tool, right clicking, copy xpath and pasting below.
        public static void copyXpath(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://demo.guru99.com/test/newtours/");

            String innerText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")).getText();
            System.out.println(innerText);
            driver.quit();



    }
}
