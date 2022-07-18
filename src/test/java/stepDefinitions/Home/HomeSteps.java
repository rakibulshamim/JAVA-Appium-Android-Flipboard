package stepDefinitions.Home;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Home.HomePage;
import pages.Post.PostPage;
import utils.AndroidSetup;

public class HomeSteps {

    HomePage home;
    PostPage menu;

    public HomeSteps() {
        this.home = new HomePage(AndroidSetup.driver);
        this.menu = new PostPage(AndroidSetup.driver);
    }

    @Given("Click on Daily Edition")
    public void click_on_daily_edition() throws InterruptedException {
        Thread.sleep(5000);
        home.clickDailyEdition();
        Thread.sleep(3000);
    }

    @When("Verify that Daily Edition page is open")
    public void verify_that_daily_edition_page_is_open() throws InterruptedException {
        Assert.assertTrue(home.getDailyEditionPage());
        Thread.sleep(2000);
    }

    @When("Click on Ukraine")
    public void click_on_ukraine() throws InterruptedException {
        home.clickUkraine();
        Thread.sleep(3000);
    }

    @When("Verify that Ukraine page is open")
    public void verify_that_ukraine_page_is_open() throws InterruptedException {
        Assert.assertTrue(home.getUkrainePage());
        Thread.sleep(2000);
    }

    @When("Click on What's Your Passion")
    public void click_on_what_s_your_passion() throws InterruptedException {
        home.clickWhatsYourPassion();
        Thread.sleep(3000);
    }

    @Then("Verify that What's Your Passion page is open")
    public void verify_that_what_s_your_passion_page_is_open() throws InterruptedException {
        Assert.assertTrue(home.getWhatsYourPassionPage());
        Thread.sleep(2000);
    }

    @Given("Click on Personalize button")
    public void click_on_personalize_button() throws InterruptedException {
        Thread.sleep(5000);
        home.clickPersonalize();
        Thread.sleep(3000);
    }

    @When("Verify that Personalize For You tab is open")
    public void verify_that_personalize_for_you_tab_is_open() throws InterruptedException {
        Assert.assertEquals(home.getPersonalizeTabTitle(),"PERSONALIZE FOR YOU");
        Thread.sleep(2000);
    }

    @When("Type {string} in search bar")
    public void type_in_search_bar(String search) throws InterruptedException {
        home.enterSearch(search);
        Thread.sleep(3000);
    }

    @When("Click on GOLD\\(COMMODITY) from the list")
    public void click_on_gold_commodity_from_the_list() throws InterruptedException {
        home.clickGold();
        Thread.sleep(3000);
    }

    @When("Click on Save Changes button")
    public void click_on_save_changes_button() {
        home.clickSaveChanges();
    }

    @Then("Verify that Updated message appears")
    public void verify_that_updated_message_appears() {
        Assert.assertEquals(menu.getPopUpMassage(),"Updated");
    }

    @Given("Click on Following icon from bottom nav")
    public void click_on_following_icon_from_bottom_nav() throws InterruptedException {
        Thread.sleep(5000);
        home.clickFollowing();
        Thread.sleep(5000);
    }

    @When("Verify that Following page is open properly")
    public void verify_that_following_page_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getFollowingPageTitle(), "FOLLOWING");
        Thread.sleep(2000);
    }

    @When("Click on first topic menu from the list")
    public void click_on_first_topic_menu_from_the_list() throws InterruptedException {
        home.clickFirstTopicMenu();
        Thread.sleep(3000);
    }

    @When("Click on Unfollow button")
    public void click_on_unfollow_button() throws InterruptedException {
        home.clickUnfollow();
        Thread.sleep(3000);
    }

    @When("Click on Unfollow button again from Unfollow tab")
    public void click_on_unfollow_button_again_from_unfollow_tab() {
        home.clickConfirmUnfollow();
    }

    @Given("Click on Explore icon from bottom nav")
    public void click_on_explore_icon_from_bottom_nav() throws InterruptedException {
        Thread.sleep(5000);
        home.clickExplore();
        Thread.sleep(5000);
    }

    @When("Verify that Explore page is open properly")
    public void verify_that_explore_page_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getExplorePageTitle(),"EXPLORE");
        Thread.sleep(2000);
    }

    @When("Click on search box")
    public void click_on_search_box() throws InterruptedException {
        home.clickSearchBox();
        Thread.sleep(3000);
    }

    @When("Enter {string} in search bar")
    public void enter_in_search_bar(String search) throws InterruptedException {
        home.enterSearchField(search);
        Thread.sleep(1000);
    }

    @When("Press Enter key")
    public void press_enter_key() throws InterruptedException {
        home.pressEnter();
        Thread.sleep(2000);
    }

    @When("Verify that search results display properly")
    public void verify_that_search_results_display_properly() throws InterruptedException {
        Assert.assertEquals(home.getEducation(),"# EDUCATION");
        Thread.sleep(1000);
    }

    @When("Click on first search result topic")
    public void click_on_first_search_result_topic() throws InterruptedException {
        home.clickEducation();
        Thread.sleep(5000);
    }

    @Then("Verify that proper topic page is open")
    public void verify_that_proper_topic_page_is_open() {
        Assert.assertEquals(home.getTopicPageTitle(),"# EDUCATION");
    }

    @Given("Click on Notifications icon from bottom nav")
    public void click_on_notifications_icon_from_bottom_nav() throws InterruptedException {
        Thread.sleep(5000);
        home.clickNotifications();
        Thread.sleep(5000);
    }

    @When("Verify that Notifications page is open properly")
    public void verify_that_notifications_page_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getNotificationsPageTitle(), "NOTIFICATIONS");
        Thread.sleep(2000);
    }

    @When("Click on Activity button")
    public void click_on_activity_button() throws InterruptedException {
        home.clickActivity();
        Thread.sleep(2000);
    }

    @When("Verify that activity notifications are displayed")
    public void verify_that_activity_notifications_are_displayed() throws InterruptedException {
        Assert.assertTrue(home.getNotificationsList());
        Thread.sleep(1000);
    }

    @When("Click on Updates button")
    public void click_on_updates_button() throws InterruptedException {
        home.clickUpdates();
        Thread.sleep(3000);
    }

    @Then("Verify that update notifications are displayed")
    public void verify_that_update_notifications_are_displayed() {
        Assert.assertTrue(home.getNotificationsList());
    }

    @Given("Click on Profile icon from bottom nav")
    public void click_on_profile_icon_from_bottom_nav() throws InterruptedException {
        Thread.sleep(5000);
        home.clickProfile();
        Thread.sleep(5000);
    }

    @When("Verify that Profile page is open properly")
    public void verify_that_profile_page_is_open_properly() throws InterruptedException {
        Assert.assertTrue(home.getProfileHeader());
        Thread.sleep(1000);
    }

    @When("Click on profile avatar")
    public void click_on_profile_avatar() throws InterruptedException {
        home.clickProfileAvatar();
        Thread.sleep(3000);
    }

    @And("Click on Update Profile Picture button")
    public void click_on_update_profile_picture_button() throws InterruptedException {
        home.clickUpdateProfilePicture();
        Thread.sleep(3000);
    }

    @When("Click on Choose From Library")
    public void click_on_choose_from_library() throws InterruptedException {
        home.clickChooseFromLibrary();
        Thread.sleep(3000);
    }

    @When("Click on Gallery")
    public void click_on_gallery() throws InterruptedException {
        home.clickGallery();
        Thread.sleep(3000);
    }

    @When("Click on first image from gallery")
    public void click_on_first_image_from_gallery() throws InterruptedException {
        home.clickImage();
        Thread.sleep(3000);
    }

    @Then("Click on Save button")
    public void click_on_save_button() throws InterruptedException {
        home.clickSave();
        Thread.sleep(3000);
    }

    @Then("Verify that profile picture is uploaded and Profile page is loaded properly")
    public void verify_that_profile_picture_is_uploaded_and_profile_page_is_loaded_properly() {
        Assert.assertTrue(home.getProfileHeader());
    }

    @When("Click on history icon from profile page header")
    public void click_on_history_icon_from_profile_page_header() throws InterruptedException {
        home.clickHistory();
        Thread.sleep(3000);
    }

    @Then("Verify that History page is open properly")
    public void verify_that_history_page_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getHistoryPageTitle(),"HISTORY");
        Thread.sleep(2000);
    }

    @Then("Verify that history list is showing properly")
    public void verify_that_history_list_is_showing_properly() {
        Assert.assertTrue(home.getHistoryList());
    }

    @And("Click on Share icon from profile page header")
    public void click_on_share_icon_from_profile_page_header() throws InterruptedException {
        home.clickShare();
        Thread.sleep(3000);
    }

    @Then("Verify that Share Tab is open properly")
    public void verify_that_share_tab_is_open_properly() {
        Assert.assertEquals(home.getShareTabTitle(),"Share your profile, so users can follow you");
    }

    @When("Click on Find Friends icon from profile page header")
    public void click_on_find_friends_icon_from_profile_page_header() throws InterruptedException {
        home.clickFindFriends();
        Thread.sleep(3000);
    }

    @When("Verify that Find People to Follow page is open properly")
    public void verify_that_find_people_to_follow_page_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getFindPeoplePageTitle(),"Find People to Follow");
        Thread.sleep(1000);
    }

    @When("Click on Follow button")
    public void click_on_follow_button() throws InterruptedException {
        home.clickFollow();
        Thread.sleep(1000);
    }

    @Then("Verify that Following message appears")
    public void verify_that_following_message_appears() {
        Assert.assertTrue(home.getFollowingMassage());
    }

    @When("Click on red magazine grid button")
    public void click_on_red_magazine_grid_button() throws InterruptedException {
        home.clickRedMagazineGrid();
        Thread.sleep(3000);
    }

    @When("Verify that Make a Magazine tab is open properly")
    public void verify_that_make_a_magazine_tab_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getMagazineTabTitle(),"MAKE A MAGAZINE");
        Thread.sleep(1000);
    }

    @When("Click on For collecting")
    public void click_on_for_collecting() throws InterruptedException {
        home.clickForCollecting();
        Thread.sleep(3000);
    }

    @And("Verify that For collecting tab is open properly")
    public void verify_that_for_collecting_tab_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getForCollectingTabTitle(), "For collecting");
        Thread.sleep(1000);
    }

    @Then("Verify that magazine was created successfully")
    public void verify_that_magazine_was_created_successfully() {
        Assert.assertTrue(home.getMagazineImage());
    }

    @When("Click on settings icon from profile page header")
    public void click_on_settings_icon_from_profile_page_header() throws InterruptedException {
        home.clickSettings();
        Thread.sleep(3000);
    }

    @When("Verify that settings page is open properly")
    public void verify_that_settings_page_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getSettingsPageTitle(),"SETTINGS");
        Thread.sleep(1000);
    }

    @When("Click on Account button")
    public void click_on_account_button() throws InterruptedException {
        home.clickAccount();
        Thread.sleep(3000);
    }

    @When("Verify that Account page is open properly")
    public void verify_that_account_page_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getAccountPageTitle(),"ACCOUNT");
        Thread.sleep(1000);
    }

    @When("Click on Log out button")
    public void click_on_log_out_button() throws InterruptedException {
        home.clickLogout();
        Thread.sleep(3000);
    }

    @When("Verify that confirm alert tab is open properly")
    public void verify_that_confirm_alert_tab_is_open_properly() throws InterruptedException {
        Assert.assertEquals(home.getConfirmLogoutTabTitle(),"LOG OUT OF FLIPBOARD?");
        Thread.sleep(1000);
    }

    @When("Click on confirm Log out button")
    public void click_on_confirm_log_out_button() throws InterruptedException {
        home.clickConfirmLogout();
        Thread.sleep(3000);
    }

    @Then("Verify that user can Log out successfully")
    public void verify_that_user_can_log_out_successfully() {
        Assert.assertEquals(home.getLaunchTitle(),"DISCOVER AND SHARE THE STORIES THAT MATTER TO YOU");
    }
}
