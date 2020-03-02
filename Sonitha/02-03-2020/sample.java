import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample 
{
	static Logger log = Logger.getLogger(sample.class.getName());
	public static void main(String[] args) throws IOException,SQLException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		log.info("browser initialized");
		driver.get("http://demowebshop.tricentis.com");
		log.info("application has been launched");
		String s = driver.getTitle();
		
		if(s.equals("Demo Web Shop"))
		{
			log.info("title comparision successfull");
		}
		
		driver.findElement(By.linkText("Register")).click();
		log.info("Register link has been clicked...");
		driver.findElement(By.name("FirstName")).sendKeys("Sonitha");
		log.info("FirstName has been entered.");
		driver.quit();
		log.info("Browser has been closed.");
	}

}
