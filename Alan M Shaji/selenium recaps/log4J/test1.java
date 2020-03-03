import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class test1 {
	WebDriver driver;
  looger obj=new looger();
	@Test
  public void f() throws InterruptedException {
		if(driver.getTitle().equals("Google"))
				obj.writelog("Google Title is verified");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Messi");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		obj.writelog("Searching <Messi> ");
		driver.findElement(By.xpath("//*[@class=\"r\"]/a")).click();
	    Thread.sleep(2000);
		obj.writelog("Clicked on first link");
	    

	}	
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
		driver.get("https://www.google.com/?hl=en-US");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
