package basic_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_testcase1.html");
		ExtentTest test=report.startTest("testcase1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase1.html");
		WebElement t1=driver.findElement(By.id("t1"));
		String a="Anandu";
		t1.sendKeys(a);
		driver.findElement(By.id("b1")).click();
		WebElement t2=driver.findElement(By.id("t2"));
		int l=a.length();
		String value=t2.getAttribute("value");
		int i=Integer.parseInt(value);
		if(i==l)
		{
			test.log(LogStatus.PASS,"Passed");

		}
		else
		{
			test.log(LogStatus.FAIL,"Failed");

		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
