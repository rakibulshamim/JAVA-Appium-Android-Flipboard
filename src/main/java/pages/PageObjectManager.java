package pages;

import io.appium.java_client.android.AndroidDriver;
import pages.ChooseTopic.ChooseTopicPage;
import pages.GetStarted.GetStartedPage;
import pages.Home.HomePage;
import pages.Login.LoginPage;
import pages.Post.PostPage;

public class PageObjectManager {

    public AndroidDriver driver;

    public PageObjectManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public GetStartedPage started() {return new GetStartedPage(driver);}
    public ChooseTopicPage topic(){return new ChooseTopicPage(driver);}
    public LoginPage login(){return new LoginPage(driver);}
    public PostPage post(){return new PostPage(driver);}
    public HomePage home(){return new HomePage(driver);}
}
