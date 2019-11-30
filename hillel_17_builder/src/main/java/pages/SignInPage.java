package pages;


import com.google.common.annotations.VisibleForTesting;
import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

//    private AlreadyRegistered alreadyRegistered;
//
//    private CreateAccountAttribute createAccountAttribute;

    @FindBy(xpath = "//h1")
    private WebElement titlePage;
    @FindBy(xpath = "//form[@id='create-account_form']/h3")
    private WebElement titleCreateAccount;
    @FindBy(xpath = "//form[@id='create-account_form']/div")
    private WebElement textEmailHint;
    @FindBy(xpath = "//label[@for='email_create']")
    private WebElement titleEmailAddress;
    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement inputEmailAddress;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement buttonCreateAccount;
    @FindBy(xpath = "//div[@id='create_account_error']")
    private WebElement alertCreateAccount;

    public String getPageTitle() {
        return titlePage.getText();
    }

    public String getCreateAccountTitle() {
        return titleCreateAccount.getText();
    }

    public String getEmailHint() {
        return textEmailHint.getText();
    }

    public String getEmailTitle() {
        return titleEmailAddress.getText();
    }

    public String getCreateButtonTitle() {
        return buttonCreateAccount.getText();
    }

    public boolean isPageValid() {

        WebDriverWait waitForButton = new WebDriverWait(driver, 10);
        waitForButton.until(ExpectedConditions.visibilityOf(buttonCreateAccount));

        if (!this.getPageTitle().equals("AUTHENTICATION"))
            return false;
        if (!this.getCreateAccountTitle().equals("CREATE AN ACCOUNT"))
            return false;
        if (!this.getEmailHint().equals("Please enter your email address to create an account."))
            return false;
        if (!this.getEmailTitle().equals("Email address"))
            return false;
        if (!this.getCreateButtonTitle().equals("Create an account"))
            return false;
        return true;
    }

    public SignInPage typeEmail(String anEmail) {
        inputEmailAddress.clear();
        inputEmailAddress.sendKeys(anEmail);
        return this;
    }

    public SignInPage clickCreateAnAccount() {
        buttonCreateAccount.submit();
        return this;
    }

    public boolean isAlert() {
        if (alertCreateAccount != null)
            return true;
        return false;
    }

//    public RegistrationPage createNewAccountWithEmail(String email){
//        createAccountAttribute = new CreateAccountAttribute(driver);
//        return createAccountAttribute.typeEmail(email).clickCreateAnAccount();
//    }


}