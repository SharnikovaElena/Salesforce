package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExit(LOGIN_BUTTON);
    }

    public LoginPage open() {
        log.debug("Start open method on LoginPage");
        driver.get(Base_URL);
        log.debug("Completing the open method on the LoginPage");
        return this;
    }

    public HomePage login(String userName, String password) {
        log.debug("Starting the login method on the LoginPage");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        log.debug("Completing the login method on the LoginPage");
        return new HomePage(driver);

    }
}
