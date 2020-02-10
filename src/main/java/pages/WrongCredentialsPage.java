package pages;

import static org.junit.Assert.assertTrue;
import static core.DriverManager.getDriver;

import org.openqa.selenium.By;

public class WrongCredentialsPage {
    private By alertMessage = By.xpath("//div[@role='alert']");

    public void verifyAlertMessage(String expectedAlertText) {
        String alertText = getDriver().findElement(alertMessage).getText();
        assertTrue((alertText.contains(expectedAlertText)));
    }
}
