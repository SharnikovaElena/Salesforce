package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    AccountDetailsPage accountDetailsPage;
    ContactModalPage contactModalPage;
    ContactListPage contactListPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        contactModalPage = new ContactModalPage(driver);
        contactListPage = new ContactListPage(driver);
    }

//    @AfterMethod (alwaysRun = true)
//    public void tearDown() {
//        driver.quit();
//    }
}
