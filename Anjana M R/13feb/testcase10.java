package report;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class testcase10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("test_10.html");
		ExtentTest test=report.startTest("TC10");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase10.html");
		WebElement button=driver.findElement(By.id("b1"));
		button.click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		String s=alert.getText();
		String sub=s.substring(13);
		alert.accept();
		WebElement box=driver.findElement(By.id("t1"));
		box.sendKeys(sub);
		driver.findElement(By.id("b2")).click();
	  WebElement res=driver.findElement(By.id("result"));
	  String t=res.getText();
	  System.out.println(t);
	  if(t.equals("Test result: Pass"))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
		Thread.sleep(5000);
		driver.quit();
		
	}

}
