package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends  BasePage{

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");
//public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//li//span[text()='%s']");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() throws InterruptedException {
        return isExit(BREADCRUMBS_LABEL);
    }

    public ContactListPage open() {
        driver.get(Base_URL + "/lightning/o/Contact/list");
        return this;
    }

    public ContactModalPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new ContactModalPage(driver);
    }
}

