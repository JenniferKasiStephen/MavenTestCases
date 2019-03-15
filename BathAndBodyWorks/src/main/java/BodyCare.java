import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BodyCare extends CommonAPI {

    public static void selectBodycare(){
        WebElement Bodycare = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        Bodycare = driver.findElement(By.cssSelector("#body-care-dropdown > a"));
        Bodycare.click();
    }
}

