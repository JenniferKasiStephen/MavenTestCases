import org.testng.annotations.Test;

public class TestNewBodyCare extends SelectNewBodyCare{

    @Test
    public void care(){
        HomePage.navigateToHomePage();
        Login.openLogin();
        Login.clickSignin();
        BodyCare.selectBodycare();
        SelectNewBodyCare.gotobodycare();
    }
}
