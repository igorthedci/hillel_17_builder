package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

    private WebDriver driver;

    @FindBy(xpath = "//h1") // CREATE AN ACCOUNT
    private WebElement titlePage;

    private String getPageTitle() {
        return titlePage.getText();
    }
    @FindBy(xpath = "//div[contains(@class,'alert')]") // Alert
    private WebElement alertCreateAccount;

//    @FindBy(xpath = "//form[@id='create-account_form']/h3") // YOUR PERSONAL INFORMATION
    @FindBy(xpath = "//*[@id='account-creation_form']/div[1]/h3") // YOUR PERSONAL INFORMATION
    private WebElement titlePersonalInformation;
    private String getYourPersonalInformationTitle() {
        return titlePersonalInformation.getText();
    }
    @FindBy(xpath = "//div[@class='clearfix']/label") // Title
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
//    @FindBy(xpath = "//div[@class='account_creation']/h3") //YOUR ADDRESS
    @FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[2]/h3") //YOUR ADDRESS
    private WebElement titleYourAddress;
    private String getYourAddressTitle() {
        return titleYourAddress.getText();
    }
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
    @FindBy(xpath = "//label[@for='other']") // Additional information
    private WebElement labelAddressOther;

    @FindBy(xpath = "//textarea[@id='other']")
    private WebElement inputAddressOther;
    @FindBy(xpath = "//label[@for='phone']") // Home phone
    private WebElement labelAddressHomePhone;

    @FindBy(xpath = "//textarea[@id='phone']")
    private WebElement inputAddressHomePhone;
    @FindBy(xpath = "//label[@for='phone_mobile']") // Mobile phone
    private WebElement labelAddressMobilePhone;

    @FindBy(xpath = "//textarea[@id='phone_mobile']")
    private WebElement inputAddressMobilePhone;
    @FindBy(xpath = "//label[@for='alias']") // Alias
    private WebElement labelAddressAlias;

    @FindBy(xpath = "//textarea[@id='alias']")
    private WebElement inputAddressAlias;
    @FindBy(xpath = "//button[@id='SubmitAccount']") // Register
    private WebElement buttonRegisterAccount;

//    @FindBy(xpath = "//button[@id='SubmitAccount']/span")
    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    private WebElement labelRegisterAccount;
    private String getRegisterButtonTitle() {
        return labelRegisterAccount.getText();
    }

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CreateAccountPage clickCreateAnAccount() {
        buttonRegisterAccount.submit();
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

    public boolean isPageValid() {
        System.out.println("CreateAccountPage.isPageValid::");

        if (!this.getPageTitle().equals("CREATE AN ACCOUNT")) {
            System.out.println(".isPageValid:: pageTitle: " + this.getPageTitle());
            return false;
        }
//        Assert.assertEquals(this.getYourPersonalInformationTitle(), "YOUR PERSONAL INFORMATION");
        if (!getYourPersonalInformationTitle().equals("YOUR PERSONAL INFORMATION")) {
            System.out.println(".isPageValid:: createAccountTitle: " + getYourPersonalInformationTitle());
            return false;
        }
        if (!this.getYourAddressTitle().equals("YOUR ADDRESS")) {
            System.out.println(".isPageValid:: createAccountTitle: " + this.getYourAddressTitle());
            return false;
        }
        if (!this.getRegisterButtonTitle().equals("Register")) {
            System.out.println(".isPageValid:: emailHint: " + this.getRegisterButtonTitle());
            return false;
        }
        return true;
    }



}