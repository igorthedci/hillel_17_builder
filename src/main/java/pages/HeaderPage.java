package pages;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage {

    private WebDriver driver;

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
    private By locatorTitleSignIn = By.xpath("//a[@class='login']");

    @FindBy(xpath = "//a[@class='logout']")    // Sign Out
    private WebElement titleSignOut;
    private By locatorTitleSignOut = By.xpath("//a[@class='logout']");

    @FindBy(xpath = "//a[@class='account']")    // User Info
    private WebElement titleUserInfo;
    private By emailLocator = By.xpath("//label[@for='email_create']");

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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
        System.out.println("HeaderPage.clickSignIn::");
//        WebDriverWait loginWait = new WebDriverWait(driver, 5);
//        loginWait.until(ExpectedConditions.elementToBeClickable(locatorTitleSignIn));
        titleSignIn.click();
//        loginWait.until(ExpectedConditions.presenceOfElementLocated(emailLocator));
        return this;
    }

    public HeaderPage clickSignOut() {
        System.out.println("HeaderPage.clickSignOut::");
        titleSignOut.click();
        return this; // QUESTION: may be new HeaderPage() ???
    }

    public boolean isGuestMode() {
        System.out.println("HeaderPage:: titleSignIn: " + titleSignIn);
        try {
            return titleSignIn.isEnabled();
        } catch (Exception NoSuchElementException) {
            return false;
        }
    }

    public boolean isUserMode() {
        System.out.println("HeaderPage:: titleSignOut: " + titleSignOut);
        try {
            return titleSignOut.isEnabled();
        } catch (Exception NoSuchElementException) {
            return false;
        }
    }
}
