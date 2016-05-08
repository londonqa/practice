package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;

public class BaseClass {

WebDriver driver = null;
	
	@Given("^open firefox browser$")
	public void open_firefox_browser() {
	    driver = new FirefoxDriver();
	}
}
