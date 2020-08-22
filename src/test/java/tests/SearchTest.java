package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {

    private final String SEARCH_KEYWORD = "Nike";
    private final String EXPECTED_SEARCH_QUERY = "Nike";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test(priority = 1)
    public void checkElementsAmountOnSearchPage() {
        getHomePage().clickOnAppleCategory();
        getBasePage().implicitWait(30);
        assertEquals(getSearchResultPage().getSearchResultsCount(), 48);
    }

    @Test(priority = 1)
    public void checkThatSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        for (WebElement webElement : getSearchResultPage().getSearchResultsList()) {
            assertTrue(webElement.getText().toLowerCase().contains(SEARCH_KEYWORD.toLowerCase()));
        }
    }
}
