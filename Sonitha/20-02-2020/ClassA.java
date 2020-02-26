package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassA {
	WebDriver driver;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.linkedin.com/login");
	}

	@When("^I complete action need to move the dashboard$")
	public void i_complete_action_need_to_move_the_dashboard() throws Throwable {
	  driver.findElement(By.id("username")).sendKeys("kyuvarajcs@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("kyuvarajcs");
	  driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]"));
	}

	@Then("^I validate the outcomes after that need to logout$")
	public void i_validate_the_outcomes_after_that_need_to_logout() throws Throwable {
	Thread.sleep(5000);
	}


}
