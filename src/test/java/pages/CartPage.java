package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//i[@id='gh-cart-n']")
    private WebElement amountOfProductsInCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getTextAmountOfProductsInCart() {
        return amountOfProductsInCart.getText();
    }
}
