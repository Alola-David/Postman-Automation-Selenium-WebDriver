package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PostmanLogin {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://identity.getpostman.com/login?addAccount=1");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        //Locate Username field
        driver.findElement(By.id("username")).sendKeys("alolaa.david@gmail.com");
        //Locate password field
        driver.findElement(By.id("password")).sendKeys("PasswordUiTesting");
        //Click on the Sign in button
        driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/form/div[4]/button")).click();

    }
    //Close the browser after
    public static void main(String args[]){
        PostmanLogin test = new PostmanLogin();
        test.setUp();
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
        driver.quit();
    }
}
