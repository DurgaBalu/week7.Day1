package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;

public class EditLeadStepsA1 extends BaseClass {
	
	public WebElement  eleCompanyName;
	public String eleUpdatedCompanyName;
	public String companyname;
	@Given ("User click on the Lead button to Edit")
	public void clickOnlead() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	@Given("Click on the Find Lead button from shortcuts section")
	public void findLeadBtton() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
	}
	@Given("User Enter the Firstname as {string}")
	public void firstNameToFind(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		
	}
	@When ("Click on Find leads button in Findby Section")
	public void clickOnfindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then ("Leads List Details should be displayed as per Firstname")
	public void verifyFirstName() throws InterruptedException {
		Thread.sleep(3000);
		   System.out.println("Lead List is displayed to edit ");
		System.out.println(driver.getTitle());
}
//	@When("Click on Findby button to edit")
//	public void click_on_findby_button_to_edit() throws InterruptedException {
//		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		Thread.sleep(3000);
//	}
//	@Then("Lead List should be displayed to edit")
//	public void lead_list_should_be_displayed_to_edit() {
//	    System.out.println("Lead List is displayed to edit ");
//	}
	@When("Click on first Lead to edit")
	public void click_on_first_lead_to_edit() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}
	@Then("View Lead should be display to edit")
	public void view_lead_should_be_display_to_edit() {
		   System.out.println("Lead List is displayed to edit ");
		System.out.println(driver.getTitle());
		
	}
	@Then("get the current company Name before edit")
	public void get_the_current_company_name_before_edit() {
		companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyname);
	}
	@When("click on edit button")
	public void click_on_edit_button() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

	}
	@When("Click on Clear the previous company name")
	public void click_on_clear_the_previous_company_name() {
		 eleCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		eleCompanyName.clear();
	}
	@When("Enter the New Company Name {string}")
	public void enter_the_new_company_name_company_name(String cName) {
		eleCompanyName.sendKeys(cName);
	}
	@When("Click on update button")
	public void click_on_update_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		Thread.sleep(3000);
		 eleUpdatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated Company Name : " + eleUpdatedCompanyName);
		
	}
	@Then("New Company name should be updated")
	public void new_company_name_should_be_updated() {
		System.out.println("The below changes are");
		System.out.println("Old Company Name - " + eleUpdatedCompanyName);
		System.out.println("New Company Name - " + companyname);
	if(companyname.equalsIgnoreCase(eleUpdatedCompanyName))
	{
	System.out.println("The Confirmation Message : The Company name is not Changed");
	}
	else
	System.out.println("The Confirmation Message : The Company name is Changed");
	
	}


}