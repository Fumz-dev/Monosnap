package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MonosnapLogin {

    public void setUp() throws InterruptedException
    { System.setProperty("webdriver.chrome.driver","Resource/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://monosnap.com/");

        Thread.sleep(5000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("funmi887@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("funmilola123");
        driver.findElement(By.id("signinbutton")).click(); }

    public static void main(String args[]) throws InterruptedException {
        MonosnapLogin test = new MonosnapLogin();
        test.setUp();
    }
}
