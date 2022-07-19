package pages.Post;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageObjectManager;

import java.time.Duration;

public class PostPage extends PageObjectManager {

    public PostPage(AndroidDriver driver) {
        super(driver);
    }

    By threeDotsMenu = By.xpath("(//android.widget.ImageView)[7]");
    By menuLists = By.id("flipboard.app:id/bottom_sheet_content_view");
    By shareIcon = By.xpath("(//android.widget.LinearLayout)[12]");
    By shareTabTitle = By.id("flipboard.app:id/title");
    By flipIcon = By.xpath("(//android.widget.LinearLayout)[10]");
    By flipTabTitle = By.id("flipboard.app:id/flip_ui_commentary");
    By heartIcon = By.xpath("(//android.widget.LinearLayout)[4]");
    By feedbackMassage = By.id("flipboard.app:id/snackbar_text");
    By createMagazineBtn = By.xpath("(//android.widget.LinearLayout)[4]");
    By magazineTitle = By.id("flipboard.app:id/create_magazine_title");
    By magazineDescription = By.id("flipboard.app:id/create_magazine_description");
    By magazinePrivateBtn = By.id("flipboard.app:id/create_magazine_privacy_toggle");
    By nextBtn = By.id("flipboard.app:id/create_magazine_button");
    By saveImageBtn = By.xpath("(//android.widget.LinearLayout)[18]");
    By permissionBtn = By.id("com.lbe.security.miui:id/permission_allow_foreground_only_button");
    By popUpText = By.xpath("/hierarchy/android.widget.Toast");
    By showLessLikeBtn = By.xpath("(//android.widget.LinearLayout)[6]");
    By muteIcon = By.xpath("(//android.widget.LinearLayout)[8]");
    By viewOnWebBtn = By.xpath("(//android.widget.LinearLayout)[14]");
    By webView = By.xpath("//android.webkit.WebView");
    By copyLinkIcon = By.xpath("(//android.widget.LinearLayout)[16]");
    By reportBtn = By.xpath("(//android.widget.LinearLayout)[20]");
    By storyHiddenMassage = By.id("flipboard.app:id/removed_text");
    By facebookIcon = By.xpath("//android.widget.TextView[@text = 'News Feed']");
    By postBtn = By.xpath("//android.view.ViewGroup[@content-desc=\"POST\"]");
    By offTopicBtn = By.xpath("(//android.widget.LinearLayout)[4]");
    By doneBtn = By.id("flipboard.app:id/bottom_sheet_done_button");
    By thisStoryBtn = By.xpath("(//android.widget.LinearLayout)[4]");
    By chromeBrowser = By.xpath("(//android.widget.ImageView)[2]");


    public void clickThreeDotsMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(threeDotsMenu));
        driver.findElement(threeDotsMenu).click();
    }
    public boolean getMenuLists(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuLists));
        return driver.findElement(menuLists).isDisplayed();
    }
    public void clickShare(){
        driver.findElement(shareIcon).click();
    }
    public String getShareTabTitle(){
        return driver.findElement(shareTabTitle).getText();
    }
    public void clickFlip(){
        driver.findElement(flipIcon).click();
    }
    public String getFlipTabTitle(){
        return driver.findElement(flipTabTitle).getText();
    }
    public void clickLike(){
        driver.findElement(heartIcon).click();
    }
    public boolean getLikeFeedback(){
        return driver.findElement(feedbackMassage).isDisplayed();
    }
    public void clickCreateMagazine(){
        driver.findElement(createMagazineBtn).click();
    }
    public void enterMagazineTitle(String title){
        driver.findElement(magazineTitle).sendKeys(title);
    }
    public void enterMagazineDescription(String description){
        driver.findElement(magazineDescription).sendKeys(description);
    }
    public void clickMagazinePrivate(){
        driver.findElement(magazinePrivateBtn).click();
    }
    public void clickNext(){
        driver.findElement(nextBtn).click();
    }
    public void clickSaveImage(){
        driver.findElement(saveImageBtn).click();
    }
    public void clickPermissionAllow(){
        driver.findElement(permissionBtn).click();
    }
    public String getPopUpMassage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(popUpText));
        return driver.findElement(popUpText).getText();
    }
    public void clickShowLessLikeThis(){
        driver.findElement(showLessLikeBtn).click();
    }
    public void clickDone(){
        driver.findElement(doneBtn).click();
    }
    public String getFeedbackMassage(){
        return driver.findElement(feedbackMassage).getText();
    }
    public void clickMute(){
        driver.findElement(muteIcon).click();
    }
    public void clickViewOnWeb(){
        driver.findElement(viewOnWebBtn).click();
    }
    public boolean getWebView(){
        return driver.findElement(webView).isDisplayed();
    }
    public void pressBack(){
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
    public void clickCopyLink(){
        driver.findElement(copyLinkIcon).click();
    }
    public void clickReport(){
        driver.findElement(reportBtn).click();
    }
    public String getStoryHiddenMassage(){
        return driver.findElement(storyHiddenMassage).getText();
    }
    public void clickOffTopic(){
        driver.findElement(offTopicBtn).click();
    }
    public void clickThisStory(){
        driver.findElement(thisStoryBtn).click();
    }
    public void clickChromeBrowser(){
        driver.findElement(chromeBrowser).click();
    }
    public void clickFacebook(){
        driver.findElement(facebookIcon).click();
    }
    public void clickPost(){
        driver.findElement(postBtn).click();
    }
    public void scroll(){
        TouchAction action =new TouchAction(driver);
        Dimension size	=driver.manage().window().getSize();
        int width=size.width;
        int height=size.height;
        int middleOfX=width/2;
        int startYCoordinate= (int)(height*.7);
        int endYCoordinate= (int)(height*.2);

        action.press(PointOption.point(middleOfX, startYCoordinate))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
    }
}
