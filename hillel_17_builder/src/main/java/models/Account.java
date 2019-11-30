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
    private String addressPostcode;
    private String addressCountry;
    private String addressComment;
    private String addressHomePhone;
    private String addressMobilePhone;
    private String addressAlias;

    public Account(String userGender, String userFirstName, String userLastName,
                   String userPass, String userEmail,
                   String userDay, String userMonth, String userYear,
                   String addressFirstName, String addressLastName,
                   String addressCompany, String addressAddress1, String addressAddress2,
                   String addressCity, String addressState,
                   String addressPostcode, String addressCountry, String addressComment,
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
        this.addressPostcode = addressPostcode;
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
        return addressPostcode;
    }

    public void setAddressZipcode(String addressPostcode) {
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
        private String addressPostcode;
        private String addressCountry;
        private String addressComment;
        private String addressHomePhone;
        private String addressMobilePhone;
        private String addressAlias;

        public AccountBuilder setUserGender(String userGender) {
            this.userGender = userGender;
            return this;
        }

        public AccountBuilder setUserFirstName(String userFirstName) {
            this.userFirstName = userFirstName;
            return this;
        }

        public AccountBuilder setUserLastName(String userLastName) {
            this.userLastName = userLastName;
            return this;
        }

        public AccountBuilder setUserPass(String userPass) {
            this.userPass = userPass;
            return this;
        }

        public AccountBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public AccountBuilder setUserDay(String userDay) {
            this.userDay = userDay;
            return this;
        }

        public AccountBuilder setUserMonth(String userMonth) {
            this.userMonth = userMonth;
            return this;
        }

        public AccountBuilder setUserYear(String userYear) {
            this.userYear = userYear;
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
                    userGender, userFirstName, userLastName,
                    userPass, userEmail,
                    userDay, userMonth, userYear,
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
        return result;
    }
}
