package framework.steps;

import framework.utility.seleniumUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class hooks extends seleniumUtilities {
    @Before
    public void beforeScenario(){
        setUpBrowser();
    }
    @After
    public void afterScenarios(Scenario scenario){
        if (scenario.isFailed()){
        TakesScreenshot takesScreenshot=(TakesScreenshot)getDriver();
        byte[] screenshot=takesScreenshot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","screenshot");}
        quitBrowser();
    }
}
