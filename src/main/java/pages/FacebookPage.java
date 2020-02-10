package pages;

import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static core.DriverManager.getDriver;

public class FacebookPage {

    private By inputEmail = By.id("email");
    private By inputPassword = By.id("pass");
    private By loginButton = By.xpath("//input[@data-testid='royal_login_button']");

    public void verifyPageURLIsCorrect(String expectedUrl) {
        String url = getDriver().getCurrentUrl();
        assertEquals(expectedUrl, url);
    }

    public void loginInput(String email, String pass) {
        getDriver().findElement(inputEmail).sendKeys(email);
        getDriver().findElement(inputPassword).sendKeys(pass);
    }

    public void clickLoginButton() {
        getDriver().findElement(loginButton).click();
    }
}
