import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test1 
{
	WebDriver driver;
	logger log = new logger();
  @Test
  public void f() throws InterruptedException 
  {
	  driver.findElement(By.name("q")).sendKeys("word");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.name("q")).submit();
		log.writelog("Suffering in google");
		driver.findElement(By.xpath("//*[@class =\"r\"]/a")).click();
		log.writelog("First link is clicked..");
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.google.co.in/");
	   log.writelog("The browser is initialized");
  }

  @AfterTest
  public void afterTest() 
  {
		
		driver.quit();
		log.writelog("The browser has been closed");
  }

}
