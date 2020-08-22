package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddToCartAndWishListTest extends BaseTest {

    private final String SEARCH_KEYWORD = "Sony PS 4";
    private final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";
    private final String EXPECTED_SEARCH_URL = "https://signin.ebay.com/";

    @Test
    public void checkAddToCart() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().waitForPageLoadComplete(30);
        getSearchResultPage().clickOnSonyPS4Item();
        getBasePage().waitForPageLoadComplete(30);
        getSonyPS4Page().clickOnAddToCartButton();
        getBasePage().implicitWait(30);
        assertEquals(getCartPage().getTextAmountOfProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }

    @Test(priority = 2)
    public void checkWarningWindowWhenAddItemToWishListWithoutRegistration() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().waitForPageLoadComplete(30);
        getSearchResultPage().clickOnSonyPS4Item();
        getSonyPS4Page().clickOnAddToWishList();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_URL));
    }
}
