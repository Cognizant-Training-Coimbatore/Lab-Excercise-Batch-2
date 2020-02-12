package extentreport;

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
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test= report.startTest("FB_TEST");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase1.html");
		WebElement text1 = driver.findElement(By.id("t1"));
		text1.sendKeys("sasna");
		String s1 =text1.getAttribute("value");
		int l = s1.length();
		System.out.println(l);
		Thread.sleep(5000);
		driver.findElement(By.id("b1")).click();
		String m = driver.findElement(By.id("t2")).getAttribute("value");
		int n = Integer.parseInt(m);
		System.out.println(n);
		if(l==n )
		{
			System.out.println("pass");
			test.log(LogStatus.PASS, "nonempty value");
		}
		else {
			System.out.println("fail");
			test.log(LogStatus.FAIL, "The values are  Empty");

	}
		Thread.sleep(5000);
		driver.quit();
	}

}
