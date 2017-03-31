package hr_admin;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddUserRoleStepDefs {
    UserRolesPage userRolePage = new UserRolesPage();

    @Given("^Admin is on the Dashboard page$")
    public void verifyDashPage(){
        Assert.assertTrue(userRolePage.verifyDashBoardPage());
    }

    @When("^Admin clicks on the User Management tab in Admin module$")
    public void userManagementTab() {
        userRolePage.userManagementTab();
    }

    @Then("^Admin clicks on User Roles option in drop down menu$")
    public void userRolesTab() {
        userRolePage.userRolesTab();
    }

    @And("^Admin should view the User Roles page with Add and Delete Buttons$")
    public void viewUserRolesPage() {
        Assert.assertTrue(userRolePage.verifyUserRolesPage());
    }

    @Given("^Admin is on the User Roles Page$")
    public void verifyUserRolesPage() {
        Assert.assertTrue(userRolePage.verifyUserRolesPage());
    }

    @When("^Admin clicks on Add button$")
    public void verifyAddButton() {
        userRolePage.addButton();
    }

    @Then("^Admin enters into Add User Role page$")
    public void verifyAddPage() {
        Assert.assertTrue(userRolePage.addUserRolePage());
    }

    @Then("^Admin selects option from drop down in Type field and types Name field and clicks on Save button$")
    public void enterUserRoleData() {
        Utilities.selectFromList(By.id("userrole_type"), "Admin");
        userRolePage.enterUserRoleName("test1");
        userRolePage.selectAdd();    }

    @Then("^Admin should the result in the User Roles list$")
    public void verifyUserRoleResult() {
        Assert.assertTrue(userRolePage.entryResult());
    }
}
