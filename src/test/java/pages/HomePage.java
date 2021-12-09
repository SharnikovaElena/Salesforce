package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    public static final By MENU_HOME_LINK = By.xpath("//a[@title='Home']/span[@class='slds-truncate']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(Base_URL + "/lightning/page/home");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExit(MENU_HOME_LINK);
    }
}
