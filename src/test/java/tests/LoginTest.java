package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("ev.sharnikova-zvlc@force.com", "Sharnikova2021")
                .isPageOpen();
        assertTrue(isHomePageOpened, "HomePage is not open");
    }
}
