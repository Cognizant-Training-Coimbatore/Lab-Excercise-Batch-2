package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testsSteps {
	WebDriver driver;
	@Given("^User is already registered$")
	public void user_is_already_registered() throws Throwable {
	    System.out.println("User is already registered");
			
	}

	@Given("^the user has username and password$")
	public void the_user_has_username_and_password() throws Throwable {

		System.out.println("the user has username and password");	
	
	}

	@When("^application is opened$")
	public void application_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		System.out.println("application is opened");	
		}
	

	@When("^active internet connection is available$")
	public void active_internet_connection_is_available() throws Throwable {
		System.out.println("active internet connection is available");	
	}

	@Then("^User can login$")
	public void user_can_login() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password=driver.findElement(By.id("Password"));
		email.sendKeys("sarath@mail.com");
		password.sendKeys("password");
		WebElement logIN=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		logIN.click();
		Thread.sleep(1000);
	
		}

	@Then("^check posts$")
	public void check_posts() throws Throwable {
		System.out.println("check posts");
	}

}
