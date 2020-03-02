
package Step_defnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps
{
	
WebDriver driver;
	@Given("^the user is already registered$")
	public void the_user_is_already_registered() throws Throwable {
	   
	  
	}

	@When("^the application is opened$")
	public void the_application_is_opened() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/s");
	}

	@Then("^the user can login$")
	public void the_user_can_login() throws Throwable {
		 driver.findElement(By.linkText("Log in")).click();
		   driver.findElement(By.name("Email")).sendKeys("anjana@gail.com");
		   driver.findElement(By.name("Password")).sendKeys("123");
		   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		   Thread.sleep(3000);    
		   driver.quit();
	
}
}
