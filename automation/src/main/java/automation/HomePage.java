package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class HomePage {
	
	WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}

	public void openUrl() {
		driver.get("http://newtours.demoaut.com/");
		
	}

	public void checkPageLoaded() {
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Mercury Tours']")).isDisplayed());
		
	}

	public void clickRightHandHomeMenuLink() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
	}

}
