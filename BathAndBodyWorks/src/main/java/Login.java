import Basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends CommonAPI {

    public static void openLogin() {
        WebElement loginbutton = null;
        WebElement loginPage = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        loginbutton = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg"));
        wait.until(ExpectedConditions.visibilityOf(loginbutton));
        loginbutton.click();
       driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.addOn.stickyOn > div.wrap > div.icon-items > ul > li > div > div > a:nth-child(1)")).click();
    }

    public static void clickSignin(){
        WebElement username=null;
        WebElement password = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        username = driver.findElement(By.cssSelector("#dwfrm_login_username"));
        username.sendKeys("jenniferkasi234@gmail.com");
        password = driver.findElement(By.cssSelector("#dwfrm_login_password"));
        password.sendKeys("123456Abc");
        driver.findElement(By.cssSelector("#dwfrm_login > fieldset > div.form-row.form-row-button > button")).click();

    }
}
