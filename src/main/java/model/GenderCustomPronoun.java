package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum GenderCustomPronoun {
    HE("He: \"Wish him a happy birthday!\""),
    SHE("She: \"Wish her a happy birthday!\""),
    THEY("They: \"Wish them a happy birthday!\"");

    private String details;

    GenderCustomPronoun(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public static GenderCustomPronoun randomGenderPronoun() {
        List<GenderCustomPronoun> values = Collections.unmodifiableList(Arrays.asList(values()));
        return values.get(new Random().nextInt(values.size()));
    }
}