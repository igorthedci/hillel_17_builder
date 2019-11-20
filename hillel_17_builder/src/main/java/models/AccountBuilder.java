package models;

public class AccountBuilder {

    private String userGender;
    private String userFirstName;
    private String userLastName;
    private String userPass;
    private String userEmail;
    private String userDay;
    private String userMonth;
    private String userYear;
    private String addressFirstName;
    private String addressLastName;
    private String addressCompany;
    private String addressAddress1;
    private String addressAddress2;
    private String addressCity;
    private String addressState;
    private String addressZipcode;
    private String addressCountry;
    private String addressComment;
    private String addressHomePhone;
    private String addressMobilePhone;
    private String addressAlias;

    private Account newAccount;

    public AccountBuilder() {
        newAccount = new Account();
    }
    public Account build() {
        return newAccount; // (gender, firstCustomerName, lastCustomerName, pass, email, day, month, year, firstName, lastName, company, address1, address2, city, state, postcode, country, phone_mobile, alias);
    }
    public AccountBuilder withUserGender(String gender) {
        this.userGender = gender;
        return this;
    }
    public AccountBuilder withUserFirstName(String firstName) {
        this.userFirstName = firstName;
        return this;
    }
    public AccountBuilder withUserLastName(String lastName) {
        this.userLastName = lastName;
        return this;
    }
    public AccountBuilder withUserPass(String password) {
        this.userPass = password;
        return this;
    }
    public AccountBuilder withUserEmail(String email) {
        this.userEmail = email;
        return this;
    }
    public AccountBuilder withUserDay(String day) {
        this.userDay = day;
        return this;
    }
    public AccountBuilder withUserMonth(String month) {
        this.userMonth = month;
        return this;
    }
    public AccountBuilder withUserYear(String year) {
        this.userYear = year;
        return this;
    }
    public AccountBuilder withAddressFirstName(String firstName) {
        this.addressFirstName = firstName;
        return this;
    }
    public AccountBuilder withAddressLastName(String lastName) {
        this.addressLastName = lastName;
        return this;
    }
    public AccountBuilder withAddressCompany(String company) {
        this.addressCompany = company;
        return this;
    }
    public AccountBuilder withAddressAddress1(String address) {
        this.addressAddress1 = address;
        return this;
    }
    public AccountBuilder withAddressAddress2(String address) {
        this.addressAddress2 = address;
        return this;
    }
    public AccountBuilder withAddressCity(String city) {
        this.addressCity = city;
        return this;
    }
    public AccountBuilder withAddressState(String state) {
        this.addressState = state;
        return this;
    }
    public AccountBuilder withAddressZipcode(String zipcode) {
        this.addressZipcode = zipcode;
        return this;
    }
    public AccountBuilder withAddressCountry(String country) {
        this.addressCountry = country;
        return this;
    }
    public AccountBuilder withAddressComment(String comment) {
        this.addressComment = comment;
        return this;
    }
    public AccountBuilder withAddressHomePhone(String phone) {
        this.addressHomePhone = phone;
        return this;
    }
    public AccountBuilder withAddressMobilePhone(String phone) {
        this.addressMobilePhone = phone;
        return this;
    }
    public AccountBuilder withAddressAlias(String alias) {
        this.addressAlias = alias;
        return this;
    }
}