package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage {


    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExit(MODAL_TITLE);
    }

    public AccountDetailsPage create(Account account) throws InterruptedException {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new Input(driver, "Parent Account").write(account.getParentAccount());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new DropDown(driver, "Type").selectOptionForAccountModal(account.getType());
        new DropDown(driver, "Industry").selectOptionForAccountModal(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        Thread.sleep(2000);
        return clickSave();

    }

    public AccountDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }
}
