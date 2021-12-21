package pages;
import elements.DropDownForContactModal;
import elements.InputForContactModal;
import elements.TextAreaForContactModal;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactModalPage extends BasePage {

    public static final By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() throws InterruptedException {
        return isExit(MODAL_TITLE);
    }

    public ContactDetailsPage create(Contact contact) {
        new DropDownForContactModal(driver, "Salutation").selectOption(contact.getSalutation());
        new InputForContactModal(driver, "First Name").write(contact.getFirstName());
        new InputForContactModal(driver, "Last Name").write(contact.getLastName());
        new InputForContactModal(driver, "Account Name").selectAccountName(contact.getAccountName());
        new InputForContactModal(driver, "Title").write(contact.getTitle());
        new InputForContactModal(driver, "Phone").write(contact.getPhone());
        new InputForContactModal(driver, "Mobile").write(contact.getMobile());
        new InputForContactModal(driver, "Email").write(contact.getEmail());
//        new InputForContactModal(driver, "Reports To").write(contact.getReportsTo());
        new TextAreaForContactModal(driver, "Mailing Street").write(contact.getMailingStreet());
        new TextAreaForContactModal(driver, "Other Street").write(contact.getOtherStreet());
        new InputForContactModal(driver, "Mailing City").write(contact.getMailingCity());
        new InputForContactModal(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new InputForContactModal(driver, "Other City").write(contact.getOtherCity());
        new InputForContactModal(driver, "Other State/Province").write(contact.getOtherStateProvince());
        new InputForContactModal(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipCode());
        new InputForContactModal(driver, "Mailing Country").write(contact.getMailingCountry());
        new InputForContactModal(driver, "Other Zip/Postal Code").write(contact.getOtherZipCode());
        new InputForContactModal(driver, "Other Country").write(contact.getOtherCountry());
        new InputForContactModal(driver, "Fax").write(contact.getFax());
        new InputForContactModal(driver, "Department").write(contact.getDepartment());
        new InputForContactModal(driver, "Home Phone").write(contact.getHomePhone());
        new InputForContactModal(driver, "Other Phone").write(contact.getOtherPhone());
        new InputForContactModal(driver, "Asst. Phone").write(contact.getAsstPhone());
        new InputForContactModal(driver, "Assistant").write(contact.getAssistant());
        new DropDownForContactModal(driver, "Lead Source").selectOption(contact.getLeadSource());
        new TextAreaForContactModal(driver, "Description").write(contact.getDescription());
        new InputForContactModal(driver, "Birthdate").write(contact.getBirthdate());
        return clickSave();
    }

    public ContactDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }
}
