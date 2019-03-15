import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout extends CommonAPI {

    public static void checkout(){
        WebElement cartCheck=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        cartCheck = driver.findElement(By.cssSelector("body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.ui-dialog-buttons > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-child(2) > span"));
        wait.until(ExpectedConditions.visibilityOf(cartCheck));
        cartCheck.click();
    }
}
