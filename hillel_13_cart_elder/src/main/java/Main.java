import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

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

    public static void main(String[] args) throws InterruptedException {
        WebDriver wd;

// * 1. Открыть главную страницу automationpractice.com
        System.setProperty("webdriver.chrome.driver", "C:\\!Setup\\Dev\\Webdrivers\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
        By locQty = By.xpath("//input[contains(@class,'cart_quantity_input')]");
        WebElement qtyField = wd.findElement(locQty);
        String oldValue = qtyField.getAttribute("value"); // сохраняем значение как образец
        String newValue = "2"; // oldValue;
        System.out.println("Old Quantity is " + oldValue);
        WebElement buttonPlus = wd.findElement(By.xpath("//i[@class='icon-plus']"));
        if (buttonPlus != null) {
            System.out.println("Increase Quantity button is found: PASS");
        }
        buttonPlus.click(); // увеличиваем значение
        //
        WebDriverWait waitForNewValue = new WebDriverWait(wd, 10);
        waitForNewValue
                .until(ExpectedConditions.attributeToBe(locQty, "value", newValue));
        //                .until(ExpectedConditions.presenceOfElementLocated(locQty));
        // TO DO: требуется ожидание пересчета страницы
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(500);
//            qtyField = wd.findElement(By.xpath("//input[contains(@class,'cart_quantity_input')]"));
//            newValue = qtyField.getAttribute("value");
//            System.out.println("New Quantity is " + newValue);
//            if (!newValue.equals(oldValue)) {
//                break; // значение поменялось
//            }
//        }
        newValue = wd.findElement(locQty).getAttribute("value");
        System.out.println("New Quantity is " + newValue);
// * 6. Проверить что значения отображаются корректно:
// * Total для товара , Total products, Total shipping , Total всех товаров , Tax и TOTAL общий
        WebElement totalValue = wd.findElement(By.xpath("//span[contains(@id,'total_product_price')]"));
        System.out.printf("Total ITEM PRICE: expected ($54.00), actual: (%s)\n", totalValue.getText());

        WebElement totalProductsValue = wd.findElement(By.xpath("//td[@id='total_product']"));
        System.out.printf("Total PRODUCTS: expected ($54.00), actual: (%s)\n", totalProductsValue.getText());

        WebElement totalShippingValue = wd.findElement(By.xpath("//td[@id='total_shipping']"));
        System.out.printf("Total SHIPPING: expected ($2.00), actual: (%s)\n", totalShippingValue.getText());

        WebElement totalPriceValue = wd.findElement(By.xpath("//td[@id='total_price_without_tax']"));
        System.out.printf("Total PRICE W/O TAX: expected ($56.00), actual: (%s)\n", totalPriceValue.getText());

        WebElement totalTaxValue = wd.findElement(By.xpath("//td[@id='total_tax']"));
        System.out.printf("Total TAX: expected ($0.00), actual: (%s)\n", totalTaxValue.getText());

        WebElement totalCartValue = wd.findElement(By.xpath("//td[@id='total_price_container']"));
        System.out.printf("Total CART PRICE: expected ($56.00), actual: (%s)\n", totalCartValue.getText());
// * 7. Удалить товар из корзины
        WebElement buttonDelete = wd.findElement(By.xpath("//a[@title='Delete']"));
        if (buttonDelete != null) {
            System.out.println("Delete button is found: PASS");
        }
        buttonDelete.click();
// * 8. Проверить что корзина пустая
        By alertLocator = By.xpath("//p[contains(@class,'alert')]");
        // ждем до 5 секунд или пока не появился элемент по локатору alertLocator
        WebElement alertWait = (new WebDriverWait(wd, 5))
                .until(ExpectedConditions.presenceOfElementLocated(alertLocator));
        WebElement alertCart = wd.findElement(alertLocator);
        String alertText = alertCart.getAttribute("textContent");
        System.out.println(alertText);
        if (alertText.equals("Your shopping cart is empty."))
            System.out.println("Shopping Cart is empty: PASS");
// close the browser
        wd.close();
    }
}
