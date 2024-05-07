package framework.steps;

import framework.pages.AccountProfilePage;
import framework.utility.seleniumUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class accountProfileSteps extends seleniumUtilities {
    @Then("Validate account create with {string}")
    public void validateAccountCreated(String expectedEmailAddress){
String actualProfileEmail=getElementTex(AccountProfilePage.PROFILE_EMAIL);
        Assert.assertEquals("Profile email should be equal as created one",expectedEmailAddress,actualProfileEmail);

    }
}
