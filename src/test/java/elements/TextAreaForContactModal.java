package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TextAreaForContactModal {
    String inputTextArea = "//label[text()='%s']/ancestor::lightning-textarea//div//textarea";

    WebDriver driver;
    String label;

        public TextAreaForContactModal(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text '%s' into TextArea with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputTextArea, this.label))).sendKeys(text);
    }
}

