import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class search {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	            
	    driver.get("https://www.shaadi.com/search");
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.xpath("//*[@id=\"children-No\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"basic\"]/div[4]/a/span[1]")).click();
	    
	    Thread.sleep(5000);
	    driver.quit();
  }

  
}
