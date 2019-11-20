package models;

public class Account {

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

    public Account() {
    }

    public Account(String userGender, String userFirstName, String userLastName,
                   String userPass, String userEmail,
                   String userDay, String userMonth, String userYear,
                   String addressFirstName, String addressLastName,
                   String addressCompany, String addressAddress1, String addressAddress2,
                   String addressCity, String addressState,
                   String addressZipcode, String addressCountry, String addressComment,
                   String addressHomePhone, String addressMobilePhone, String addressAlias) {
        this.userGender = userGender;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPass = userPass;
        this.userEmail = userEmail;
        this.userDay = userDay;
        this.userMonth = userMonth;
        this.userYear = userYear;
        this.addressFirstName = addressFirstName;
        this.addressLastName = addressLastName;
        this.addressCompany = addressCompany;
        this.addressAddress1 = addressAddress1;
        this.addressAddress2 = addressAddress2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZipcode = addressZipcode;
        this.addressCountry = addressCountry;
        this.addressComment = addressComment;
        this.addressHomePhone = addressHomePhone;
        this.addressMobilePhone = addressMobilePhone;
        this.addressAlias = addressAlias;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDay() {
        return userDay;
    }

    public void setUserDay(String userDay) {
        this.userDay = userDay;
    }

    public String getUserMonth() {
        return userMonth;
    }

    public void setUserMonth(String userMonth) {
        this.userMonth = userMonth;
    }

    public String getUserYear() {
        return userYear;
    }

    public void setUserYear(String userYear) {
        this.userYear = userYear;
    }

    public String getAddressFirstName() {
        return addressFirstName;
    }

    public void setAddressFirstName(String addressFirstName) {
        this.addressFirstName = addressFirstName;
    }

    public String getAddressLastName() {
        return addressLastName;
    }

    public void setAddressLastName(String addressLastName) {
        this.addressLastName = addressLastName;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    public String getAddressAddress1() {
        return addressAddress1;
    }

    public void setAddressAddress1(String addressAddress1) {
        this.addressAddress1 = addressAddress1;
    }

    public String getAddressAddress2() {
        return addressAddress2;
    }

    public void setAddressAddress2(String addressAddress2) {
        this.addressAddress2 = addressAddress2;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressZipcode() {
        return addressZipcode;
    }

    public void setAddressZipcode(String addressZipcode) {
        this.addressZipcode = addressZipcode;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressComment() {
        return addressComment;
    }

    public void setAddressComment(String addressComment) {
        this.addressComment = addressComment;
    }

    public String getAddressHomePhone() {
        return addressHomePhone;
    }

    public void setAddressHomePhone(String addressHomePhone) {
        this.addressHomePhone = addressHomePhone;
    }

    public String getAddressMobilePhone() {
        return addressMobilePhone;
    }

    public void setAddressMobilePhone(String addressMobilePhone) {
        this.addressMobilePhone = addressMobilePhone;
    }

    public String getAddressAlias() {
        return addressAlias;
    }

    public void setAddressAlias(String addressAlias) {
        this.addressAlias = addressAlias;
    }

    public String randomEmail(int emailLength) {
        String result = "email";
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        alphabet = alphabet + "0123456789";
        int aLength = alphabet.length();

        for(int i = 0; i < emailLength; i++) {
            result += alphabet.charAt((int) (Math.random() * (1 + aLength)));
        }

        result += "@gmail.com";
        return result;
    }
}
