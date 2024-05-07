package framework.steps;

import framework.pages.HomePage;
import framework.pages.LoginPage;
import framework.utility.seleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps extends seleniumUtilities {
    @When("When Click on Sign In Button")
    public void clickOnSignInButton(){
        clickONElement(HomePage.SIGN_IN_BUTTON);
    }
    @And("Enter username {string} and password {string}")
    public void enterCredentials(String username,String password) {
        sendText(LoginPage.USERNAME_INPUT,username);
        sendText(LoginPage.PASSWORD_INPUT,password);
    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        clickONElement(LoginPage.LOGIN_BUTTON);
    }

    @Then("Validate error message {string}")
    public void validateErrorMessage(String errorMessage) {
        String actualErrorMessage = getElementTex(LoginPage.ERROR_MESSAGE);
        Assert.assertEquals("wrong username or password",errorMessage);
    }
    @When("Click on Create New Account button")
    public void clickonNewAccountLink(){
clickONElement(LoginPage.CREATE_NEW_ACCOUNT_LINK);
    }
}
