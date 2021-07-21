package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilis.BrowserUtils;
import utilis.ConfigurationReader;
import utilis.Driver;

public class LoginPage_stepDef {

    LoginPage loginPage= new LoginPage();

    @Given("user open the main page")
    public void userOpenTheMainPage() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Then("user able to see login button and can click")
    public void userAbleToSeeLoginButtonAndCanClick() {
        loginPage.signInButton.click();
    }
    @Given("user in the login page")
    public void user_open_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

        loginPage.signInButton.click();
    }

    @When("user enter the valid username and click the next button")
    public void userEnterTheValidUsername() {
        String username=ConfigurationReader.get("username");
        loginPage.usernameInput.sendKeys(username);
        BrowserUtils.waitFor(2);
        loginPage.next1Button.click();


    }
    @And("user enter the valid password and click the next button")
    public void userEnterTheValidPasswordAndClickTheNextButton() {
        String password= ConfigurationReader.get("password");

        loginPage.passwordInput.sendKeys(password);
        BrowserUtils.waitFor(2);
        loginPage.signIn2Button.click();
    }


    @Then("user can see the expected title")
    public void userCanSeeTheDashboard() {

        String actualTitle= Driver.get().getTitle();
         String expectedTitle="Sign In | Sony";
        System.out.println("title = " + actualTitle);

       // BrowserUtils.titleVerification("PlayStation® Official Site: Consoles, Games, Accessories & More");
        Assert.assertEquals(expectedTitle,actualTitle);
    }



}
