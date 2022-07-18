package stepDefinitions.Post;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Post.PostPage;
import utils.AndroidSetup;

public class PostSteps {

    PostPage post;

    public PostSteps() {
        this.post = new PostPage(AndroidSetup.driver);
    }

    @And("Click on three dots menu from post")
    public void click_on_three_dots_menu_from_post() throws InterruptedException {
        Thread.sleep(5000);
        post.clickThreeDotsMenu();
        Thread.sleep(3000);
    }

    @Then("Verify that three dots menu lists are open properly")
    public void verify_that_three_dots_menu_lists_are_open_properly() throws InterruptedException {
        Assert.assertTrue(post.getMenuLists());
        Thread.sleep(1000);
    }

    @Given("Click on Like button from menu lists")
    public void Click_on_like_button_from_menu_lists() throws InterruptedException {
        post.clickLike();
        Thread.sleep(1000);
    }

    @Then("Verify that post has been liked")
    public void verify_that_post_has_been_liked() {
        Assert.assertTrue(post.getLikeFeedback());
    }

    @Given("Click on Show less like this button from menu lists")
    public void click_on_show_less_like_this_button_from_menu_lists() throws InterruptedException {
        post.clickShowLessLikeThis();
        Thread.sleep(3000);
    }

    @When("Click on Done button")
    public void click_on_done_button() throws InterruptedException {
        post.clickDone();
        Thread.sleep(1000);
    }

    @Then("Verify that feedback massage is displayed")
    public void verify_that_feedback_massage_is_displayed() {
        Assert.assertEquals(post.getFeedbackMassage(),"Thank you for the feedback!");
    }

    @Given("Click on Mute button from menu lists")
    public void click_on_mute_button_from_menu_lists() throws InterruptedException {
        post.clickMute();
        Thread.sleep(1000);
    }

    @Then("Verify that story hidden massage is displayed")
    public void verify_that_story_hidden_massage_is_displayed() throws InterruptedException {
        Assert.assertEquals(post.getStoryHiddenMassage(),"STORY\n" + "HIDDEN");
        Thread.sleep(3000);
    }

    @Given("Click on flip button from menu lists")
    public void click_on_flip_button_from_menu_lists() throws InterruptedException {
        post.clickFlip();
        Thread.sleep(3000);
    }

    @When("Verify that flip tab is open")
    public void verify_that_flip_tab_is_open() throws InterruptedException {
        Assert.assertEquals(post.getFlipTabTitle(),"What’s interesting about this?");
        Thread.sleep(1000);
    }

    @When("Click on Create new magazine button")
    public void click_on_create_new_magazine_button() throws InterruptedException {
        post.clickCreateMagazine();
        Thread.sleep(3000);
    }

    @When("Enter magazine {string} in magazine name box")
    public void enter_magazine_in_magazine_name_box(String title) throws InterruptedException {
        post.enterMagazineTitle(title);
        Thread.sleep(3000);
    }

    @When("Enter magazine {string} magazine description box")
    public void enter_magazine_magazine_description_box(String description) throws InterruptedException {
        post.enterMagazineDescription(description);
        Thread.sleep(3000);
    }

    @When("Click on Make this private button")
    public void click_on_make_this_private_button() throws InterruptedException {
        post.clickMagazinePrivate();
        Thread.sleep(3000);
    }

    @Then("Click on Next button")
    public void click_on_next_button() throws InterruptedException {
        post.clickNext();
        Thread.sleep(2000);
    }

    @And("Verify that Flipped message appears")
    public void verify_that_flipped_message_appears() {
        Assert.assertEquals(post.getPopUpMassage(),"Flipped into The New York Times");
    }

    @Given("Click on share button from menu lists")
    public void click_on_share_button_from_menu_lists() throws InterruptedException {
        post.clickShare();
        Thread.sleep(3000);
    }

    @When("Verify that share tab is open")
    public void verify_that_share_tab_is_open() throws InterruptedException {
        Assert.assertEquals(post.getShareTabTitle(),"Share");
        Thread.sleep(1000);
    }

    @When("Click on Facebook icon")
    public void click_on_facebook_icon() throws InterruptedException {
        post.clickFacebook();
        Thread.sleep(3000);
    }

    @Then("Click on Post button")
    public void click_on_post_button() throws InterruptedException {
        post.clickPost();
        Thread.sleep(3000);
    }

    @When("Click on View on Web button from menu lists")
    public void click_on_view_on_web_button_from_menu_lists() throws InterruptedException {
        post.clickViewOnWeb();
        Thread.sleep(5000);
    }

    @When("Click on Chrome browser")
    public void click_on_chrome_browser() throws InterruptedException {
        post.clickChromeBrowser();
        Thread.sleep(3000);
    }

    @Then("Verify that post is displayed in a web browser")
    public void verify_that_post_is_displayed_in_a_web_browser() throws InterruptedException {
        Assert.assertTrue(post.getWebView());
        Thread.sleep(1000);
        post.pressBack();
    }

    @Given("Scroll down menu list")
    public void scroll_down_menu_list() throws InterruptedException {
        post.scroll();
        Thread.sleep(1000);
    }

    @When("Click on Copy link button from menu lists")
    public void click_on_copy_link_button_from_menu_lists() throws InterruptedException {
        post.clickCopyLink();
        Thread.sleep(1000);
    }

    @Then("Verify that Copied Link message appears")
    public void verify_that_copied_link_message_appears() throws InterruptedException {
        Assert.assertEquals(post.getPopUpMassage(),"Copied Link to Clipboard");
        Thread.sleep(3000);
    }

    @When("Click on Save Image In Device button from menu lists")
    public void click_on_save_image_in_device_button_from_menu_lists() throws InterruptedException {
        post.clickSaveImage();
        Thread.sleep(3000);
    }

    @When("Click on allow for give permission to download")
    public void click_on_allow_for_give_permission_to_download() throws InterruptedException {
        post.clickPermissionAllow();
        Thread.sleep(3000);
    }

    @Then("Verify that Image saved message appears")
    public void verify_that_image_saved_message_appears() {
        Assert.assertEquals(post.getPopUpMassage(),"Image saved");
    }

    @When("Click on Report button from menu lists")
    public void click_on_report_button_from_menu_lists() throws InterruptedException {
        post.clickReport();
        Thread.sleep(3000);
    }

    @When("Click on This is off topic")
    public void click_on_this_is_off_topic() throws InterruptedException {
        post.clickOffTopic();
        Thread.sleep(3000);
    }

    @Then("Click on first reason from the list")
    public void click_on_first_reason_from_the_list() throws InterruptedException {
        post.clickThisStory();
        Thread.sleep(1000);
    }
}
