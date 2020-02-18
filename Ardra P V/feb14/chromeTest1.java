import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromeTest1 
{
	
	WebDriver driver;
	WebElement register,username,login,password,fname,lname;

	@Test
	public void test1()
	{
		System.out.println("Test me!");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		  driver=new FirefoxDriver();
	      driver.get("http://demowebshop.tricentis.com");
		register=driver.findElement(By.linkText("Register"));
		  register.click();
		  fname=driver.findElement(By.name("FirstName"));
		  fname.sendKeys("some bla");
		  lname=driver.findElement(By.name("LastName"));
		  lname.sendKeys("someblaa");
		
	}
}
