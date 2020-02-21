package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	WebDriver driver;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.linkedin.com/login");
	}

	@When("^I complete action need to move to the dashboard$")
	public void i_complete_action_need_to_move_to_the_dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys("kyuvarajcs@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("kyuvarajcs");
	    driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	}

	@Then("^I validate the outcomes need to logout$")
	public void i_validate_the_outcomes_need_to_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(5000);
	}
}
