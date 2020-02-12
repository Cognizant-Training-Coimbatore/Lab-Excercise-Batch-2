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
		ExtentReports report=new ExtentReports("Report_CHARA.html");
		ExtentTest test=report.startTest("testcase1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html");
		driver.findElement(By.id("t1")).sendKeys("Jestin colin correya");
		driver.findElement(By.id("b1")).click();
		WebElement num=driver.findElement(By.id("t2"));
		String s=num.getAttribute("value");
		int a=Integer.parseInt(s);
		Thread.sleep(3000);
		if(a!=0)
		{
			test.log(LogStatus.PASS,"the values are not empty" );
				
				
		}
			else
				
			{
				test.log(LogStatus.FAIL, "the values are empty");
				}
		
		report.endTest(test);
		report.flush();
		driver.quit();

	}

}
