package automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

  



public class Registration {
	WebDriver driver = null;
	
	@Given("^open firefox browser$")
	public void open_firefox_browser() {
	    driver = new FirefoxDriver();
	}

	@When("^i open the url$")
	public void i_open_the_url() {
	    
		HomePage homePage = new HomePage(driver);
		homePage.openUrl();
	}

	@Then("^website loaded$")
	public void website_loaded() {
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Mercury Tours']")).isDisplayed());
	   
	}
	@When("^click on register link$")
	public void click_on_register_link() {
	 driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	}

	@Then("^page should  display with register header$")
	public void page_should_display_with_register_header() {
	Assert.assertTrue(driver.findElement(By.xpath("//tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")).isDisplayed());
	    
	}

	
	

	@When("^click on Submit$")
	public void click_on_Submit() {
	    driver.findElement(By.name("register")).click();
	    
	    
	}

	@Then("^Thank you for registering message is  displayed$")
	public void Thank_you_for_registering_message_is_displayed() {
		String expMessage = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td/p[2]/font")).getText());
		
		//Assert.assertTrue(driver.findElement(By.xpath("//table/tbody/tr[3]/td/p[2]/font")).isDisplayed());
		
		Assert.assertEquals(expMessage, driver.findElement(By.xpath("//table/tbody/tr[3]/td/p[2]/font")).getText());
	  
		driver.close();
	}


}
