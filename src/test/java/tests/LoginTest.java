package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    private final String FIRST_NAME = "John";
    private final String LAST_NAME = "/.,/ ???";
    private final String EMAIL = "John123John322@gmail.com";
    private final String PASSWORD = "John12345";
    private final String ERROR_MESSAGE = "We noticed a problem. Please review:Last name";

    @Test(priority = 1)
    public void checkWarningWindowDuringRegistration() {
        getHomePage().clickOnRegistrationButton();
        getBasePage().waitVisibilityOfAddCountryToShipPopUp(30, getRegistrationPage().getRegistrationForm());
        getBasePage().waitForPageLoadComplete(90);
        getRegistrationPage().FillFirstNameInput(FIRST_NAME);
        getRegistrationPage().FillLastNameInput(LAST_NAME);
        getRegistrationPage().FillPasswordInput(PASSWORD);
        getRegistrationPage().FillEmailInput(EMAIL);
        getRegistrationPage().clickOnshowPassword();
        getRegistrationPage().clickOnSubmitRegistrationButton();
        getBasePage().waitVisibilityOfAddCountryToShipPopUp(30, getRegistrationPage().getErrorMessageAboutInvalidCredentials());
        assertEquals(getRegistrationPage().getErrorMessage(), ERROR_MESSAGE);
    }


}
