package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    String dropdownLocatorForAccountModal = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//div[@class='uiMenu']";
    String optionLocator = "//div[contains(@class, 'visible')]//a[@title='%s']";

    String dropdownLocatorForContactModal = "//label[text()='%s']/ancestor::lightning-combobox//div//input";
    String optionLocatorForContactModal = "//label[text()='%s']/ancestor::lightning-combobox//div[contains(@class, 'slds-is-open')]";
    String dropdownLocatorForContactModalFieldAccountName = "//label[text()='%s']/ancestor::lightning-grouped-combobox//div//input";
    String optionLocatorForContactFieldAccountName = "//label[text()='%s']/ancestor::lightning-grouped-combobox//div[contains(@class, 'slds-is-open')]";

    String label;
    WebDriver driver;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOptionForAccountModal(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocatorForAccountModal, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }

    public void selectOptionForContactFieldAccountName(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocatorForContactModalFieldAccountName, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorForContactFieldAccountName, option))).click();
    }

    public void selectOptionForContactModal(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocatorForContactModal, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorForContactModal, option))).click();
    }
}
