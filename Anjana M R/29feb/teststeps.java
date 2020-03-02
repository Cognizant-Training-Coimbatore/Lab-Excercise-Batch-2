package step_defnition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps {
	WebDriver driver;
	@Given("^The application has been opened$")
	public void the_application_has_been_opened() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("^the user wants to search for the string\"([^\"]*)\"$")
	public void the_user_wants_to_search_for_the_string(String arg1) throws Throwable {

WebElement search=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
   search.sendKeys(arg1);
   search.sendKeys(Keys.ENTER);
 Thread.sleep(2000);  
	   
	}

	@Then("^the user selects the first link$")
	public void the_user_selects_the_first_link() throws Throwable {
		 driver.findElement(By.xpath("//*[@class=\"r\"]/a")).click();
		   Thread.sleep(2000);
		 driver.quit();  

	}

}
