package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public  class CommonAPI {

    public static WebDriver driver = null;
    String url = null;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/jenniferstephen/Documents/JavaPrograms/SeleniumProject1/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterClass
    public void cleanUp() {
        //driver.close();
    }


        @Test
        public void test2() {
            driver.findElement(By.id("q")).sendKeys("Single Wick Candles", Keys.ENTER);
        }

        @Test
        public void test3(){
        driver.findElement(By.cssSelector("#dwfrm_login_username")).sendKeys("jennifer234@gmail.com");
        }




    }





