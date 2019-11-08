import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 1. Открыть главную страницу automationpractice.com
 * 2. В поле поиска ввести “Blouse” и выполнить поиск
 * 3. Переключиться на режим просмотра ‘List”
 * 4. Добавить товар в корзину
 * 5. В секции Summary увеличить количество товаров на 1
 * 6. Проверить что значения отображаются корректно:
 * Total для товара , Total products, Total shipping , Total всех товаров , Tax и TOTAL общий
 * 7. Удалить товар из корзины
 * 8. Проверить что корзина пустая
 */
public class Main {

    @FindBy(xpath = "//input[@id='search_query_top']")
    private static WebElement searchField;

    @FindBy(xpath = "//li[@id='list']")
    private static WebElement viewList;

    @FindBy(xpath = "//li[@class='ajax_block_product']")
    private WebElement boxProduct;
    // Shopping Cart. button Increase quantity
    @FindBy(xpath = "//p[contains(@class,'alert')]")
    private static WebElement alertCart;
    @FindBy(xpath = "//a[contains(@class,'cart_quantity_up')]")
    private static WebElement buttonPlus;
    @FindBy(xpath = "//td[@class='cart_total']")
    private static WebElement totalValue;
    @FindBy(xpath = "//a[@title='Delete']")
    private static WebElement buttonDelete;
    // Shopping Cart.
    @FindBy(xpath = "//td[@id='total_product']")
    private static WebElement totalProductsValue;
    @FindBy(xpath = "//td[@id='total_shipping']")
    private static WebElement totalShippingValue;
    @FindBy(xpath = "//td[@id='total_price']")
    private static WebElement totalPriceValue;
    @FindBy(xpath = "//td[@id='total_tax']")
    private static WebElement totalTaxValue;
    @FindBy(xpath = "//td[@id='total_price_container']")
    private static WebElement totalCartValue;

    public static void main(String[] args) {
        WebDriver wd;

// * 1. Открыть главную страницу automationpractice.com
        System.setProperty("webdriver.chrome.driver", "C:\\!Setup\\Dev\\Webdrivers\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("http://automationpractice.com/index.php");
// * 2. В поле поиска ввести “Blouse” и выполнить поиск
        searchField.click();
        searchField.clear();
        searchField.sendKeys("Blouse");
        searchField.submit();
// * 3. Переключиться на режим просмотра ‘List”
        viewList.click();
// * 4. Добавить товар в корзину
        int ndxItem = 1;
        List<WebElement> addToCart;
        addToCart = wd.findElements(By.xpath("//a[contains(@class,'add_to_cart')]"));
        addToCart.get(ndxItem).click();
        WebElement buttonCheckout = wd.findElement(By.xpath("//a[@title,'Proceed to checkout')]"));
// * 5. В секции Summary увеличить количество товаров на 1
        buttonPlus.click();
// * 6. Проверить что значения отображаются корректно:
// * Total для товара , Total products, Total shipping , Total всех товаров , Tax и TOTAL общий
        if (totalValue.getText() == "$54.00")
            System.out.println("Total price ($54.00): PASS");
        if (totalProductsValue.getText() == "$54.00")
            System.out.println("Total products ($54.00): PASS");
        if (totalShippingValue.getText() == "$2.00")
            System.out.println("Total shipping ($2.00): PASS");
        if (totalPriceValue.getText() == "$56.00")
            System.out.println("Total ($56.00): PASS");
        if (totalTaxValue.getText() == "$0.00")
            System.out.println("Tax ($0.00): PASS");
        if (totalCartValue.getText() == "$56.00")
            System.out.println("Grand Total ($54.00): PASS");
// * 7. Удалить товар из корзины
        buttonDelete.click();
// * 8. Проверить что корзина пустая
        if (alertCart.getText() == "Your shopping cart is empty.")
            System.out.println("Shopping Cart is empty: PASS");

        wd.close();
    }
}
