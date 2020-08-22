package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplePage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, 'Apple-iPhone-11/')]")
    private WebElement iPhone11;

    public ApplePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnIPhone11() {
        iPhone11.click();
    }

}
