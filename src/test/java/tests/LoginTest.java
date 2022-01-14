package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("lena012022-fse8@force.com", "lenor4ik")
                .isPageOpen();
        assertTrue(isHomePageOpened, "HomePage is not open");
    }
}
