package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {

    private WebDriver driver;
    private static final String EBAY_URL = "https://ebay.com/";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EBAY_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public ApplePage getApplePage() {
        return new ApplePage(getDriver());
    }

    public Iphone11Page getIphone11Page() {
        return new Iphone11Page(getDriver());
    }

    public SonyPS4Page getSonyPS4Page() {
        return new SonyPS4Page(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

    public RegistrationPage getRegistrationPage() {
        return new RegistrationPage(getDriver());
    }


}
