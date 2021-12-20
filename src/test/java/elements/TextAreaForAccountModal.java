package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaForAccountModal {

    WebDriver driver;
    String label;

    String inputTextArea = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//textarea";

    public TextAreaForAccountModal(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text '%s' into TextArea with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputTextArea, this.label))).sendKeys(text);
    }
}
