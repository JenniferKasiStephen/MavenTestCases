import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectNewBodyCare extends CommonAPI {

    public static void gotobodycare(){
        WebElement NewBodyCare = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        NewBodyCare = driver.findElement(By.xpath("//*[@id=\"secondary\"]/div[2]/div[2]/div[2]/ul[1]/li[1]/a"));
        NewBodyCare.click();

    }


}
