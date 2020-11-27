package geco;

import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGeneration {

    public PasswordGeneration(){}

    public String getRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
        return RandomStringUtils.random( 8, characters );
    }
}
