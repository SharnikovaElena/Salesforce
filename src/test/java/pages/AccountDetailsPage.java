package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    String fieldFormatTextValue = "//span[text()='%s']/ancestor::div[@force-recordlayoutitem_recordlayoutitem]//lightning-formatted-text";
    String fieldFormatPhoneValue = "//span[text()='%s']//ancestor::div[@force-recordlayoutitem_recordlayoutitem]//a[@lightning-formattedphone_formattedphone]";
    String fieldFormatUrlValue = "//span[text()='%s']//ancestor::flexipage-tab2//lightning-formatted-url";
    String fieldFormatNumberValue = "//span[text()='%s']/ancestor::div[@force-recordlayoutitem_recordlayoutitem]//lightning-formatted-number";
    String fieldFormatAddressValue = "//span[text()='%']/ancestor::div[@force-recordlayoutitem_recordlayoutitem]//lightning-formatted-address//a";


    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() throws InterruptedException {
        Thread.sleep(2000);
        return isExit(DETAILS_LINK);
    }

    public String getFieldFormatTextValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatTextValue, fieldName))).getText().replaceAll(",","");
    }

    public String getFieldFormatPhoneValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatPhoneValue, fieldName))).getText();
    }

    public String getFieldFormatUrlValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatUrlValue, fieldName))).getText();
    }

    public String getFieldFormatNumberValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatNumberValue, fieldName))).getText().replaceAll(",","");
    }

    public String getFieldFormatAddressValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatAddressValue, fieldName))).getText();
    }
}
