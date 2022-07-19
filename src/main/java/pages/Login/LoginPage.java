package pages.Login;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageObjectManager;

import java.time.Duration;

public class LoginPage extends PageObjectManager {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    By skipForNowBtn = By.id("flipboard.app:id/account_login_buttons_skip");
    By homeView = By.xpath("(//android.widget.FrameLayout)[7]");
    By topicLoginBtn = By.xpath("(//android.widget.TextView)[1]");
    By loginBtn = By.id("flipboard.app:id/account_login_email_next_button");
    By emailBtn = By.xpath("//android.view.ViewGroup");
    By noneOfTheAboveBtn = By.id("com.google.android.gms:id/cancel");
    By emailField = By.id("flipboard.app:id/account_login_username_or_email");
    By emailNextBtn = By.xpath("//android.widget.TextView[@text = 'NEXT']");
    By passwordField = By.xpath("(//android.widget.EditText)[2]");
    By errorMessage = By.id("android:id/message");
    By okBtn = By.id("android:id/button1");

    public void clickSkipForNow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(skipForNowBtn));
        driver.findElement(skipForNowBtn).click();
    }

    public boolean getHomeNavIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeView));
        return driver.findElement(homeView).isDisplayed();
    }

    public void clickTopicLoginBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(topicLoginBtn));
        driver.findElement(topicLoginBtn).click();
    }

    public void clickLoginBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(loginBtn).click();
    }

    public void clickEmailBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(emailBtn));
        driver.findElement(emailBtn).click();
    }

    public void clickNoneOfTheAbove(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(noneOfTheAboveBtn));
        driver.findElement(noneOfTheAboveBtn).click();
    }

    public void enterEmail(String email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickEmailNextBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(emailNextBtn));
        driver.findElement(emailNextBtn).click();
    }

    public void enterPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public String getErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).getText();
    }

    public void clickOk(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(okBtn));
        driver.findElement(okBtn).click();
    }
}
