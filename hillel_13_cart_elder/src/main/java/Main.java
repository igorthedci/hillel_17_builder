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

//    @FindBy(xpath = "//input[@id='search_query_top']")
//    private static WebElement searchField;

    @FindBy(xpath = "//td[@class='cart_total']")
    private static WebElement totalValue;

    // Shopping Cart.



    public static void main(String[] args) {
        WebDriver wd;

// * 1. Открыть главную страницу automationpractice.com
        System.setProperty("webdriver.chrome.driver", "C:\\!Setup\\Dev\\Webdrivers\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://automationpractice.com/index.php");
// * 2. В поле поиска ввести “Blouse” и выполнить поиск
        WebElement searchField = wd.findElement(By.xpath("//input[@id='search_query_top']"));
        if (searchField != null)
            System.out.println("Search field is found: PASS");
        searchField.click();
        searchField.clear();
        searchField.sendKeys("Blouse");
        searchField.submit();
// * 3. Переключиться на режим просмотра ‘List”
        WebElement viewList = wd.findElement(By.xpath("//li[@id='list']"));
        if (viewList != null)
            System.out.println("List_view button is found: PASS");
        viewList.click();
// * 4. Добавить товар в корзину
        int ndxItem = 0;
        List<WebElement> addToCart;
        addToCart = wd.findElements(By.xpath("//a[contains(@class,'add_to_cart')]"));
        if (addToCart.size() > 0)
            System.out.println("ADD_TO_CART button is found: PASS");
        addToCart.get(ndxItem).click();
        WebElement buttonCheckout = wd.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        if (buttonCheckout != null)
            System.out.println("Checkout button is found: PASS");
        buttonCheckout.click();
// * 5. В секции Summary увеличить количество товаров на 1
        WebElement buttonPlus = wd.findElement(By.xpath("//a[contains(@class,'cart_quantity_up')]"));
        if (buttonPlus != null) {
            System.out.println("Increase Quantity button is found: PASS");
        }
        buttonPlus.click();
        //
        WebElement qtyField = wd.findElement(By.xpath("//input[contains(@class,'cart_quantity_input')]"));
// * 6. Проверить что значения отображаются корректно:
// * Total для товара , Total products, Total shipping , Total всех товаров , Tax и TOTAL общий
        WebElement totalValue = wd.findElement(By.xpath("//td[@id='total_product']"));
        System.out.printf("Total price: expected ($54.00), actual: (%s)\n", totalValue.getText());

        WebElement totalProductsValue = wd.findElement(By.xpath("//td[@id='total_shipping']"));
        System.out.printf("Total price: expected ($54.00), actual: (%s)\n", totalProductsValue.getText());

        WebElement totalShippingValue = wd.findElement(By.xpath("//td[@id='total_shipping']"));
        if (totalShippingValue.getText() == "$2.00") {
            System.out.println("Total shipping ($2.00): PASS");
        }
        WebElement totalPriceValue = wd.findElement(By.xpath("//td[@id='total_price_without_tax']"));
        if (totalPriceValue.getText() == "$56.00") {
            System.out.println("Total ($56.00): PASS");
        }
        WebElement totalTaxValue = wd.findElement(By.xpath("//td[@id='total_tax']"));
        if (totalTaxValue.getText() == "$0.00") {
            System.out.println("Tax ($0.00): PASS");
        }
        WebElement totalCartValue = wd.findElement(By.xpath("//td[@id='total_price_container']"));
        if (totalCartValue.getText() == "$56.00") {
            System.out.println("Grand Total ($54.00): PASS");
        }
// * 7. Удалить товар из корзины
        WebElement buttonDelete = wd.findElement(By.xpath("//a[@title='Delete']"));
        if (buttonDelete != null) {
            System.out.println("Delete button is found: PASS");
        }
        buttonDelete.click();
// * 8. Проверить что корзина пустая
        WebElement alertCart = wd.findElement(By.xpath("//p[contains(@class,'alert')]"));
        if (alertCart.getText() == "Your shopping cart is empty.")
            System.out.println("Shopping Cart is empty: PASS");
// close the browser
        wd.close();
    }
}
