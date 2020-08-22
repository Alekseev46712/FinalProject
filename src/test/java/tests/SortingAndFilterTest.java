package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Double.parseDouble;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SortingAndFilterTest extends BaseTest {

    private final String KEYWORD = "Sony PS 4";
    private final String MinPrice = "10";
    private final String MaxPrice = "99";
    private final String DELIVERY_OPTION = "Free shipping";

    @Test(priority = 1)
    public void CheckThatSortingByPriceAndShippingWorksCorrectly() {
        getHomePage().searchByKeyword(KEYWORD);
        getBasePage().waitForPageLoadComplete(30);
        getSearchResultPage().clickOnSortButton();
        getSearchResultPage().clickOnSortPricePlusShippingDescending();
        assertEquals(getSearchResultPage().getPriceOfElement(), getSearchResultPage().getDescendingSortedByPriceList());
    }

    @Test(priority = 1)
    public void CheckThatPriceFilterWorksCorrectly() {
        getHomePage().searchByKeyword(KEYWORD);
        getSearchResultPage().getMinPrice(MinPrice);
        getBasePage().implicitWait(30);
        getSearchResultPage().getMaxPrice(MaxPrice);
        getBasePage().implicitWait(30);
        getSearchResultPage().getSubmitPriceRange();
        for (WebElement webElement : getSearchResultPage().getPriceOfElement()) {
            assertTrue(parseDouble(webElement.getText().substring(1,6)) >= 10);
            assertTrue(parseDouble(webElement.getText().substring(1,6)) <= 99);
        }
    }

    @Test(priority = 2)
    public void CheckThatDeliveryFilterWorksCorrectly() {
        getHomePage().clickOnAppleCategory();
        getBasePage().implicitWait(30);
        getApplePage().clickOnIPhone11();
        getBasePage().implicitWait(30);
        getIphone11Page().selectDeliveryOptionFreeInternationalShipping();
        getBasePage().implicitWait(30);
        for (WebElement webElement : getIphone11Page().getIPhone11DeliveryOptions()) {
            assertTrue(webElement.getText().contains(DELIVERY_OPTION));
        }
    }
}