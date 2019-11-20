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

    public HeaderPage clickSignIn() {
        titleSignIn.click();
        return this;
    }
}
