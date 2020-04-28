import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class filesUploadDownload {




    public static void main(String[] args){
        upload();

    }

    public static void upload(){

        String baseURL = "http://demo.guru99.com/test/upload/";
        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseURL);

        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        //enter the file path onto the file selection input field
        uploadElement.sendKeys("C:\\Users\\6601\\Documents\\testFile.txt");

        //check the terms of service box
        driver.findElement(By.id("terms")).click();

        //click the upload file button
        driver.findElement(By.name("send")).click();

    }



}
