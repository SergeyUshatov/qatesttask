package utils;

import model.FbUser;
import model.Gender;
import model.GenderCustomPronoun;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class FbUserHelper {

    public static FbUser randomUser() {
        Gender gender = Gender.randomGender();
        FbUser user = new FbUser()
                .setFirstName(getRandomString(15))
                .setLastName(getRandomString(15))
                .setPhoneNumber(getRandomPhone())
                .setEmail(getRandomEmail())
                .setBirthDate(randomBirthday())
                .setGender(gender)
                .setPassword(getRandomString(10));

        if (gender == Gender.CUSTOM) {
            user.setGenderCustomPronoun(GenderCustomPronoun.randomGenderPronoun());
            user.setGenderCustomOptional(getRandomString(20));
        }
        return user;
    }

    private static String getRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    private static String getRandomPhone() {
        return "+" + RandomStringUtils.randomNumeric(12);
    }

    private static String getRandomEmail() {
        return (RandomStringUtils.randomAlphabetic(10)
                + "@gmeil.com").toLowerCase();
    }

    private static LocalDate randomBirthday() {
        return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
    }
}
