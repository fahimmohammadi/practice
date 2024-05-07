package framework.steps;

import framework.base.baseSetup;
import framework.pages.HomePage;
import framework.utility.seleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomepageSteps extends seleniumUtilities {
    @Given("open browser and navigate to retail app")
    public void openAndNavigateBroswer(){
        setUpBrowser();
}
@Then("Navigate Title on top left corner")
    public void ValidateTopLeftCorner(){
String tittle=getElementTex(HomePage.HOME_PAGE_TITLE);
    Assert.assertEquals("TEKSCHOOL",tittle);
}
@Then("quit browser")
    public void quitBrowser(){
        getDriver().quit();
}

@Then("Validate sign in button is enables")
    public void validateSignInEnabled(){
boolean isSignInEnabled=isElementEnabled(HomePage.SIGN_IN_BUTTON);
Assert.assertTrue(isSignInEnabled);
}
@When("Click on Sign In Button")
    public void clickOnSignInButton(){
        clickONElement(HomePage.SIGN_IN_BUTTON);
}
@Then("Validate Account button is displayed")
    public void validateAccountButtonISDisplayed(){
boolean isACcountButtonDisplayed=isElementDisplayed(HomePage.ACCOUNT_BUTTON);
Assert.assertTrue("account button should be displayed true", isACcountButtonDisplayed);
}


    }

