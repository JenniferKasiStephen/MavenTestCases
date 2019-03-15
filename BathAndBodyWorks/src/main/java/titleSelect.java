import Basic.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class titleSelect extends CommonAPI {

    public static void title(){
        WebElement goSearch=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        goSearch = driver.findElement(By.cssSelector("#q"));
        goSearch.sendKeys("PINK PASSIONFRUIT & BANANA FLOWER", Keys.ENTER);
        driver.findElement(By.cssSelector("#wrapper > div.breadcrumb > span")).click();


    }
}
