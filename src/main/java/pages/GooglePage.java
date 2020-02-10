package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static core.DriverManager.getDriver;

public class GooglePage {
    private By searchField = By.name("q");

    public void inputToSearchField(String text) {
        getDriver().findElement(searchField).sendKeys(text + Keys.ENTER);
    }
}
