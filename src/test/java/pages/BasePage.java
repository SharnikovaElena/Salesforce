package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public static final String Base_URL = "https://freelance-6a.lightning.force.com/";
    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");
    public static final By NEW_BUTTON = By.xpath("//a[@title='New']");
    public static final By MODAL_TITLE = By.xpath("//div[@class='modal-container slds-modal__container']//h2");
    public static final By DETAILS_LINK = By.xpath("//a[@data-tab-value='detailTab']");

    WebDriver driver;
    WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract boolean isPageOpen() throws InterruptedException;

    public boolean isExit(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();

        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
