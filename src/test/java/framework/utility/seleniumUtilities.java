package framework.utility;

import framework.base.baseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumUtilities extends baseSetup {
    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(),Duration.ofSeconds(10));
    }

    private WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getElementTex(By locator) {
        WebElement element = waitForVisibility(locator);
        return element.getText();

    }

    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator).isEnabled();
    }

    public void clickONElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendText(By locator,String text) {
        waitForVisibility(locator).sendKeys(text);
    }

    public boolean isElementDisplayed(By locator) {
        return waitForVisibility(locator).isEnabled();
    }
}




