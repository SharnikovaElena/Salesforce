package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
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
        log.info("Select option from the list by name when creating an contact");
        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
