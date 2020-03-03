package DemoWebshoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemowebshopLoginLogout {

	WebDriver driver;
	@Given("^the application has been opened$")
	public void the_application_has_been_opened() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
	}

	@When("^the user enters the \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_user_enters_the(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password=driver.findElement(By.id("Password"));
		email.sendKeys(arg1);
		password.sendKeys(arg2);
		}

	@Then("^the user is able to login logout$")
	public void the_user_is_able_to_login_logout() throws Throwable {
		WebElement logIN=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		logIN.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log out"));
		Thread.sleep(1000);
		driver.quit();
	}
}
