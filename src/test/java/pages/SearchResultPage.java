package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//ul[contains(@class,'srp-results')]//div[@class='s-item__wrapper clearfix']")
    private List<WebElement> searchResultsProductsListText;

    @FindBy(xpath = "//input[contains(@aria-label,'Minimum Value')]")
    private WebElement minPrice;

    @FindBy(xpath = "//input[contains(@aria-label,'Maximum Value')]")
    private WebElement maxPrice;

    @FindBy(xpath = "//button[contains(@aria-label,'Submit price')]")
    private WebElement submitPriceRange;

    @FindBy(xpath = "//span[@class='s-item__price']")
    private List<WebElement> priceOfElement;

    @FindBy(xpath = "//div[@class='s-item__image']//img[contains(@alt, '4 1tb slim black')]")
    private WebElement sonyPS4Item;

    @FindBy(xpath = "//button[contains(@aria-label, 'Sort selector')]")
    private WebElement sortButton;

    @FindBy(xpath = "//a[contains(@href, 'sop=16')]")
    private WebElement sortPricePlusShippingDescending;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductsListText;
    }

    public int getSearchResultsCount() {
        return getSearchResultsList().size();
    }

    public void getMinPrice(final String MinPrice) {
        minPrice.sendKeys(MinPrice, Keys.ENTER);
    }

    public void getMaxPrice(final String MaxPrice) {
        maxPrice.sendKeys(MaxPrice, Keys.ENTER);
    }

    public void getSubmitPriceRange() {
        submitPriceRange.click();
    }

    public void clickOnSonyPS4Item() {
        sonyPS4Item.click();
    }

    public List<WebElement> getPriceOfElement() {
        return priceOfElement;
    }

    public void clickOnSortButton() {
        sortButton.click();
    }

    public void clickOnSortPricePlusShippingDescending() {
        sortPricePlusShippingDescending.click();
    }

    public List<WebElement> getDescendingSortedByPriceList() {
        Collections.sort(priceOfElement, new Comparator<WebElement>() {
            public int compare(WebElement o1, WebElement o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        return priceOfElement;
    }
}
