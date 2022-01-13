package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AllureUtils;

@Log4j2
public class AccountTest extends BaseTest {
    @Test (description = "Create new account and check to compare data entered into AccountModalPage and displayed on AccountDetailsPage")

    public void accountShouldBeCreated() throws InterruptedException {

        log.info("Test start AccountTest");
        loginPage.open();
        loginPage.login("lena012022-fse8@force.com", "lenor4ik");

        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();

        Assert.assertTrue(isAccountModalOpen, "Popup AccountModal did not open");

        log.info("Creating new Account");
        Account account = AccountFactory.get();

        boolean isAccountDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        AllureUtils.takeScreenshot(driver);

        log.error("New account creation completed");

        Assert.assertTrue(isAccountDetailsPageOpen, "Details page did not open");

        log.error("Start assertEquals to compare data entered into AccountModalPage and displayed on AccountDetailsPage");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Account Name"), account.getAccountName(), "Account Name does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatPhoneValueByName("Phone"), account.getPhone(), "Phone does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatPhoneValueByName("Fax"), account.getFax(), "Fax does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatUrlValue("Website"), account.getWebSite(), "Website does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Type"), account.getType(), "Type does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatNumberValue("Employees"), account.getEmployees(), "Employees does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Industry"), account.getIndustry(), "Industry does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Annual Revenue"), "$" + account.getAnnualRevenue(), "Annual Revenue does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Description"), account.getDescription(), "Description does not match");
//        Assert.assertEquals(accountDetailsPage.getFieldFormatAddressValue("Billing Address"), account.getBillingStreet() + "\n" + account.getBillingCity() + ", " + account.getBillingStateProvince() + " " + account.getBillingZip() + "\n" + account.getBillingCountry(), "Billing Address does not match");
//        Assert.assertEquals(accountDetailsPage.getFieldFormatAddressValue("Shipping Address"), account.getShippingStreet() + '\n' + account.getShippingCity() + ", " + account.getShippingStateProvince() + " " + account.getShippingZip() + '\n' + account.getShippingCountry(), "Shipping Address does not match");

        log.info("Completing assertEquals to compare data entered into AccountModalPage and displayed on AccountDetailsPage");
        log.info("Completing the AccountTest");
    }
}
