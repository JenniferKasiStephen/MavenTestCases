import org.testng.annotations.Test;

public class TestSelectBodycare extends BodyCare {

    @Test
    public static void openBodycare() {
        HomePage.navigateToHomePage();
        Login.openLogin();
        Login.clickSignin();
        BodyCare.selectBodycare();
    }
}
