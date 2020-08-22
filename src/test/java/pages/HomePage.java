package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElement searchInput;

    @FindBy(xpath = "//a[contains(@href,'/Apple/')]")
    private WebElement AppleCategory;

    @FindBy(xpath = "//a[contains(@href, 'reg.ebay')]")
    private WebElement registrationButton;

    @FindBy(xpath = "//button[@title= 'Ship to']")
    private WebElement shipToButton;

    @FindBy(xpath = "//div[@class= 'shipto__country-list']")
    private WebElement DropListCountryToShip;

    @FindBy(xpath = "//div[@data-makeup-index= '1']")
    private WebElement AlbaniaToShip;

    @FindBy(xpath = "//button[@class= 'shipto__close-btn']")
    private WebElement confirmCountryToShipButton;

    @FindBy(xpath = "//span[@class= 'flag-country-name']")
    private WebElement selectedCountryToShip;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnAppleCategory() {
        AppleCategory.click();
    }

    public void clickOnRegistrationButton() {
        registrationButton.click();
    }

    public void clickOnShipToButton() {
        shipToButton.click();
    }

    public WebElement getPopUpAddCountryToShip() {
        return DropListCountryToShip;
    }

    public void clickOnDropListCountryToShip() {
        DropListCountryToShip.click();
    }

    public void clickOnAlbaniaToShip() {
        AlbaniaToShip.click();
    }

    public void clickOnConfirmCountryToShipButton() {
        confirmCountryToShipButton.click();
    }

    public String getTextOfSelectedCountryToShip() {
        return selectedCountryToShip.getText();
    }
}
