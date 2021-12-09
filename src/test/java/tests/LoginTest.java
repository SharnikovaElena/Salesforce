package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
//      boolean isHomePageOpened = loginPage
        loginPage.open();
        loginPage.isPageOpen();
        loginPage.login("ev.sharnikova-zvlc@force.com", "Sharnikova2021");
        assertTrue(homePage.isPageOpen(), "HomePage is not open");
    }

}
