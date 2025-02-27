package framework.pages;

import framework.utility.seleniumUtilities;
import org.openqa.selenium.By;

public class createAccountPage{
    public static final By NAME_INPUT=By.name("name");
    public static final By EMAIL_INPUT=By.name("email");
    public static final By PASSWORD_INPUT=By.name("password");
    public static final By CONFIRM_PASSWORD_INPUT=By.name("confirmPassword");
    public static final By SIGN_UP_BUTTON=By.id("signupBtn");
    public static final By ERROR_MESSAGE=By.className("error");
}
