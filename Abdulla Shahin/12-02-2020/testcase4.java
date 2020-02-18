import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase4 {

	public static void main(String[] args) throws InterruptedException
	{
		ExtentReports report = new ExtentReports("Report_testcase4.html");
		ExtentTest test = report.startTest("testcase4");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase4.html");
		WebElement se=driver.findElement(By.id("c3"));
		se.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Football");
		alert.accept();
		//String s=alert.getText();
		WebElement be=driver.findElement(By.id("t1"));
		String b=be.getAttribute("value");
		System.out.println(b);
		if(b.contains("Football"))
		{
		    test.log(LogStatus.PASS," success");
		}

		   report.endTest(test);
		report.flush();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
