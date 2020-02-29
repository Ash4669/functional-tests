package Faker;

import IntegerUtils.IntegerUtils;
import com.github.javafaker.Faker;

public class FakerUtils {

    public String generateFirstName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public String generateLastName() {
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public String generatePassword(int passwordMin16) {
        String password = "";
        String allCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!£$%^&*@#";
        for (int i = 0; i < passwordMin16; i++){
            password = password.concat(String.valueOf(allCharacters.charAt(IntegerUtils.getRandomNumberFromZero(allCharacters.length() - 1))));
        }
        return password;
    }
}
