package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class InputForContactModal {

    String inputLocator = "//lightning-input//label[text()='%s']/ancestor::lightning-input//div//input";
    String locatorForFieldAccountName = "//label[text()='Account Name']/ancestor::lightning-grouped-combobox//input";

    WebDriver driver;
    String label;

    public InputForContactModal(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing text in the input field by the specified name when creating a contact");
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }

    public void selectAccountName(String text) {
        driver.findElement(By.xpath(String.format(locatorForFieldAccountName, this.label))).click();
        driver.findElement(By.xpath("//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']//span[1]")).click();
    }
}
