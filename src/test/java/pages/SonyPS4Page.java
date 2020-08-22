package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SonyPS4Page extends BasePage {

    @FindBy(xpath = "//select[@id='msku-sel-1']//option[@value='2']")
    private WebElement selectJetBlackSlim;

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@n='Watch list']")
    private WebElement addToWishList;

    public SonyPS4Page(WebDriver driver) {
        super(driver);
    }

    public void clickOnselectJetBlackSlim() {
        selectJetBlackSlim.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOnAddToWishList() {
        addToWishList.click();
    }
}
