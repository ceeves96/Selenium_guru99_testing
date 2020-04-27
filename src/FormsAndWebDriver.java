import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FormsAndWebDriver {


    public static void main(String[] args){
        //findingElements1();
        //radioButtons();
        //checkBoxes();
        //facebookCheckbox();
        //imgElements();
        //dropdownSelector();

        multiSelector();
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

        //you can clear the textboxes with
        //email.clear();
        //password.clear();

        WebElement login = driver.findElement(By.id("SubmitLogin"));
        //login.click();

        //you can also submit by calling the submit method on the any form element or on the button itself
        login.submit();
        //password.submit();

        driver.close();


    }


    public static void radioButtons(){
        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");

        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));

        radio1.click();

        System.out.println("the first radio button has been clicked");

        radio2.click();

        System.out.println("now we clicked the second button");

        driver.close();
    }

    public static void checkBoxes(){

        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        WebElement chk1 = driver.findElement(By.id("vfb-6-0"));
        chk1.click();

        //is it selected?
        if(chk1.isSelected()){
            System.out.println("checkbox 1 is selected");
        }else{
            System.out.println("checkbox 1 is NOT selected");
        }

        //this should toggle it off again
        chk1.click();
        if(chk1.isSelected()){
            System.out.println("checkbox 1 is selected");
        }else{
            System.out.println("checkbox 1 is NOT selected");
        }

        driver.close();

    }

    public static void facebookCheckbox(){
        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/facebook.html");
        driver.manage().window().maximize();

        WebElement fbCheckbox = driver.findElement(By.id("persist_box"));

        for(int i=0; i < 2; i++){
            fbCheckbox.click();
            System.out.println("Facebook CheckBox status is: " + fbCheckbox.isSelected());
        }

        driver.close();


    }

    public static void imgElements(){

        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/identify?ctx=recover");
        driver.manage().window().maximize();

        //click on the facebook logo and return to hompeage
        driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();

        //verify we are now on fb homepage
        if (driver.getTitle().equals("Facebook – log in or sign up")){
            System.out.println("success, back at the homepage");
        }
        else {
            System.out.println("failure, we ain't on the homepage");
        }

        driver.close();
    }

        public static void dropdownSelector(){
            //set up chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            String toursURL = "http://demo.guru99.com/test/newtours/register.php";


            driver.get(toursURL);
            driver.manage().window().maximize();

            Select drpCountry = new Select(driver.findElement(By.name("country")));
            drpCountry.selectByVisibleText("ANTARCTICA");

            System.out.println("success - it selected antarctica");

            driver.close();

        }

        public static void multiSelector(){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\6601\\Documents\\Training\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String multiSelectURL = "http://jsbin.com/osebed/2";
            driver.get(multiSelectURL);

            Select fruits = new Select(driver.findElement(By.id("fruits")));
            fruits.selectByVisibleText("Banana");
            fruits.selectByIndex(1);

            //it selected both banana and apple, 0&1 in the list

        }

}
