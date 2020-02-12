package feb12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("testcase_1.html");
		ExtentTest test = report.startTest("Test1");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase1.html.htm");
		WebElement s = driver.findElement(By.id("t1"));
		s.sendKeys("abcde");
		String s1 = s.getAttribute("value");
		int l = s1.length();
		System.out.println(l);
		Thread.sleep(3000);
		driver.findElement(By.id("b1")).click();
		String m = driver.findElement(By.id("t2")).getAttribute("value");
		int n = Integer.parseInt(m);
		System.out.println(n);
		if(l==n)
		{
			System.out.println("pass");
			test.log(LogStatus.PASS, "pass");
		}
		else
		{
			System.out.println("fail");
			test.log(LogStatus.FAIL, "fail");
		}
		report.endTest(test);
		report.flush();
		
		driver.quit();
		
	}

}
