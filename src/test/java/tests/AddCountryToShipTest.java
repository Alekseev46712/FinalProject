package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddCountryToShipTest extends BaseTest {

    private final String EXPECTED_SELECTED_COUNTRY_TO_SHIP = "Albania";

    @Test(priority = 2)

    public void CheckAddCountryToShip() {
        getHomePage().clickOnShipToButton();
        getBasePage().waitVisibilityOfAddCountryToShipPopUp(90, getHomePage().getPopUpAddCountryToShip());
        getHomePage().clickOnDropListCountryToShip();
        getBasePage().implicitWait(30);
        getHomePage().clickOnAlbaniaToShip();
        getHomePage().clickOnConfirmCountryToShipButton();
        getHomePage().clickOnShipToButton();
        getBasePage().waitVisibilityOfAddCountryToShipPopUp(90, getHomePage().getPopUpAddCountryToShip());
        assertEquals(getHomePage().getTextOfSelectedCountryToShip(), EXPECTED_SELECTED_COUNTRY_TO_SHIP);
    }
}
