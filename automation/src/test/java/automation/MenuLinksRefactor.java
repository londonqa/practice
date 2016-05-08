package automation;

import org.openqa.selenium.By;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

public class MenuLinksRefactor extends BaseClass {


	HomePage homePage = null;
	
	@When("^i open the url$")
	public void i_open_the_url() {
		HomePage homePage = new HomePage(driver);
		homePage.openUrl();		
	}

	@Then("^website loaded$")
	public void website_loaded() {
		homePage.checkPageLoaded();		
	}

	@When("^i click right hand home links$")
	public void i_click_right_hand_home_links() {
		homePage.clickRightHandHomeMenuLink();
		
	}

	@Then("^corresponding page loaded$")
	public void corresponding_page_loaded() {
		Assert.assertTrue(driver.getCurrentUrl().contains("mercurywelcome.php"));
		driver.close();	    
	}
	
	@When("^i click right hand sign in link$")
	public void i_click_right_hand_sign_in_link() {
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();	    
	}

	@Then("^corresponding  sign in page loaded$")
	public void corresponding_sign_in_page_loaded() {
		Assert.assertTrue(driver.getCurrentUrl().contains("mercurysignon.php"));
	}

	@When("^i click right hand register link$")
	public void i_click_right_hand_register_link() {
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();	    
	}

	@Then("^corresponding  register page loaded$")
	public void corresponding_register_page_loaded() {
		Assert.assertTrue(driver.getCurrentUrl().contains("mercuryregister.php"));
	}

	@When("^i click right hand support link$")
	public void i_click_right_hand_support_link() {
		driver.findElement(By.xpath("//a[text()='SUPPORT']")).click();	    
	}

	@Then("^corresponding  support page loaded$")
	public void corresponding_support_page_loaded() {
		Assert.assertTrue(driver.getCurrentUrl().contains("mercuryunderconst.php"));
	}

	@When("^i click right hand contact link$")
	public void i_click_right_hand_contact_link() {
		driver.findElement(By.xpath("//a[text()='CONTACT']")).click();	
	}

	@Then("^corresponding  contact page loaded$")
	public void corresponding_contact_page_loaded() {
		Assert.assertTrue(driver.getCurrentUrl().contains("mercuryunderconst.php"));
		driver.close();
	}
	@When("^click left hand home link$")
	public void click_left_hand_home_link() {
	    driver.findElement(By.xpath("//a[text()='Home']")).click();
	    
	}

	@Then("^corresponding home page should be loaded$")
	public void corresponding_home_page_should_be_loaded() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("mercurywelcome.php"));
	   
	}

	@When("^click left hand flights link$")
	public void click_left_hand_flights_link() {
	    
	    driver.findElement(By.xpath("//a[text()='Flights']")).click();
	}

	@Then("^corresponding flights page should be loaded$")
	public void corresponding_flights_page_should_be_loaded() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
	}

	@When("^click left hand hotels link$")
	public void click_left_hand_hotels_link() {
	    driver.findElement(By.xpath("//a[text()='Hotels']")).click();
	}

	@Then("^correspondoing hotels page should be loaded$")
	public void correspondoing_hotels_page_should_be_loaded() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("mercuryunderconst.php"));
	}

	@When("^click left hand car rentals link$")
	public void click_left_hand_car_rentals_link() {
	   
		driver.findElement(By.xpath("//a[text()='Car Rentals']")).click();
	   
	}

	@Then("^corresponding car rentals page should be loaded$")
	public void corresponding_car_rentals_page_should_be_loaded() {
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("mercuryunderconst.php"));
	}

	@When("^click left hand cruises link$")
	public void click_left_hand_cruises_link() {
	    
		driver.findElement(By.xpath("//a[text()='Cruises']")).click();
	}

	@Then("^corresponding cruises page should be loaded$")
	public void corresponding_cruises_page_should_be_loaded() {
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("mercurycruise.php"));
	}

	@When("^click left hand destinations link$")
	public void click_left_hand_destinations_link() {
	    
	 driver.findElement(By.xpath("//a[text()='Destinations']")).click();
	}

	@Then("^corresponding destinations page should be loaded$")
	public void corresponding_destinations_page_should_be_loaded() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("mercuryunderconst.php"));
	}

	@When("^click left hand vacations link$")
	public void click_left_hand_vacations_link() {
	    driver.findElement(By.xpath("//a[text()='Vacations']")).click();
	}

	@Then("^corresponding vacations page should be loaded$")
	public void corresponding_vacations_page_should_be_loaded() {
	 Assert.assertTrue(driver.getCurrentUrl().contains("mercuryunderconst.php"));
	 driver.close();
	}
    

}
