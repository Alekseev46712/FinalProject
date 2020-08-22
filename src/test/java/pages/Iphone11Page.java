package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Iphone11Page extends BasePage {

    @FindBy(xpath = "//input[@aria-label = 'Free International Shipping']")
    private WebElement deliveryOptionFreeInternationalShipping;

    @FindBy(xpath = "//span[@class = 's-item__shipping s-item__logisticsCost']")
    private List<WebElement> iPhone11DeliveryOptionsText;

    public Iphone11Page(WebDriver driver) {
        super(driver);
    }

    public void selectDeliveryOptionFreeInternationalShipping() {
        deliveryOptionFreeInternationalShipping.click();
    }

    public List<WebElement> getIPhone11DeliveryOptions() {
        return iPhone11DeliveryOptionsText;
    }
}
