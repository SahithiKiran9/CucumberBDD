package hr_admin;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();


    @Given("^Admin is on the login page$")
    public void adminIsOnLoginPage() {
        Assert.assertTrue(loginPage.verifyUserIsOnLoginPage());
    }

    @When("^Admin enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterAdminCredentials(String username, String password) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
    }

    @And("^Admin clicks on login button$")
    public void clickLogin(){
        loginPage.selectLogin();
    }

    @Then("^Admin should login succssfully$")
    public void verifyLogin(){
        Assert.assertTrue(dashboardPage.verifyUserIsOnDashboardPage());
    }

    @And("^Admin should see a welcome message as \"([^\"]*)\"$")
    public void verifyWelcomeMessage(String welcomeMessage){
        Assert.assertTrue(dashboardPage.verifyWelcomeMessage(welcomeMessage));
    }
}
