import org.testng.annotations.Test;

public class TestLogin extends Login{
    @Test
    public static void openLoginTest(){
        HomePage.navigateToHomePage();
        Login.openLogin();
        Login.clickSignin();
    }
}


