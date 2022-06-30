package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import runner.BaseClass;

public class CreateLeadStepsA1 extends BaseClass{



	@Given("User Click the Lead Tab button")
	public void user_click_the_lead_tab_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

	@Given("User Click on Create Lead button")
	public void user_click_on_create_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("User Enter the Company Name {string}")
	public void user_enter_the(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

	@Given("User Enter the First Name {string}")
	public void user_enter_the_first_name(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Given("User Enter the Last Name {string}")
	public void user_enter_the_last_name(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@Given("User Enter the First Name Local {string}")
	public void user_enter_the_first_name_local(String fNameLocal) {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNameLocal);
	}

	@Given("User Enter the Depatment Name {string}")
	public void user_enter_the_depatment_name(String departmentName) {
		driver.findElement(By.name("departmentName")).sendKeys(departmentName);
	}

	@Given("User Enter the Description {string}")
	public void user_enter_the_description(String description) {
		driver.findElement(By.name("description")).sendKeys(description);
	}

	@Given("User Enter the Primary Email {string}")
	public void user_enter_the_primary_email_jichang_gmail_com(String primaryEmail) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(primaryEmail);
	}

	@Given("User Enter the Phone Number {string}")
	public void user_enter_the_phone_number(String phnum) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);

	}

	@Given("User Enter the State {string}")
	public void user_enter_the_state_state(String state) {
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown = new Select(elementState);
		stateDropdown.selectByVisibleText(state);
	}

	@When("User Click on Creat Lead button")
	public void user_click_on_creat_lead_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("The Created Lead Details should be displayed")
	public void the_created_lead_details_should_be_displayed() {
		System.out.println("The Created Lead Details are displayed successfully");
	}

}
