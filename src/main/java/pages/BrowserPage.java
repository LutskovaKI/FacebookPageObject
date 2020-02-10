package pages;

import static core.DriverManager.getDriver;

public class BrowserPage {
    public void navigateTo(String url) {
        getDriver().get(url);
    }
}
