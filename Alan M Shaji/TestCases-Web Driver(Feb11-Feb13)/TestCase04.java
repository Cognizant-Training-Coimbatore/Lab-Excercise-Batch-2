package Testcases_11_Feb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report4.html");
		ExtentTest test=report.startTest("Extended_reports");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/TestCases_11Feb/testcase4.html.htm");
		WebElement c1=driver.findElement(By.id("c1"));
		WebElement c2=driver.findElement(By.id("c2"));
		WebElement c3=driver.findElement(By.id("c3"));
		WebElement c4=driver.findElement(By.id("c4"));
		
		c1.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(" Harry Potter\t");
		alert.accept();

		c2.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys(" Marina\t");
		alert2.accept();

		c3.click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys(" Cricket\t");
		alert3.accept();

		c4.click();
		Alert alert4=driver.switchTo().alert();
		alert4.sendKeys(" Dance");
		alert4.accept();
	String txtarea=driver.findElement(By.id("t1")).getAttribute("value").toString();
	System.out.println(txtarea);
		if(txtarea.contains("Harry Potter")&&txtarea.contains("Dance")&&txtarea.contains("Marina")&&txtarea.contains("Cricket"))		
		{
			System.out.println("TextArea is verified");
			test.log(LogStatus.PASS, "TextArea is verified");
		}
		else
			test.log(LogStatus.FAIL, "TextArea is not verified");

		
		Thread.sleep(4000);
		report.endTest(test);
		report.flush();

		
		
		driver.quit();
	
	}

}
