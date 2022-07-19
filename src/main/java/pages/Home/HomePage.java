package pages.Home;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageObjectManager;

import java.time.Duration;

public class HomePage extends PageObjectManager {

    public HomePage(AndroidDriver driver) { super(driver); }

    By dailyEdition = By.id("flipboard.app:id/sliding_image_image_view");
    By ukraine = By.xpath("//android.widget.TextView[@text = 'UKRAINE']");
    By ukraineTitle = By.xpath("(//android.widget.TextView[@text = 'UKRAINE'])[3]");
    By whatsYourPassion = By.xpath("//android.widget.TextView[@text = 'WHAT’S YOUR PASSION?']");
    By whatsYourPassionTitle = By.xpath("//android.widget.EditText[@text = 'WHAT’S YOUR PASSION?']");
    By personalizeBtn = By.id("flipboard.app:id/page_overlay_action_button");
    By personalizeTitle = By.id("flipboard.app:id/topic_customize_title");
    By searchBar = By.id("flipboard.app:id/topic_customize_search_bar");
    By goldTopic = By.xpath("//android.widget.TextView[@text = '# GOLD (COMMODITY)']");
    By saveBtn = By.id("flipboard.app:id/topic_customize_done");
    By followingIcon = By.xpath("//android.widget.ImageView[@content-desc=\"Following\"]");
    By followingTitle = By.xpath("(//android.widget.TextView)[1]");
    By firstTopicMenu = By.xpath("(//android.widget.ImageView[@content-desc=\"Options\"])[1]");
    By unfollowBtn = By.xpath("//android.widget.LinearLayout[@content-desc=\"Unfollow\"]");
    By confirmUnfollowBtn = By.id("android:id/button1");
    By exploreIcon = By.xpath("//android.widget.ImageView[@content-desc=\"explore\"]");
    By exploreTitle = By.xpath("//android.widget.TextView[@text = 'EXPLORE']");
    By searchBox = By.id("flipboard.app:id/search_box_place_holder");
    By searchField = By.id("flipboard.app:id/search_view_input");
    By educationTxt = By.xpath("(//android.widget.TextView[@text = '# EDUCATION'])[1]");
    By topicTitle = By.id("flipboard.app:id/topic_header_tag");
    By notificationsIcon = By.xpath("//android.widget.ImageView[@content-desc=\"Notifications\"]");
    By notificationsTitle = By.id("flipboard.app:id/notification_sub_tab_title");
    By activityBtn = By.id("flipboard.app:id/notifications_filter_social");
    By updatesBtn = By.id("flipboard.app:id/notifications_filter_content");
    By notificationsList = By.id("flipboard.app:id/notifications_list");
    By profileIcon = By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]");
    By profileHeader = By.id("flipboard.app:id/profile_page_header");
    By profileAvatar = By.id("flipboard.app:id/profile_header_avatar");
    By updatePictureBtn = By.id("flipboard.app:id/update_account_avatar_subtitle");
    By chooseFromBtn = By.xpath("(//android.widget.LinearLayout)[5]");
    By galleryIcon = By.xpath("(//android.widget.LinearLayout)[9]");
    By image = By.xpath("(//android.widget.TextView)[6]");
    By imageSaveBtn = By.id("flipboard.app:id/update_button");
    By historyIcon = By.id("flipboard.app:id/profile_page_header_history");
    By historyTitle = By.id("flipboard.app:id/view_history_action_bar_title_view");
    By historyList = By.id("flipboard.app:id/empty_list_state_empty_state_view");
    By shareIcon = By.id("flipboard.app:id/profile_page_header_share_profile");
    By shareTabTitle = By.id("flipboard.app:id/title");
    By findFriendsICon = By.id("flipboard.app:id/profile_page_header_find_friends");
    By findPeopleTitle = By.xpath("(//android.widget.TextView)[1]");
    By followBtn = By.xpath("(//android.widget.TextView)[10]");
    By followingMassage = By.id("flipboard.app:id/snackbar_text");
    By redMagazineBtn = By.id("flipboard.app:id/magazine_grid_floating_action_button");
    By magazineTabTitle = By.xpath("(//android.widget.TextView)[1]");
    By forCollectingBtn = By.xpath("(//android.widget.LinearLayout)[4]");
    By forCollectingTabTitle = By.id("flipboard.app:id/create_magazine_mode_text");
    By magazineImage = By.xpath("(//android.widget.ImageView)[6]");
    By settingsIcon = By.id("flipboard.app:id/profile_page_header_settings");
    By settingsPageTitle = By.xpath("(//android.widget.TextView)[1]");
    By accountBtn = By.xpath("(//android.widget.RelativeLayout)[2]");
    By accountPageTitle = By.xpath("(//android.widget.TextView)[1]");
    By logoutBtn = By.xpath("(//android.widget.RelativeLayout)[7]");
    By alertTitle = By.id("flipboard.app:id/alertTitle");
    By confirmLogoutBtn = By.id("android:id/button1");
    By launchTitle = By.id("flipboard.app:id/first_launch_cover_title");

    public void clickDailyEdition(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(dailyEdition));
        driver.findElement(dailyEdition).click();
    }
    public boolean getDailyEditionPage(){
        return driver.findElement(dailyEdition).isDisplayed();
    }
    public void clickUkraine(){
        driver.findElement(ukraine).click();
    }
    public boolean getUkrainePage(){
        return driver.findElement(ukraineTitle).isDisplayed();
    }
    public void clickWhatsYourPassion(){
        driver.findElement(whatsYourPassion).click();
    }
    public boolean getWhatsYourPassionPage(){
        return driver.findElement(whatsYourPassionTitle).isDisplayed();
    }
    public void clickPersonalize(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(personalizeBtn));
        driver.findElement(personalizeBtn).click();
    }
    public String getPersonalizeTabTitle(){
        return driver.findElement(personalizeTitle).getText();
    }
    public void enterSearch(String search){
        driver.findElement(searchBar).sendKeys(search);
    }
    public void clickGold(){
        driver.findElement(goldTopic).click();
    }
    public void clickSaveChanges(){
        driver.findElement(saveBtn).click();
    }
    public void clickFollowing(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(followingIcon));
        driver.findElement(followingIcon).click();
    }
    public String getFollowingPageTitle(){
        return driver.findElement(followingTitle).getText();
    }
    public void clickFirstTopicMenu(){
        driver.findElement(firstTopicMenu).click();
    }
    public void clickUnfollow(){
        driver.findElement(unfollowBtn).click();
    }
    public void clickConfirmUnfollow(){
        driver.findElement(confirmUnfollowBtn).click();
    }
    public void clickExplore(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(exploreIcon));
        driver.findElement(exploreIcon).click();
    }
    public String getExplorePageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(exploreTitle));
        return driver.findElement(exploreTitle).getText();
    }
    public void clickSearchBox(){
        driver.findElement(searchBox).click();
    }
    public void enterSearchField(String search){
        driver.findElement(searchField).sendKeys(search);
    }
    public void pressEnter(){
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public String getEducation(){
        return driver.findElement(educationTxt).getText();
    }
    public void clickEducation(){
        driver.findElement(educationTxt).click();
    }
    public String getTopicPageTitle(){
        return driver.findElement(topicTitle).getText();
    }
    public void clickNotifications(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(notificationsIcon));
        driver.findElement(notificationsIcon).click();
    }
    public String getNotificationsPageTitle(){
        return driver.findElement(notificationsTitle).getText();
    }
    public void clickActivity(){
        driver.findElement(activityBtn).click();
    }
    public void clickUpdates(){
        driver.findElement(updatesBtn).click();
    }
    public boolean getNotificationsList(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(notificationsList));
        return driver.findElement(notificationsList).isDisplayed();
    }
    public void clickProfile(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
        driver.findElement(profileIcon).click();
    }
    public boolean getProfileHeader(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileHeader));
        return driver.findElement(profileHeader).isDisplayed();
    }
    public void clickProfileAvatar(){
        driver.findElement(profileAvatar).click();
    }
    public void clickUpdateProfilePicture(){
        driver.findElement(updatePictureBtn).click();
    }
    public void clickChooseFromLibrary(){
        driver.findElement(chooseFromBtn).click();
    }
    public void clickGallery(){
        driver.findElement(galleryIcon).click();
    }
    public void clickImage(){
        driver.findElement(image).click();
    }
    public void clickSave(){
        driver.findElement(imageSaveBtn).click();
    }
    public void clickHistory(){
        driver.findElement(historyIcon).click();
    }
    public String getHistoryPageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(historyTitle));
        return driver.findElement(historyTitle).getText();
    }
    public boolean getHistoryList(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(historyList));
        return driver.findElement(historyList).isDisplayed();
    }
    public void clickShare(){
        driver.findElement(shareIcon).click();
    }
    public String getShareTabTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(shareTabTitle));
        return driver.findElement(shareTabTitle).getText();
    }
    public void clickFindFriends(){
        driver.findElement(findFriendsICon).click();
    }
    public String getFindPeoplePageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findPeopleTitle));
        return driver.findElement(findPeopleTitle).getText();
    }
    public void clickFollow(){
        driver.findElement(followBtn).click();
    }
    public boolean getFollowingMassage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(followingMassage));
        return driver.findElement(followingMassage).isDisplayed();
    }
    public void clickRedMagazineGrid(){
        driver.findElement(redMagazineBtn).click();
    }
    public String getMagazineTabTitle(){
        return driver.findElement(magazineTabTitle).getText();
    }
    public void clickForCollecting(){
        driver.findElement(forCollectingBtn).click();
    }
    public String getForCollectingTabTitle(){
        return driver.findElement(forCollectingTabTitle).getText();
    }
    public boolean getMagazineImage(){
        return driver.findElement(magazineImage).isDisplayed();
    }
    public void clickSettings(){
        driver.findElement(settingsIcon).click();
    }
    public String getSettingsPageTitle(){
        return driver.findElement(settingsPageTitle).getText();
    }
    public void clickAccount(){
        driver.findElement(accountBtn).click();
    }
    public String getAccountPageTitle(){
        return driver.findElement(accountPageTitle).getText();
    }
    public void clickLogout(){
        driver.findElement(logoutBtn).click();
    }
    public String getConfirmLogoutTabTitle(){
        return driver.findElement(alertTitle).getText();
    }
    public void clickConfirmLogout(){
        driver.findElement(confirmLogoutBtn).click();
    }
    public String getLaunchTitle(){
        return driver.findElement(launchTitle).getText();
    }
}
