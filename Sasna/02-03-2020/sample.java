import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

		// TODO Auto-generated constructor stub
	     static Logger log  = Logger.getLogger(sample.class.getName());
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("Browser initialised");
		driver.get("http://demowebshop.tricentis.com");
		log.info("Application has been launched");
		String s = driver.getTitle();
		if(s.equals("Demo Web Shop"))
		{
			log.info("title comparison successful");
		}
		driver.findElement(By.linkText("Register")).click();
		log.info("Register link has been clicked...");
		driver.findElement(By.name("FirstName")).sendKeys("Venkat");
		log.info("Firstname has been entered");
		driver.quit();
		log.info("Browser has been closed");

	}

}




