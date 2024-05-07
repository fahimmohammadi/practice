package framework.steps;

import framework.pages.AccountProfilePage;
import framework.pages.LoginPage;
import framework.pages.createAccountPage;
import framework.utility.seleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class createAccountSteps extends seleniumUtilities {
 @When("Fill Create Account form {string} {string} {string}")
    public void fillUPCreateAccountForm(String name, String email, String password){
     sendText(createAccountPage.NAME_INPUT,name);
     sendText(createAccountPage.EMAIL_INPUT, email);
     sendText(createAccountPage.PASSWORD_INPUT,password);
     sendText(createAccountPage.CONFIRM_PASSWORD_INPUT,password);
 }
  @When("Click on sign up button")
  public void clickOnSignUPButton(){
     clickONElement(createAccountPage.SIGN_UP_BUTTON);
 }
  @Then("Validate Error message {string}")
  public void validateErrorMessage(String expectedError) {
  String actualError = getElementTex(LoginPage.ERROR_MESSAGE);
  Assert.assertEquals("this email is already exist, please use another email address",
  expectedError,actualError);

 }
}
