import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PG5 {


    public static void main(String [] args) {
        //does this change in github
        //set up web driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String baseURL2 = "http://demo.guru99.com/test/newtours/";
        driver.get(baseURL2);

        //implict wait (works for everything on the run)
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*creating an explicit wait (works for one line only)
        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);

        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        */




         //switching frames stuff
        String alertMessage = "";
        String baseURL = "http://jsbin.com/usidix/1";
       /* driver.get(baseURL);
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();

        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(alertMessage);
        driver.quit();
*/

//catching exceptions
        driver.get(baseURL2);
        WebElement txtbox_username = driver.findElement(By.name("userName"));
        try {
            if (txtbox_username.isEnabled()) {
                txtbox_username.sendKeys("tutorial");
            }
        }

        catch(NoSuchElementException nsee){
            System.out.println(nsee.toString());
        }






    }


}
