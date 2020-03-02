package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps 
{
	 WebDriver driver;
	@Given("^the application has been opened$")
	public void the_application_has_been_opened() throws Throwable 
	{
	   System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.google.co.in/");
	   
	}

	@When("^the user wants to search for string \"([^\"]*)\"$")
	public void the_user_wants_to_search_for_string(String arg1) throws Throwable 
	{
		driver.findElement(By.name("q")).sendKeys("testing");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.name("q")).submit();
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"
			//	+ "")).sendKeys("Testing");
	//	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"
			//	+ "")).sendKeys(Keys.ENTER);
		
	}

	@Then("^the user selects the first link$")
	public void the_user_selects_the_first_link() throws Throwable 
	{
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3")).click();
		driver.findElement(By.xpath("//*[@class =\"r\"]/a")).click();
		driver.quit();
	}


}
