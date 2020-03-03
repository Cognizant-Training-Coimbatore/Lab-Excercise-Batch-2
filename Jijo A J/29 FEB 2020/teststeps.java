package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps {
	WebDriver driver;
	@Given("^the application has been opened$")
	public void the_application_has_been_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
		
	}

	@When("^the user wants to search for the string \"([^\"]*)\"$")
	public void the_user_wants_to_search_for_the_string(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")).submit();
	}

	@Then("^the user selects the first link$")
	public void the_user_selects_the_first_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3")).click();
		
		
		Thread.sleep(5000);
	    driver.quit();
	}


}
