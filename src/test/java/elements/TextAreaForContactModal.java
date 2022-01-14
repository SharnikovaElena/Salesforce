package elements;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextAreaForContactModal {
    String inputTextArea = "//label[text()='%s']/ancestor::lightning-textarea//div//textarea";

    WebDriver driver;
    String label;

        public TextAreaForContactModal(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing text into textarea with by the specified name when creating a contact");
        driver.findElement(By.xpath(String.format(inputTextArea, this.label))).sendKeys(text);
    }
}

