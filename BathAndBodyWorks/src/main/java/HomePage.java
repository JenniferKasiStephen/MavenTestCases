import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {

    static String Homepageurl = "https://www.bathandbodyworks.com/";

    public static void navigateToHomePage(){
        String title = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
        driver.navigate().to(Homepageurl);
        driver.findElement(By.cssSelector("body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.global-email-dialog.ui-draggable > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon-primary.ui-icon.ui-icon-closethick")).click();//navigate will allow to go back a nd forth in the browser
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),title);
    }

}
