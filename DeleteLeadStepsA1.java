package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;

public class DeleteLeadStepsA1 extends BaseClass {

	
	public String verification, firstLeadId;
	
	@Given("User click on the Lead button to Delete")
	public void user_click_on_the_lead_button_to_delete() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

	@Given("Click on the Find Lead button from shortcuts section to delete")
	public void click_on_the_find_lead_button_from_shortcuts_section_to_delete() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}

	@Given("User Enter the PhoneNumber as {string}")
	public void user_enter_the_phone_number_as(String phnum) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(phnum);
	}

	@When("Click on Find leads button in Findby Section to delete")
	public void click_on_find_leads_button_in_findby_section_to_delete() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Capture Lead ID to delete from the lead list")
	public void capture_lead_id_to_edit() {
		 firstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println("First Lead Id is : " + firstLeadId);
	}

	@When("Click on first Lead to delete")
	public void click_on_first_lead_to_delete() throws InterruptedException {
		Thread.sleep(3000);
	WebElement leadlist =	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	leadlist.click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		}

	@Then("Lead list should be displayed under Mylead")
	public void lead_list_should_be_displayed_under_mylead() {
System.out.println("Title of Current Page : "+ driver.getTitle());
	}

	@When("Click on Find lead button to check the deleted lead")
	public void click_on_find_lead_button_to_check_the_deleted_lead() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		}

	@When("Enter the captured Lead Id in findby section")
	public void enter_the_captured_lead_id_in_findby_section() {
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='id']")).sendKeys(firstLeadId);
		}

	@When("Click on Find leads button in Findby Section to check")
	public void click_on_find_leads_button_in_findby_section_to_check() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("No records details should be displayed in Lead List")
	public void no_records_details_should_be_displayed_in_lead_list() {
	// verification = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		System.out.println("Confirmation Message for Deletion : " + verification);

	}

}
