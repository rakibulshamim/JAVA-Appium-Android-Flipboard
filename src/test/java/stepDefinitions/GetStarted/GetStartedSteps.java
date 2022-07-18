package stepDefinitions.GetStarted;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GetStarted.GetStartedPage;
import utils.AndroidSetup;

import java.net.MalformedURLException;

public class GetStartedSteps {

    GetStartedPage started;
    AndroidSetup androidSetup = new AndroidSetup();

    public GetStartedSteps() throws MalformedURLException {
        androidSetup.androidSetupAppium();
        this.started = new GetStartedPage(AndroidSetup.driver);
    }

    @Given("Click on Get started button")
    public void click_on_get_started_button() throws InterruptedException {
        started.clickGetStartedBtn();
        Thread.sleep(5000);
    }

    @Then("Topic select page is loaded")
    public void topic_select_page_is_loaded() {
        Assert.assertTrue(started.getTopicLogo());
    }
}
