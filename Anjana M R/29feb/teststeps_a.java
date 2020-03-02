package step_defnition_a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps_a {
	WebDriver driver;
	@Given("^the application has been opened$")
	public void the_application_has_been_opened() throws Throwable {
	    System.setProperty("Webdriver.chrome.driver", "Chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
	}

	@When("^the user enters the \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_user_enters_the(String arg1, String arg2) throws Throwable {
	   WebElement uname=driver.findElement(By.id("Email"));
	   uname.sendKeys(arg1);
	   WebElement pwd=driver.findElement(By.id("Password"));
	   pwd.sendKeys(arg2);
	}

	@Then("^the user is able to login logout$")
	public void the_user_is_able_to_login_logout() throws Throwable {
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
Thread.sleep(3000);
driver.quit();
}
}