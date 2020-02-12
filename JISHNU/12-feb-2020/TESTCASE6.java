package feb_12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TESTCASE6 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("testcase6.html");
		ExtentTest test=report.startTest("test6");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
		WebElement t1=driver.findElement(By.id("t1"));
		String a="Jishnu";
		String b="Jishnu";
		t1.sendKeys(a);
		WebElement t2=driver.findElement(By.id("t2"));
		t2.sendKeys(b);
		WebElement b1=driver.findElement(By.id("b1"));
		b1.click();
		Alert alert=driver.switchTo().alert();
		String s=alert.getText();
		alert.accept();
		System.out.println(s);
		if(a.equals(b))
		{
			if(s.equals("Same"))
			test.log(LogStatus.PASS, "pass");
			else
				test.log(LogStatus.FAIL, "fail");
				
		}
		else
		{
			if(s.equals("Not same"))
				test.log(LogStatus.PASS, "pass");
				else
					test.log(LogStatus.FAIL, "fail");
		}
		Thread.sleep(3000);
		report.endTest(test);
		report.flush();
		driver.quit();

	}

}
