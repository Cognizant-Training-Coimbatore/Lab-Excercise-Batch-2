package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample {
	WebDriver driver;
	
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.linkedin.com/login");
		
	
	}

	@When("^I complete action need to  move dash board$")
	public void i_complete_action_need_to_move_dash_board() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("Sudheer@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sudheer123");
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button"));
	 
	}

	@Then("^I validate the outcomes need to log out$")
	public void i_validate_the_outcomes_need_to_log_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	
	}


}
