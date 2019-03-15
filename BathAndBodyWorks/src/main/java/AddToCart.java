import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCart extends CommonAPI {

    public static void cart(){
        WebElement getCart=null;
        getCart=driver.findElement(By.cssSelector("#add-to-cart"));
        getCart.click();

    }
}
