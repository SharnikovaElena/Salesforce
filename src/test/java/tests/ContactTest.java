package tests;

import models.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test(description = "Проверяем создание нового контакта: на вкладке Contacts нажимаем button 'New', заполняем все поля в открывшемся Popup ContactModal, нажимаем button 'Save'. Проводим проверку соответствия данных в полях созданного контакта с теми данными, которые были введены в Popup ContactModal")
    public void contactShouldBeCreated() throws InterruptedException {
        loginPage.open();
        loginPage.login("ev.sharnikova-zvlc@force.com", "Sharnikova2021");

        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();

        Assert.assertTrue(isContactModalOpen, "Popup AccountModal did not open");

        Contact contact = new Contact("Mrs.", "Инна", "Беляева", "Спартак", "начальник", "+375-212-348596", "+3758925648", "inna@gmail.com", "Данилевич", "пр-т Скорины, 61", "Гродно", "Гродненская область", "230050", "Беларусь", "-", "-", "-", "-", "-", "+375-212-348596", "+375-212-589642", "-", "+3753365912352", "Шамшуро Дмитрий", "Sales", "On Site", "12/12/1995", "Долг 3000$");

        boolean isContactDetailsPageOpen = contactModalPage
                .create(contact)
                .isPageOpen();
        Assert.assertTrue(isContactDetailsPageOpen, "Details page did not open");

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
    }

}




