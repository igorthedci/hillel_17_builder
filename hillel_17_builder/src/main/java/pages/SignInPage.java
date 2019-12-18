package pages;


import com.google.common.annotations.VisibleForTesting;
import models.Account;
import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {


//    private AlreadyRegistered alreadyRegistered;
//
//    private CreateAccountAttribute createAccountAttribute;

    @FindBy(xpath = "//h1")
    private WebElement titlePage;
    @FindBy(xpath = "//form[@id='create-account_form']/h3")
    private WebElement titleCreateAccount;
    @FindBy(xpath = "//form[@id='create-account_form']/div/p")
    private WebElement textEmailHint;
    @FindBy(xpath = "//label[@for='email_create']")
    private WebElement titleEmailAddress;
    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement inputEmailAddress;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement buttonCreateAccount;
    @FindBy(xpath = "//div[@id='create_account_error']")
    private WebElement alertCreateAccount;

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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
        System.out.println("SignInPage.isPageValid::");

        if (!this.getPageTitle().equals("AUTHENTICATION")) {
            System.out.println("SignInPage.isPageValid:: pageTitle: " + this.getPageTitle());
            return false;
        }
        if (!this.getCreateAccountTitle().equals("CREATE AN ACCOUNT")) {
            System.out.println("SignInPage.isPageValid:: createAccountTitle: " + this.getCreateAccountTitle());
            return false;
        }
        if (!this.getEmailHint().equals("Please enter your email address to create an account.")) {
            System.out.println("SignInPage.isPageValid:: emailHint: " + this.getEmailHint());
            return false;
        }
        if (!this.getEmailTitle().equals("Email address")) {
            System.out.println("SignInPage.isPageValid:: emailTitle: " + this.getEmailTitle());
            return false;
        }
        if (!this.getCreateButtonTitle().equals("Create an account")) {
            System.out.println("SignInPage.isPageValid:: createButtonTitle: " + this.getCreateButtonTitle());
            return false;
        }
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