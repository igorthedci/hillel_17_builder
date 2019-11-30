import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.Account;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HeaderPage;
import pages.SignInPage;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    private Account account;
    private HeaderPage headerPage;
    private SignInPage signInPage;
//    private RegistrationPage registrationPage;
//    private MyAccountPage myAccountPage;

    private final String linkShop = "http://automationpractice.com";
    private WebDriver driver;

//    @BeforeClass
//    public static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\!Setup\\Dev\\Webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        headerPage = new HeaderPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void canCreateNewAccount() {
//        signInPage = headerPage.clickSignIn();
//        registrationPage = signInPage.createNewAccountWithEmail(account.getEmail());
//        myAccountPage = registrationPage.fillAndSubmitRegistrationForm(account);
//        String actualResult = myAccountPage.getAccountName();
//        String expectedResult = account.getFirstCustomerName();
//
//        Assert.assertTrue("If test failed then user name is incorrect", actualResult.contains(expectedResult));
    }

    @Test
    public void isGuestMode() {
        Assert.assertTrue("If the test failed then a user is login.",
                headerPage.isGuestMode());
    }

    @Test
    public void isUserMode() {
        Assert.assertTrue("If the test failed then a user is not login.",
                headerPage.isGuestMode());
    }

    @Test
    public void isRegistrationPageValid() {
        if (headerPage.isUserMode())
            headerPage.clickSignOut();
        headerPage.clickSignIn();
        signInPage = new SignInPage(driver);
        Assert.assertTrue("If the test failed then Authorization Page is corrupted.",
                signInPage.isPageValid());
    }

    @Test
    public void isNewEmailValid() {
        String newEmail = Account.randomEmail(16);
        System.out.println("isNewEmailValid:: random email: " + newEmail);
        if (headerPage.isUserMode())
            headerPage.clickSignOut();
        headerPage.clickSignIn();
        signInPage = new SignInPage(driver);
        Assert.assertTrue("If the test failed then Authorization Page is corrupted.",
                signInPage.isPageValid());
        signInPage.typeEmail(newEmail).clickCreateAnAccount();
    }

    @Test
    public void isTest() {

    }
}
