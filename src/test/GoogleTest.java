package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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
        driver = new ChromeDriver();
        driver.get("http://sta-kiv-gt1-setup01-spp-01.nix.cydmodule.com:8080/admin/tester.jsp");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.cssSelector("input[name=login]"));
        login.sendKeys("manager");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("manager");
        Thread.sleep(2000);
        WebElement goToTester = driver.findElement(By.cssSelector("input[value=Login]"));
        goToTester.click();

        //find.click();
        //Thread.sleep(2000);
    }
}


