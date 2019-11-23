package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage {

    private WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Top banner
     */
    @FindBy(xpath = "//a[@title='']")
    private WebElement userName;
    /**
     * Shop Phone
     */
    @FindBy(xpath = "//*[@class='shop-phone']//text()[2]")
    private WebElement titleShopPhone;
    @FindBy(xpath = "//*[@class='shop-phone']//text()[2]")
    private WebElement numberShopPhone;

    @FindBy(xpath = "//*[@id='contact-link']")    // Contact Us
    private WebElement titleContactUs;

    @FindBy(xpath = "//a[@class='login']")    // Sign In
    private WebElement titleSignIn;
    @FindBy(xpath = "//a[@class='logout']")    // Sign Out
    private WebElement titleSignOut;
    @FindBy(xpath = "//a[@class='account']")    // User Info
    private WebElement titleUserInfo;

    /**
     * METHODS
     */
    public String getShopPhone() {
        return titleShopPhone.getText();
    }

    public HeaderPage clickContactUs() {
        titleContactUs.click();
        return this;
    }

    public SignInPage clickSignIn() {
        titleSignIn.click();
        return new SignInPage(driver);
    }
    public HeaderPage clickSignOut() {
        titleSignOut.click();
        return this; // QUESTION: may be new HeaderPage() ???
    }
    public boolean isGuestMode() {
        if (titleUserInfo == null)
            return true;
        return false;
    }
    public boolean isUserMode() {
        if (titleUserInfo != null)
            return true;
        return false;
    }
}
