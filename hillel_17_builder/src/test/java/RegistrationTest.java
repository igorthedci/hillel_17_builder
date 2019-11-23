import models.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HeaderPage;
import pages.SignInPage;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    private Account account;
    private HeaderPage headerPage;
    private SignInPage signInPage;
    private RegistrationPage registrationPage;
    private MyAccountPage myAccountPage;

    private final String linkShop = "http://automationpractice.com";
    private WebDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        headerPage = new HeaderPage();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void canCreateNewAccount() {
        signInPage = headerPage.clickSignIn();
        registrationPage = signInPage.createNewAccountWithEmail(account.getEmail());
        myAccountPage = registrationPage.fillAndSubmitRegistrationForm(account);
        String actualResult = myAccountPage.getAccountName();
        String expectedResult = account.getFirstCustomerName();

        Assert.assertTrue("If test failed then user name is incorrect", actualResult.contains(expectedResult));
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
        signInPage = headerPage.clickSignIn();
        Assert.assertTrue("If the test failed then Authorization Page is corrupted.",
                signInPage.isPageValid());
    }

    @Test
    public void isNewEmailValid() {
        String newEmail = new Account().randomEmail(16);
        if (headerPage.isUserMode())
            headerPage.clickSignOut();
        signInPage = headerPage.clickSignIn();
        Assert.assertTrue("If the test failed then Authorization Page is corrupted.",
                signInPage.isPageValid());
        signInPage.typeEmail(newEmail).clickCreateAnAccount();

    }

    @Test
    public void isTest() {

    }
}
