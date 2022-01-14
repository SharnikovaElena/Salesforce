package tests;

import lombok.extern.log4j.Log4j2;
import models.Contact;
import models.ContactFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AllureUtils;

@Log4j2
public class ContactTest extends BaseTest {

    @Test(description = "Create new contact and check to compare data entered into ContactModalPage and displayed on ContactDetailsPage")
    public void contactShouldBeCreated() throws InterruptedException {
        log.info("Test start ContactTest");
        loginPage.open();
        loginPage.login("lena012022-fse8@force.com", "lenor4ik");

        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();
        log.info("Checking that ContactModal has opened");
        Assert.assertTrue(isContactModalOpen, "Popup AccountModal did not open");

        log.info("Create a new contact");

        Contact contact = ContactFactory.get();

        boolean isContactDetailsPageOpen = contactModalPage
                .create(contact)
                .isPageOpen();
        AllureUtils.takeScreenshot(driver);

        log.error("New contact creation completed");

        Assert.assertTrue(isContactDetailsPageOpen, "Details page did not open");

        log.info("Start assertEquals to compare data entered into ContactModalPage and displayed on ContactDetailsPage");
        Assert.assertEquals(contactDetailsPage.getFieldFormatNameValue("Name"), contact.getSalutation() + " " + contact.getFirstName() + " " + contact.getLastName(), "Field Name does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatAccountName("Account Name"), contact.getAccountName(), "Field Account Name does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatTextValue("Title"), contact.getTitle(), "Title does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Phone"), contact.getPhone(), "Phone does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Mobile"), contact.getMobile(), "Mobile  does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatEmailValue("Email"), contact.getEmail(), "Email  does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatAddressValue("Mailing Address"), contact.getMailingStreet() + "\n" + contact.getMailingCity() + ", " + contact.getMailingStateProvince() + " " + contact.getMailingZipCode() + "\n" + contact.getMailingCountry(), "Mailing Address does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatAddressValue("Other Address"), contact.getOtherStreet() + "\n" + contact.getOtherCity() + ", " + contact.getOtherStateProvince() + " " + contact.getOtherZipCode() + "\n" + contact.getOtherCountry(), "Other Address does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Fax"), contact.getFax(), "Fax does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Home Phone"), contact.getHomePhone(), "Home Phone does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Other Phone"), contact.getOtherPhone(), "Other Phone does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Asst. Phone"), contact.getAsstPhone(), "Asst. Phone does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatTextValue("Assistant"), contact.getAssistant(), "Assistant does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatTextValue("Description"), contact.getDescription(), "Description does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatTextValue("Department"), contact.getDepartment(), "Department does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatTextValue("Lead Source"), contact.getLeadSource(), "Lead Source does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatTextValue("Birthdate"), contact.getBirthdate(), "Birthdate does not match");

        log.info("Completing assertEquals to compare data entered into ContactModalPage and displayed on ContactDetailsPage");
        log.info("Completing the ContactTest");
    }
}




