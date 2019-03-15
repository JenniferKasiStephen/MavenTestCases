import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProductType extends CommonAPI {

    public static void type() {
        WebElement product = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        product = driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType > h3 > i"));
        product.click();
    }
    }