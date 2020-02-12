package labexecise1222020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report= new ExtentReports("test6.html");
	     ExtentTest test=report.startTest("test6");
	     
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.htm");
	WebElement a=driver.findElement(By.id("t1"));
	a.sendKeys("amamasmamadadadada");
	String b=a.getAttribute("value");
	WebElement c=driver.findElement(By.id("t2"));
	c.sendKeys("amamasmamadadadada1");
	String d=c.getAttribute("value");
	driver.findElement(By.id("b1")).click();
	if(b.equalsIgnoreCase(d)){
		test.log(LogStatus.PASS, "same text");
	}
	
	else {
		test.log(LogStatus.FAIL, "different");
	}
	
	Thread.sleep(2000);
	
	report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
