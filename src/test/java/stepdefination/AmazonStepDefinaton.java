package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinaton extends Base {

	@When("User open url {string}") 
	public void user_open_url(String string) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver_win32\\.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://mpsconline.gov.in/candidate/login");
	Thread.sleep(2000);
	}

	@When("User enter Email as {string}")
	public void user_enter_email_as(String string) {
	    
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String string) {
	    
	}

	@Then("user enter the captch shown in box")
	public void user_enter_the_captch_shown_in_box() {
	    
	}

	@Then("click on login")
	public void click_on_login() {
	    
	}
}
