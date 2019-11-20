package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage {

    private WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//img[contains(@class,'logo')]")
    private WebElement theCompanyLogo;
    @FindBy(xpath = "//input[@id='search_query_top']")
    private WebElement searchField;
    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchIcon;
    @FindBy(xpath = "////div[@class='shopping_cart']/a")
    private WebElement cartTitle;

    @FindBy(xpath = "//a[@class='sf-with-ul'])[1]")
    private WebElement tabWomen;
    @FindBy(xpath = "//a[@class='sf-with-ul'])[1]")
    private WebElement tabDresses;
    @FindBy(xpath = "//ul[contains(@class,'sf-menu')]/li[3]")
    private WebElement tabTshirts;

    public NavigationPage clickCompanyLogo() {
        theCompanyLogo.click();
        return this;
    }
    public NavigationPage clickSearchField() {
        searchField.click();
        return this;
    }
    public NavigationPage typeSearchField(String text) {
        searchField.click();
        searchField.clear();
        searchField.sendKeys(text);
        searchField.submit();
        return this;
    }
    public NavigationPage clickCart() {
        cartTitle.click();
        return this;
    }
    public NavigationPage clickShoppingCart() {
        cartTitle.click();
        return this;
    }

    public NavigationPage clickWomenTab() {
        tabWomen.click();
        return this;
    }
    public NavigationPage clickDressesTab() {
        tabWomen.click();
        return this;
    }
    public NavigationPage clickTshirtsTab() {
        tabTshirts.click();
        return this;
    }


}
