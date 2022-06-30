package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;

public class MergeContactsA1 extends BaseClass {

	String parentWindow;

	@Given("User click on the Contact button")
	public void user_click_on_the_contact_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

	@Given("Click on Merge Contact button from shortcuts section")
	public void click_on_merge_contact_button_from_shortcuts_section() {
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	}

	@Then("Merge Contact page should be displayed")
	public void merge_contact_page_should_be_displayed() {
		System.out.println("Title of the Page : " + driver.getTitle());
	}

	@When("Click on Widget of From Contact")
	public void click_on_widget_of_from_contact() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Thread.sleep(3000);
	}

	@Then("New Window should be displayed for From Contact")
	public void new_window_should_be_displayed_for_from_contact() {
		// Get Parent Window
		parentWindow = driver.getWindowHandle();
		// Get the number of Child Windows
		Set<String> windowHandles1 = driver.getWindowHandles();
		// Convert set to list
		List<String> windows1 = new ArrayList<String>(windowHandles1);
		// Switch To Child Windows
		System.out.println("Title of the Page : " + driver.switchTo().window(windows1.get(1)).getTitle());
	}

	@When("Click on First contact from Contact List")
	public void click_on_first_contact_from_contact_list() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}

	@Then("Verify The Merge Contact Page for from Contact List")
	public void verify_the_merge_contact_page_for_from_contact_list() {
		System.out.println("Title of the Page : " + driver.switchTo().window(parentWindow).getTitle());
	}

	@When("Click on Widget of To Contact")
	public void click_on_widget_of_to_contact() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}

	@Then("New Window should be displayed for To Contact")
	public void new_window_should_be_displayed_for_to_contact() throws InterruptedException {
		Set<String> windowHandles2 = driver.getWindowHandles();
		// Convert set to list
		List<String> windows2 = new ArrayList<String>(windowHandles2);
		// SwitchTo Child Window
		System.out.println("Title of the Page : " + driver.switchTo().window(windows2.get(1)).getTitle());
		Thread.sleep(2000);
	}

	@When("Click on Second contact from Contact List")
	public void click_on_second_contact_from_contact_list() {
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]//a")).click();
	}

	@Then("Verify The Merge Contact Page for To Contact List")
	public void verify_the_merge_contact_page_for_to_contact_list() {
		System.out.println("Title of the Page : " + driver.switchTo().window(parentWindow).getTitle());
		
	}

	@When("Click on Merge button under the Merge Contacts")
	public void click_on_merge_button_under_the_merge_contacts() {
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	}

	@When("Click on yes from Popup")
	public void click_on_yes_from_popup() {
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Confirmation: " + alert.getText());
		alert.accept();
	}

	@When("Click on Merge button")
	public void click_on_merge_button() {
		String currentTitle = driver.getTitle();
		System.out.println("The title of the Page : " + currentTitle);
	}

}
