package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DropDownForContactModal {
    String dropdownLocator = "//label[text()='%s']/ancestor::lightning-combobox//div//input";
    String optionLocator = "//lightning-base-combobox-item//span[text()='%s']";

    WebDriver driver;
    String label;

    public DropDownForContactModal(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
