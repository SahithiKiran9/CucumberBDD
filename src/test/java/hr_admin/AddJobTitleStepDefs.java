package hr_admin;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddJobTitleStepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    JobTitlesPage jobTitlesPage = new JobTitlesPage();

    @Given("^Admin is on the Dashboard page$")
    public void verifyuser() {
        Assert.assertTrue(dashboardPage.verifyUserIsOnDashboardPage());
    }

    @When("^Admin clicks on the Job tab in Admin module$")
    public void clickJobTab() {
        jobTitlesPage.adminTab();
        jobTitlesPage.jobTab();
    }

    @Then("^Admin clicks on Job Titles option in drop down menu$")
    public void selectJobTitlesOption(){
        jobTitlesPage.jobTitleOption();
    }

    @And("^Admin should view the Job Titles page with Add and Delete Buttons$")
    public void viewJobTitlePage(){
        Assert.assertTrue(jobTitlesPage.verifyJobTitlePage());
    }

    @Given("^Admin is on the JobTitles page$")
    public void verifyJobTitlePage(){
        Assert.assertTrue(jobTitlesPage.verifyJobTitlePage());
    }

    @When("^Admin clicks on the Add button$")
    public void adminbtn(){
        jobTitlesPage.verifyAddButton();
    }

    @Then("^Admin enters into the add job title page$")
    public void addJobTitlePage(){
        Assert.assertTrue(jobTitlesPage.verifyAddJobTitlePage());
    }

    @When("^Admin enters name and description in the respective text fields and selects save button$")
    public void enterJobTitleData(String title, String description) {
        jobTitlesPage.enterTitle("Junior Tester");
        jobTitlesPage.enterDescription("Junior Manual and Automation Tester");
        jobTitlesPage.saveJobTitle();
    }

    @Then("^Admin should see the entered result in the Job title table$")
    public void resultTable(){
        Assert.assertTrue(jobTitlesPage.verifyJobTitleResult());
    }


}
