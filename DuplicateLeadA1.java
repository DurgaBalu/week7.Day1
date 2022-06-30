package steps;

import org.openqa.selenium.By;

import runner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadA1 extends BaseClass {

	String lastName, firstName, capturedLeadName;

	@Given("User click on the Lead button to find Duplicate")
	public void user_click_on_the_lead_button_to_find_duplicate() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

	@Given("Click on the Find Lead button under shortcuts section")
	public void click_on_the_find_lead_button_under_shortcuts_section() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}

	@Given("Click on Email ID Tab under the find Lead")
	public void Click_on_Email_ID_Tab_under_the_find_Lead() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}

	@Given("User Enter the EmailID as {string}")
	public void user_enter_the_email_id_as_email_id(String emailID) {
		driver.findElement(By.name("emailAddress")).sendKeys(emailID);
	}

	@When("Click on Find leads button under Findby Section")
	public void click_on_find_leads_button_under_findby_section() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Lead list should be displayed under MyleadList")
	public void lead_list_should_be_displayed_under_mylead_list() {
		System.out.println("Lead Lists are Displayed");
	}

	@Then("Capture Lead First Name")
	public void capture_lead_first_name() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		firstName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a"))
				.getText();
	}

	@Then("Capture Lead Last Name")
	public void capture_lead_last_name() {
		lastName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-lastName']//a")).getText();
		capturedLeadName = firstName + lastName;
	}

	@When("Click on first Lead Name from Leadlist")
	public void click_on_first_lead_Name_from_leadlist() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}

	@Then("View Lead Page should be dispalyed")
	public void view_lead_page_should_be_dispalyed() {
		System.out.println(driver.getTitle());
	}

	@When("Click on Duplciate lead button")
	public void click_on_duplciate_lead_button() {
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	}

	@Then("Duplciate Lead Page Should be displayed")
	public void duplciate_lead_page_should_be_displayed() {
		System.out.println("The Title of the Page : " + driver.getTitle());
	}

	@When("Click on Create leads button under duplicate lead page")
	public void click_on_create_leads_button_under_duplicate_lead_page() {
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}

	@Then("View Lead Page should be displayed")
	public void view_lead_page_should_be_displayed() {
	System.out.println(driver.getTitle());}

	@Then("Verify the Captured Lead Names are duplciates")
	public void verify_the_captured_lead_names_are_duplciates() {
		// Capture Duplicate Lead Name
				String firstNameOfDuplicateLead = driver.findElement(By.id("viewLead_firstName_sp")).getText();
						//driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
				String lastNameOfDuplicateLead = driver.findElement(By.id("viewLead_lastName_sp")).getText();
						//driver.findElement(By.id("createLeadForm_lastName")).getAttribute("value");
				String duplicateLeadName = firstNameOfDuplicateLead + lastNameOfDuplicateLead;
				System.out.println("Duplicate Lead Name : " + duplicateLeadName);

				// Verification of Duplicate Lead details
				if (capturedLeadName.equalsIgnoreCase(duplicateLeadName))

					System.out.println("Confirmation Result : The Duplicated Lead Name is same as Captured Name");

				else
					System.out.println("Confirmation Result : The Duplicated Lead Name is not same as Captured Name");
			
	}

}
