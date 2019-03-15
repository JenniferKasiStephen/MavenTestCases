import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSelect extends CommonAPI {

    public static void product(){
        WebElement SelectProduct=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        SelectProduct = driver.findElement(By.cssSelector("#\\32 6ee6803b54d53d08711ab72ea > div.product-outline-block > a > div.product-image > div > div > div > img"));
        wait.until(ExpectedConditions.visibilityOf(SelectProduct));
        SelectProduct.click();
        driver.navigate().back();
    }
}
