package tests;

import models.Account;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountTest extends BaseTest {
    @Test
    public void accountShouldBeCreated() throws InterruptedException {
        loginPage.open();
        loginPage.login("ev.sharnikova-zvlc@force.com", "Sharnikova2021");

        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();

        Assert.assertTrue(isAccountModalOpen, "Popup AccountModal did not open");

        Account account = new Account("Спартак", "https://spartak.by/", "Коммунарка", "+375(232)30-15-59", "+375(232)30-15-59", "Investor", "Banking", "1000", "100000", "My first account", "ул. Павлова, 22А", "ул.Советская,63", "Витебск", "Витебская область", "Гомель", "Гомельская область", "210002", "Беларусь", "210003", "Беларусь");

        boolean isAccountDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        Assert.assertTrue(isAccountDetailsPageOpen, "Details page did not open");

        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Account Name"), account.getAccountName(), "Account Name does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatPhoneValueByName("Phone"), account.getPhone(), "Phone does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatPhoneValueByName("Fax"), account.getFax(), "Fax does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatUrlValue("Website"), account.getWebSite(), "Website does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Type"), account.getType(), "Type does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatNumberValue("Employees"), account.getEmployees(), "Employees does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Industry"), account.getIndustry(), "Industry does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Annual Revenue"), "$" + account.getAnnualRevenue(), "Annual Revenue does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Description"), account.getDescription(), "Description does not match");
//        Assert.assertEquals(accountDetailsPage.getFieldFormatAddressValue("Billing Address"), account.getBillingStreet() + '\n' + account.getBillingCity() + ", " + account.getBillingStateProvince() + " " + account.getBillingZip() + '\n' + account.getBillingCountry(), "Billing Address does not match");
//        Assert.assertEquals(accountDetailsPage.getFieldFormatAddressValue("Shipping Address"), String.format(account.getShippingStreet() + '\n', account.getShippingCity() + ", ", account.getBillingStateProvince() + " ", account.getShippingZip() + '\n', account.getShippingCountry()), "Shipping Address does not match");
    }
}
