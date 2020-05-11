import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class alertsAndBoxes {


    public static void main(String args[]) throws InterruptedException {

        handleAlert();

    }

    public static void handleAlert() throws NoAlertPresentException, InterruptedException {

        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

       WebElement custID = driver.findElement(By.name("cusid"));
       custID.sendKeys("12345");
       custID.submit();

       //switching to alert
        Alert alert = driver.switchTo().alert();

        //get text from alert
        String alertMsg = driver.switchTo().alert().getText();

        //display alert message
        System.out.println(alertMsg);
        Thread.sleep(5000);

        //accept alert
        alert.accept();

    }

    public static void alertMethods(){
        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //to click on the cancel button of an alert
        driver.switchTo().alert().dismiss();

        //to click the OK button of the alert
        driver.switchTo().alert().accept();

        //to capture / get text of the alert message
        driver.switchTo().alert().getText();

        //to send some text yo alert box
        driver.switchTo().alert().sendKeys("Text goes here");

    }



    public static void windowHandle(){

        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launching the site.
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("CR@gmail.com ");

                                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
}
