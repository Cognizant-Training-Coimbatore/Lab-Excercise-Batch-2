import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class test1 {
	WebDriver driver;
	 @BeforeTest
	 public void launchBrowser()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.irctc.co.in/nget/train-search");
	 }
 @Test(dataProvider = "dp")
 public void login(String fromstation, String tostation,String date,String classes) {
	  driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(fromstation);
	  driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(tostation);
	  driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input")).sendKeys(date);
	  Select cls=new Select(driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/label")));
	  cls.selectByVisibleText(classes);	
	  driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")).click();	  
 }

 @DataProvider
 public Object[][] dp() {
   return new Object[][] {
     new Object[] { "TRIVANDRUM CNTL", "COIMBATORE JN","19-02-2020","Sleeper"},
    // new Object[] { "user2", "pass2" },
    // new Object[] { "user3", "pass3" },
   };
 }
 @AfterTest
	 public void closeBrowser() throws InterruptedException
	 {
	     Thread.sleep(5000);
		 driver.quit();
	 }
}