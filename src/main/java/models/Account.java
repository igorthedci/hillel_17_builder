package models;

public class Account {

    private String personalGender;
    private String personalFirstName;
    private String personalLastName;
    private String personalEmail;
    private String personalPassword;
    private String personalDay;
    private String personalMonth;
    private String personalYear;
    private String addressFirstName;
    private String addressLastName;
    private String addressCompany;
    private String addressAddress1;
    private String addressAddress2;
    private String addressCity;
    private String addressState;
    private String addressPostcode;
    private String addressCountry;
    private String addressComment;
    private String addressHomePhone;
    private String addressMobilePhone;
    private String addressAlias;

    public Account(String personalGender, String personalFirstName, String personalLastName,
                   String personalEmail, String personalPassword,
                   String personalDay, String personalMonth, String personalYear,
                   String addressFirstName, String addressLastName,
                   String addressCompany, String addressAddress1, String addressAddress2,
                   String addressCity, String addressState,
                   String addressPostcode, String addressCountry, String addressComment,
                   String addressHomePhone, String addressMobilePhone, String addressAlias) {
        this.personalGender = personalGender;
        this.personalFirstName = personalFirstName;
        this.personalLastName = personalLastName;
        this.personalEmail = personalEmail;
        this.personalPassword = personalPassword;
        this.personalDay = personalDay;
        this.personalMonth = personalMonth;
        this.personalYear = personalYear;
        this.addressFirstName = addressFirstName;
        this.addressLastName = addressLastName;
        this.addressCompany = addressCompany;
        this.addressAddress1 = addressAddress1;
        this.addressAddress2 = addressAddress2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressPostcode = addressPostcode;
        this.addressCountry = addressCountry;
        this.addressComment = addressComment;
        this.addressHomePhone = addressHomePhone;
        this.addressMobilePhone = addressMobilePhone;
        this.addressAlias = addressAlias;
    }

    public String getPersonalGender() {
        return personalGender;
    }

    public void setPersonalGender(String personalGender) {
        this.personalGender = personalGender;
    }

    public String getPersonalFirstName() {
        return personalFirstName;
    }

    public void setPersonalFirstName(String personalFirstName) {
        this.personalFirstName = personalFirstName;
    }

    public String getPersonalLastName() {
        return personalLastName;
    }

    public void setPersonalLastName(String personalLastName) {
        this.personalLastName = personalLastName;
    }

    public String getPersonalPassword() {
        return personalPassword;
    }

    public void setPersonalPassword(String personalPassword) {
        this.personalPassword = personalPassword;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getPersonalDay() {
        return personalDay;
    }

    public void setPersonalDay(String personalDay) {
        this.personalDay = personalDay;
    }

    public String getPersonalMonth() {
        return personalMonth;
    }

    public void setPersonalMonth(String personalMonth) {
        this.personalMonth = personalMonth;
    }

    public String getPersonalYear() {
        return personalYear;
    }

    public void setPersonalYear(String personalYear) {
        this.personalYear = personalYear;
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

    public String getAddressPostcode() {
        return addressPostcode;
    }

    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
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

    public static class AccountBuilder {
        private String personalGender;
        private String personalFirstName;
        private String personalLastName;
        private String personalPassword;
        private String personalEmail;
        private String personalDay;
        private String personalMonth;
        private String personalYear;
        private String addressFirstName;
        private String addressLastName;
        private String addressCompany;
        private String addressAddress1;
        private String addressAddress2;
        private String addressCity;
        private String addressState;
        private String addressPostcode;
        private String addressCountry;
        private String addressComment;
        private String addressHomePhone;
        private String addressMobilePhone;
        private String addressAlias;

        public AccountBuilder setPersonalGender(String personalGender) {
            this.personalGender = personalGender;
            return this;
        }

        public AccountBuilder setPersonalFirstName(String userFirstName) {
            this.personalFirstName = userFirstName;
            return this;
        }

        public AccountBuilder setPersonalLastName(String theString) {
            this.personalLastName = theString;
            return this;
        }

        public AccountBuilder setPersonalEmail(String theString) {
            this.personalEmail = theString;
            return this;
        }

        public AccountBuilder setPersonalPassword(String theString) {
            this.personalPassword = theString;
            return this;
        }

        public AccountBuilder setPersonalDay(String personalDay) {
            this.personalDay = personalDay;
            return this;
        }

        public AccountBuilder setPersonalMonth(String personalMonth) {
            this.personalMonth = personalMonth;
            return this;
        }

        public AccountBuilder setPersonalYear(String personalYear) {
            this.personalYear = personalYear;
            return this;
        }

        public AccountBuilder setAddressFirstName(String addressFirstName) {
            this.addressFirstName = addressFirstName;
            return this;
        }

        public AccountBuilder setAddressLastName(String addressLastName) {
            this.addressLastName = addressLastName;
            return this;
        }

        public AccountBuilder setAddressCompany(String addressCompany) {
            this.addressCompany = addressCompany;
            return this;
        }

        public AccountBuilder setAddressAddress1(String addressAddress1) {
            this.addressAddress1 = addressAddress1;
            return this;
        }

        public AccountBuilder setAddressAddress2(String addressAddress2) {
            this.addressAddress2 = addressAddress2;
            return this;
        }

        public AccountBuilder setAddressCity(String addressCity) {
            this.addressCity = addressCity;
            return this;
        }

        public AccountBuilder setAddressState(String addressState) {
            this.addressState = addressState;
            return this;
        }

        public AccountBuilder setAddressPostcode(String addressPostcode) {
            this.addressPostcode = addressPostcode;
            return this;
        }

        public AccountBuilder setAddressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
            return this;
        }

        public AccountBuilder setAddressComment(String addressComment) {
            this.addressComment = addressComment;
            return this;
        }

        public AccountBuilder setAddressHomePhone(String phone) {
            this.addressHomePhone = phone;
            return this;
        }

        public AccountBuilder setAddressMobilePhone(String phone) {
            this.addressMobilePhone = phone;
            return this;
        }

        public AccountBuilder setAddressAlias(String alias) {
            this.addressAlias = alias;
            return this;
        }

        public Account build() {
            return new Account(
                    personalGender, personalFirstName, personalLastName,
                    personalEmail, personalPassword,
                    personalDay, personalMonth, personalYear,
                    addressFirstName, addressLastName,
                    addressCompany, addressAddress1, addressAddress2,
                    addressCity, addressState,
                    addressPostcode, addressCountry, addressComment,
                    addressHomePhone, addressMobilePhone, addressAlias
            );
        }
    }

    public static String randomEmail(int emailLength) {
        String result = "email";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet = alphabet + "0123456789";
        int aLength = alphabet.length();

        for (int i = 0; i < emailLength; i++) {
            result += alphabet.charAt((int) (Math.random() * aLength));
        }

        result += "@gmail.com";
        System.out.println("randomEmail:: random email: " + result);
        return result;
    }

    public static String randomPassword(int theLength) {
        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet = alphabet + "0123456789";
        alphabet = alphabet + "!@#$%^&*()";
        int aLength = alphabet.length();

        for (int i = 0; i < theLength; i++) {
            result += alphabet.charAt((int) (Math.random() * aLength));
        }

        System.out.println("randomPassword:: random password: " + result);
        return result;
    }
}
