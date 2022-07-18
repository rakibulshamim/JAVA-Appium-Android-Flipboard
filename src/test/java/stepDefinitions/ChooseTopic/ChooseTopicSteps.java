package stepDefinitions.ChooseTopic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ChooseTopic.ChooseTopicPage;
import utils.AndroidSetup;


public class ChooseTopicSteps {

    ChooseTopicPage topic;

    public ChooseTopicSteps() {
        this.topic = new ChooseTopicPage(AndroidSetup.driver);
    }

    @Given("User select first topic from list")
    public void user_select_first_topic_from_list() throws InterruptedException {
        topic.clickTopicNews();
        Thread.sleep(3000);
    }

    @Given("User select second topic form list")
    public void user_select_second_topic_form_list() throws InterruptedException {
        topic.clickTopicTravel();
        Thread.sleep(3000);
    }

    @Given("User select third topic form list")
    public void user_select_third_topic_form_list() throws InterruptedException {
        topic.clickTopicTechnology();
        Thread.sleep(5000);
    }

    @When("Click on continue button")
    public void click_on_continue_button() throws InterruptedException {
        topic.clickContinue();
        Thread.sleep(3000);
    }

    @Then("Verify that login page is loaded")
    public void Verify_that_login_page_is_loaded() {
        Assert.assertEquals(topic.getLoginHeader(), "SIGN UP TO SAVE YOUR INTERESTS");
    }
}
