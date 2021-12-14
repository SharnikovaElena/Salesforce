package pages;
import elements.DropDown;
import models.Contact;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends  BasePage {

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() throws InterruptedException {
        return isExit(MODAL_TITLE);
    }

//    public ContactDetailsPage create(Contact contact){
//        new DropDown(driver, "Salutation").selectOptionForContactModal(contact.getSalutation());
//        new DropDown(driver, "Lead Source").selectOptionForContactModal(contact.getLeadSource());
//        new DropDown(driver, "Account Name").selectOptionForContactFieldAccountName(contact.getAccountName());
//        return clickSave();
//    }

//    public ContactDetailsPage clickSave() {
//        driver.findElement(SAVE_BUTTON).click();
//        return new ContactDetailsPage(driver);
//    }
}
