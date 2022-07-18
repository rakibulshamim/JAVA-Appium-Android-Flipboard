package pages.ChooseTopic;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageObjectManager;

public class ChooseTopicPage extends PageObjectManager {

    public ChooseTopicPage(AndroidDriver driver) {
        super(driver);
    }

    By topicNews = By.xpath("//android.widget.TextView[@text = '# NEWS']");
    By topicTravel = By.xpath("//android.widget.TextView[@text = '# TRAVEL']");
    By topicTechnology = By.xpath("//android.widget.TextView[@text = '# TECHNOLOGY']");
    By continueBtn = By.xpath("//android.widget.TextView[@text='Continue']");
    By loginHeader = By.id("flipboard.app:id/account_login_buttons_header");

    public void clickTopicNews(){
        driver.findElement(topicNews).click();
    }
    public void clickTopicTravel(){
        driver.findElement(topicTravel).click();
    }
    public void clickTopicTechnology(){ driver.findElement(topicTechnology).click();}
    public void clickContinue(){ driver.findElement(continueBtn).click();}
    public String getLoginHeader(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginHeader));
        return driver.findElement(loginHeader).getText();
    }
}
