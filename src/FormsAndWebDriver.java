import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FormsAndWebDriver {


    public static void main(String[] args){
        findingElements1();
    }

    public static void findingElements1(){
        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/login.html");

        //get the email address web element
        WebElement email = driver.findElement(By.id("email"));

        //get the password web element
        WebElement password = driver.findElement(By.name("passwd"));

        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefgh1jkl");



    }




}
