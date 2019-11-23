package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountForm {

    private WebDriver driver;
    public CreateAccountForm(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//form[@id='create-account_form']/h3")
    private WebElement titlePersonalInformation;

    @FindBy(xpath = "//div[@class='clearfix']/label")
    private WebElement titleGender;

    @FindBy(xpath = "//input[@id='id_gender1']") // gender Mr.
    private WebElement radioGenderMr;
    @FindBy(xpath = "//label[@for='id_gender1']")
    private WebElement titleGenderMr;

    @FindBy(xpath = "//input[@id='id_gender2']") // gender Mrs.
    private WebElement radioGenderMrs;
    @FindBy(xpath = "//label[@for='id_gender2']")
    private WebElement titleGenderMrs;

    @FindBy(xpath = "//label[@for='customer_firstname']") // personal First name
    private WebElement titlePersonalFirstName;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement inputPersonalFirstName;

    @FindBy(xpath = "//label[@for='customer_lastname']") // personal Last name
    private WebElement titlePersonalLastName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement inputPersonalLastName;

    @FindBy(xpath = "//label[@for='customer_lastname']") // Email
    private WebElement titlePersonalEmail;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement inputPersonalEmail;

    @FindBy(xpath = "//label[@for='passwd']") // Password
    private WebElement titlePersonalPassword;
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement inputPersonalPassword;

    @FindBy(xpath = "//div[@class='form-group']/label") // Date of Birth
    private WebElement titlePersonalDate;
    @FindBy(xpath = "//select[@id='days']")
    private WebElement listPersonalDay;
    @FindBy(xpath = "//select[@id='months']")
    private WebElement listPersonalMonth;
    @FindBy(xpath = "//select[@id='years']")
    private WebElement listPersonalYear;

    @FindBy(xpath = "//input[@id='newsletter']") // Newsletter
    private WebElement checkboxNewsletter;
    @FindBy(xpath = "//label[@for='SubmitCreate']")
    private WebElement titleNewsletter;

    @FindBy(xpath = "//input[@id='optin']") // Special Offers
    private WebElement checkboxOffers;
    @FindBy(xpath = "//label[@for='optin']")
    private WebElement titleOffers;

    @FindBy(xpath = "//div[@class='account_creation']/h3") //YOUR ADDRESS
    private WebElement titleYourAddress;

    @FindBy(xpath = "//label[@for='firstname']") // First name
    private WebElement labelAddressFirstName;
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement inputAddressFirstName;

    @FindBy(xpath = "//label[@for='lastname']") // Last name
    private WebElement labelAddressLastName;
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement inputAddressLastName;

    @FindBy(xpath = "//label[@for='company']") // Company
    private WebElement labelAddressCompany;
    @FindBy(xpath = "//input[@id='company']")
    private WebElement inputAddressCompany;

    @FindBy(xpath = "//label[@for='address1']") // Address1
    private WebElement labelAddressAddress1;
    @FindBy(xpath = "//input[@id='address1']")
    private WebElement inputAddressAddress1;

    @FindBy(xpath = "//label[@for='address2']") // Address2
    private WebElement labelAddressAddress2;
    @FindBy(xpath = "//input[@id='address2']")
    private WebElement inputAddressAddress2;

    @FindBy(xpath = "//label[@for='city']") // City
    private WebElement labelAddressCity;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement inputAddressCity;

    @FindBy(xpath = "//label[@for='state']") // State
    private WebElement labelAddressState;
    @FindBy(xpath = "//input[@id='state']")
    private WebElement inputAddressState;

    @FindBy(xpath = "//label[@for='postcode']") // Postcode
    private WebElement labelAddressPostcode;
    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement inputAddressPostcode;

    @FindBy(xpath = "//label[@for='country']") // Country
    private WebElement labelAddressCountry;
    @FindBy(xpath = "//input[@id='country']")
    private WebElement inputAddressCountry;

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
        if (this.getPageTitle() != "AUTHENTICATION")
            return false;
        if (this.getCreateAccountTitle() != "CREATE AN ACCOUNT")
            return false;
        if (this.getEmailHint() != "Please enter your email address to create an account.")
            return false;
        if (this.getEmailTitle() != "Email address")
            return false;
        if (this.getCreateButtonTitle() != "Create an account")
            return false;
        return true;
    }
    public CreateAccountForm typeEmail(String anEmail) {
        inputEmailAddress.clear();
        inputEmailAddress.sendKeys(anEmail);
        return this;
    }
    public CreateAccountForm clickCreateAnAccount() {
        buttonCreateAccount.submit();
        return this;
    }
    public boolean isAlert() {
        if (alertCreateAccount != null)
            return true;
        return false;
    }

    public RegistrationPage createNewAccountWithEmail(String email){
        createAccountAttribute = new CreateAccountAttribute(driver);
        return createAccountAttribute.typeEmail(email).clickCreateAnAccount();
    }



}