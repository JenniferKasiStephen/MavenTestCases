import org.testng.annotations.Test;

public class TestSeletProductType extends SelectProductType {

    @Test
    public static void dropProducttype(){
        HomePage.navigateToHomePage();
        Login.openLogin();
        Login.clickSignin();
        BodyCare.selectBodycare();
        SelectNewBodyCare.gotobodycare();
        ProductSelect.product();
        SelectProductType.type();
    }
}
