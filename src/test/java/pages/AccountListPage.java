package pages;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    @Override
    public boolean isPageOpen() {
        return isExit(BREADCRUMBS_LABEL);
    }

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public AccountListPage open() {
        driver.get(Base_URL + "/lightning/o/Account/list");
        return this;
    }

    public AccountModalPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }
}
