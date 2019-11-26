package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Gender {
    FEMALE,
    MALE,
    CUSTOM;

    public static Gender randomGender() {
        List<Gender> values = Collections.unmodifiableList(Arrays.asList(values()));
        return values.get(new Random().nextInt(values.size()));
    }
}
