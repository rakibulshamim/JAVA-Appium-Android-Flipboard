package stepDefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Login.LoginPage;
import utils.AndroidSetup;

public class LoginSteps {

    LoginPage login;

    public LoginSteps() {
        this.login = new LoginPage(AndroidSetup.driver);
    }

    @When("Click on Skip for Now button")
    public void click_on_skip_for_now_button() {
        login.clickSkipForNow();
    }

    @Then("Home page is loaded without login")
    public void home_page_is_loaded_without_login() {
        Assert.assertTrue(login.getHomeNavIcon());
    }

    @And("Click on topic picker login button")
    public void click_on_topic_picker_login_button() throws InterruptedException {
        login.clickTopicLoginBtn();
        Thread.sleep(5000);
    }

    @Given("Click on Email button")
    public void click_on_email_button() throws InterruptedException {
        login.clickEmailBtn();
        Thread.sleep(3000);
    }

    @Given("Click on None of The Above button")
    public void click_on_none_of_the_above_button() throws InterruptedException {
        login.clickNoneOfTheAbove();
        Thread.sleep(3000);
    }

    @When("User enter {string} in the email field")
    public void user_enter_in_the_email_field(String email) throws InterruptedException {
        login.enterEmail(email);
        Thread.sleep(5000);
    }

    @When("Click on NEXT button")
    public void click_on_next_button() throws InterruptedException {
        login.clickEmailNextBtn();
        Thread.sleep(5000);
    }

    @When("User enter {string} in the password field")
    public void user_enter_in_the_password_field(String password) throws InterruptedException {
        login.enterPassword(password);
        Thread.sleep(5000);
    }

    @And("Click on login button")
    public void click_on_login_button() {
        login.clickLoginBtn();
    }

    @Then("Login successfully and home page is loaded")
    public void login_successfully_and_home_page_is_loaded() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(login.getHomeNavIcon());
    }

    @Then("Error message should be visible")
    public void error_message_should_be_visible() throws InterruptedException {
        Assert.assertEquals(login.getErrorMessage(), "Please check your username and password and try again.");
        Thread.sleep(2000);
        login.clickOk();
    }

    //Background
    @When("Enter username {string}")
    public void enter_username(String email) throws InterruptedException {
        login.enterEmail(email);
        Thread.sleep(5000);
    }

    //Background
    @When("Enter password {string}")
    public void enter_password(String password) throws InterruptedException {
        login.enterPassword(password);
        Thread.sleep(5000);
    }
}
