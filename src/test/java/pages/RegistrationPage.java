package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id = 'lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id = 'PASSWORD']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id = 'ppaFormSbtBtn']")
    private WebElement submitRegistrationButton;

    @FindBy(xpath = "//span[@class='inline-notice__content']")
    private WebElement errorMessage;

    @FindBy(xpath = "//input[@aria-label = 'Show password']")
    private WebElement showPassword;

    @FindBy(xpath = "//div[@class='txcSir']")
    private WebElement registrationForm;

    @FindBy(xpath = "//p[@id= 'ertx']")
    private WebElement errorMessageAboutInvalidCredentials;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void FillFirstNameInput(final String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void FillLastNameInput(final String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void FillEmailInput(final String email) {
        emailInput.sendKeys(email);
    }

    public void FillPasswordInput(final String password) {
        passwordInput.sendKeys(password);
    }

    public void clickOnSubmitRegistrationButton() {
        submitRegistrationButton.click();
    }

    public void clickOnshowPassword() {
        showPassword.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public WebElement getRegistrationForm() {
        return registrationForm;
    }

    public WebElement getErrorMessageAboutInvalidCredentials() {
        return errorMessageAboutInvalidCredentials;
    }

}
