package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ContactListPage extends BasePage {

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() throws InterruptedException {
        return isExit(BREADCRUMBS_LABEL);
    }

    public ContactListPage open() {
        driver.get(Base_URL + "lightning/o/Contact/list");
        return this;
    }

    public ContactModalPage clickNew() {
        log.info("Start of the clickNew method on the ContactModalPage page");
        driver.findElement(NEW_BUTTON).click();
        log.info("Completing the clickNew method on the ContactModalPage");
        return new ContactModalPage(driver);
    }
}

