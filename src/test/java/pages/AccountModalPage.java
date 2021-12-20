package pages;
import elements.DropDownForAccountModal;
import elements.InputForAccountModal;
import elements.TextAreaForAccountModal;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage {
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");

    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExit(MODAL_TITLE);
    }

    public AccountDetailsPage create(Account account) throws InterruptedException {
        new InputForAccountModal(driver, "Account Name").write(account.getAccountName());
        new InputForAccountModal(driver, "Website").write(account.getWebSite());
        new InputForAccountModal(driver, "Parent Account").write(account.getParentAccount());
        new InputForAccountModal(driver, "Phone").write(account.getPhone());
        new InputForAccountModal(driver, "Fax").write(account.getFax());
        new DropDownForAccountModal (driver, "Type").selectOption(account.getType());
        new DropDownForAccountModal (driver, "Industry").selectOption(account.getIndustry());
        new InputForAccountModal(driver, "Employees").write(account.getEmployees());
        new InputForAccountModal(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextAreaForAccountModal(driver, "Description").write(account.getDescription());
        new TextAreaForAccountModal(driver, "Billing Street").write(account.getBillingStreet());
        new TextAreaForAccountModal(driver, "Shipping Street").write(account.getShippingStreet());
        new InputForAccountModal(driver, "Billing City").write(account.getBillingCity());
        new InputForAccountModal(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new InputForAccountModal(driver, "Shipping City").write(account.getShippingCity());
        new InputForAccountModal(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new InputForAccountModal(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new InputForAccountModal(driver, "Billing Country").write(account.getBillingCountry());
        new InputForAccountModal(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new InputForAccountModal(driver, "Shipping Country").write(account.getShippingCountry());
        Thread.sleep(2000);
        return clickSave();

    }

    public AccountDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }
}
