package models;

public class EmailGenerator {

    public String EmailGenerator(int emailLength) {
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
