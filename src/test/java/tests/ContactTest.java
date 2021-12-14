package tests;
import models.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test
    public void contactShouldBeCreated() throws InterruptedException {
        loginPage.open();
        loginPage.login("ev.sharnikova-zvlc@force.com", "Sharnikova2021");

        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();

        Assert.assertTrue(isContactModalOpen, "Popup AccountModal did not open");
    }
Contact contact = new Contact("Mrs.", "Инна", "Беляева", "Спартак", "начальник", "+375-212-348596", "+3758925648","inna@gmail.com", "Данилевич", "пр-т Скорины, 61", "Гродно", "Гродненская область", "230050", "Беларусь", "-", "-", "-", "-", "-", "+375-212-348596", "+375-212-589642", "-", "+3753365912352", "Шамшуро Дмитрий", "Sales", "On Site", "12/12/1995", "Долг 3000$");

}
