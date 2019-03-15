import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductOn extends CommonAPI {

    public static void Productcream(){
        WebElement Cream=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        Cream= driver.findElement(By.cssSelector("#\\32 dda07ee14757ccad658ace668 > div.product-outline-block > a > div.product-cont > div.product-name"));
        Cream.click();
    }
}
