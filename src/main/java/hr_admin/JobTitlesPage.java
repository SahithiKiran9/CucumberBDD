package hr_admin;


import org.openqa.selenium.By;

public class JobTitlesPage extends BasePage{
    public void adminTab() {
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    }

    public void jobTab() {
        driver.findElement(By.id("menu_admin_Job")).click();
    }

    public void jobTitleOption() {
        driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
    }

    public boolean verifyJobTitlePage() {
        return driver.findElement(By.id("btnAdd")).isDisplayed();
    }

    public void verifyAddButton() {
        driver.findElement(By.id("btnAdd")).click();
    }

    public boolean verifyAddJobTitlePage() {
        return driver.getCurrentUrl().contains("Add Job Title");
    }

    public void enterTitle(String title) {
        driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(title);
    }

    public void enterDescription(String description) {
        driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(description);
    }

    public void saveJobTitle() {
        driver.findElement(By.id("btnSave")).click();
    }

    public boolean verifyJobTitleResult() {
        return driver.findElement(By.id("jobTitleList")).isDisplayed();
    }

}
