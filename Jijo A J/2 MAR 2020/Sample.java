import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	static Logger Log=Logger.getLogger(Sample.class.getName());
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Log.info("Browser initialised");
	driver.get("http://demowebshop.tricentis.com/");
	if(driver.getTitle().equals("Demo Web shop"))
		Log.info("Title comparison sucessfull");
	driver.findElement(By.linkText("Register")).click();
	Log.info("Register link has been clicked");
	driver.findElement(By.id("FirstName")).sendKeys("venkat");
	Log.info("First name entered");
	driver.findElement(By.id("LastName")).sendKeys("venkat");
	Log.info("Last name entered");
	
	}
}
