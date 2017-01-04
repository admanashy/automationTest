package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class GoogleTest {
    public static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
    }

    //@After
    //public void tearDown(){
    //    driver.close();
    //}

    @Test
    public void googleTest() throws InterruptedException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        capabilities.setCapability("chrome.binary","chromedriver/chromedriver.exe");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(capabilities);
        //driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("Webdriver");
        Thread.sleep(2000);
        WebElement find = driver.findElement(By.name("btnG"));
        find.click();
        Thread.sleep(2000);
    }
}


