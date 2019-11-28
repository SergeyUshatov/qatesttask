package model;

import java.time.LocalDate;

public class FbUser {
    private String email;
    private String phoneNumber;
    private String Password;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private GenderCustomPronoun genderCustomPronoun;
    private String genderCustomOptional;

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public FbUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public FbUser setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public FbUser setPassword(String password) {
        Password = password;
        return this;
    }

    public FbUser setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FbUser setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FbUser setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public FbUser setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public GenderCustomPronoun getGenderCustomPronoun() {
        return genderCustomPronoun;
    }

    public String getGenderCustomOptional() {
        return genderCustomOptional;
    }

    public FbUser setGenderCustomPronoun(GenderCustomPronoun genderCustomPronoun) {
        this.genderCustomPronoun = genderCustomPronoun;
        return this;
    }

    public FbUser setGenderCustomOptional(String genderCustomOptional) {
        this.genderCustomOptional = genderCustomOptional;
        return this;
    }


    @Override
    public String toString() {
        // just to avoid a lot of information in test name when data providers are used
        return "";
    }
}
