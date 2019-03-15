import org.testng.annotations.Test;

public class TestProduct extends ProductSelect {
    
    @Test
    public static void gotoproduct(){
        HomePage.navigateToHomePage();
        Login.openLogin();
        Login.clickSignin();
        BodyCare.selectBodycare();
        SelectNewBodyCare.gotobodycare();
        ProductSelect.product();
    }
}
