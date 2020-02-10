package pages;

import org.openqa.selenium.By;

import static core.DriverManager.getDriver;

public class SearchResultPage {
    private By facebookSearch = By.xpath("//a[@href='https://www.facebook.com/']");

    public void clickFacebookPage() {
        getDriver().findElement(facebookSearch).click();
    }
}
