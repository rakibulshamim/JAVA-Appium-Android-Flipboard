package pages.GetStarted;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageObjectManager;

public class GetStartedPage extends PageObjectManager {

    public GetStartedPage(AndroidDriver driver) {
        super(driver);
    }

    By getStartedBtn = By.id("flipboard.app:id/first_launch_get_started_button");
    By topicLogo = By.id("flipboard.app:id/topic_picker_logo");

    public void clickGetStartedBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(getStartedBtn));
        driver.findElement(getStartedBtn).click();
    }

    public boolean getTopicLogo(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(topicLogo));
        return driver.findElement(topicLogo).isDisplayed();
    }
}
