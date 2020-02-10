package facebook;

import core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import pages.*;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

@RunWith(SerenityRunner.class)
public class FacebookTest {
    @Before
    public void basicConfigure() {
        BasicConfigurator.configure();
    }

    @After
    public void killDriver() {
        DriverManager.kill();
    }

    @Test
    public void firstTest() {

        String alertMessageRu = "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту.";
        //String alertMessageUK = "The email or phone number you’ve entered doesn’t match any account.";

        BrowserPage GooglePageNavigate = new BrowserPage();
        GooglePageNavigate.navigateTo("https://www.google.com");

        GooglePage TypeTextToSearchField = new GooglePage();
        TypeTextToSearchField.inputToSearchField("Facebook");

        SearchResultPage GoogleSearchResult = new SearchResultPage();
        GoogleSearchResult.clickFacebookPage();

        FacebookPage FacebookLoginPage = new FacebookPage();
        FacebookLoginPage.verifyPageURLIsCorrect("https://www.facebook.com/");
        FacebookLoginPage.loginInput("badLogin", "badPassword");
        FacebookLoginPage.clickLoginButton();

        WrongCredentialsPage VerifyAlertMessageAppears = new WrongCredentialsPage();
        VerifyAlertMessageAppears.verifyAlertMessage(alertMessageRu);

    }
}
