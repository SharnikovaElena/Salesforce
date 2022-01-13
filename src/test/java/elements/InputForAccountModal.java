package elements;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class InputForAccountModal {
    String inputLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input";
    WebDriver driver;
    String label;

    public InputForAccountModal(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing text in the input field by the specified name when creating an account");
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }
}
