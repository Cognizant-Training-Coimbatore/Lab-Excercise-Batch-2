import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report4.html");
		ExtentTest test=report.startTest("testcase4");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		driver.get("E:\\\\\\\\JIJO A J\\\\\\\\ECLIPSE\\\\\\\\D4\\\\\\\\src\\\\\\\\testcase4.html.htm");
		driver.findElement(By.id("c1")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("messi");
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.id("c4")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("ronaldo");
		alert2.accept();
		String xx=driver.findElement(By.id("t1")).getText();
		String textbox=driver.findElement(By.id("t1")).getAttribute("value").toString();
		if(textbox.contains("messi")&&textbox.contains("ronaldo"))
			test.log(LogStatus.PASS, "hobbies are captured properly");
		else
			test.log(LogStatus.FAIL, "hobbies are not captured properly");
		Thread.sleep(1000);
		report.endTest(test);
		report.flush();
		
		driver.quit();
		
	}

}
