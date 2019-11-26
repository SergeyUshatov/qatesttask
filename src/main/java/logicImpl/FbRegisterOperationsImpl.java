package logicImpl;

import logic.AppManager;
import logic.FbRegisterOperations;
import model.FbUser;
import model.Gender;

public class FbRegisterOperationsImpl extends DriverBasedOperations implements FbRegisterOperations {
    public FbRegisterOperationsImpl(AppManager appManager) {
        super(appManager);
    }

    @Override
    public void fillForm(FbUser user) {
        pages.getFbRegisterPage().enterFirstName(user.getFirstName());
        pages.getFbRegisterPage().enterLastName(user.getLastName());
        pages.getFbRegisterPage().enterPhoneOrEmail(user.getEmail());
        pages.getFbRegisterPage().enterEmailConfirmation(user.getEmail());
        pages.getFbRegisterPage().enterPassword(user.getPassword());
        pages.getFbRegisterPage().selectMonthOfBirth(user.getBirthDate());
        pages.getFbRegisterPage().selectDayOfBirth(user.getBirthDate());
        pages.getFbRegisterPage().selectYearOfBirth(user.getBirthDate());
        pages.getFbRegisterPage().selectGender(user.getGender());

        if (user.getGender() == Gender.CUSTOM) {
            pages.getFbRegisterPage().selectGenderCustomPronoun(user.getGenderCustomPronoun());
            pages.getFbRegisterPage().enterGenderCustomOptional(user.getGenderCustomOptional());
        }

    }

    @Override
    public void submitForm() {
        pages.getFbRegisterPage().clickOnSignUp();
    }
}
