import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AdvancedSearch {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	            
	    driver.get("https://www.shaadi.com/search?search_type=smart_search&loc=top-nav");
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.xpath("//*[@id=\"children-No\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"avchat-Yes\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"postedbyarray-Self\"]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div/div[2]/form/div[4]/a/span[1]")).click();
	    
	    Thread.sleep(5000);
	    driver.quit();

  }
  
  
}
