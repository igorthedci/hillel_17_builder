package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLPage {

    private WebDriver driver;

    public PLPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//h1")
    private WebElement titlePLPage;
    @FindBy(xpath = "//span[@class='heading-counter']")
    private WebElement counterProduct;

    @FindBy(xpath = "//li[@id='grid']")
    private WebElement viewGrid;
    @FindBy(xpath = "//li[@id='list']")
    private WebElement viewList;

    @FindBy(xpath = "//li[@class='ajax_block_product']")
    private WebElement boxProduct;
    @FindBy(xpath = "//a[contains(@class,'ajax_add_to_cart_button')]")
    private WebElement buttonAddToCart;



    public String getTitlePLPage() {
        return titlePLPage.getText();
    }
    public String getCounterProduct() {
        return counterProduct.getText();
    }

    public PLPage clickGridView() {
        viewGrid.click();
        return this;
    }
    public PLPage clickAddToCart() {
        buttonAddToCart.click();
        return this;
    }

    public PLPage clickListView() {
        viewList.click();
        return this;
    }

}
