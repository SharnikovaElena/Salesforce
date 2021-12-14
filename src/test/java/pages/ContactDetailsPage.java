package pages;

import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage{

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() throws InterruptedException {
        Thread.sleep(2000);
        return isExit(DETAILS_LINK);
    }
}
