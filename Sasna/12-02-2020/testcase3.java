package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test= report.startTest("FB_TEST");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase3.html");
		WebElement text1 = driver.findElement(By.xpath("//*[@id=\"country1\"]"));
		WebElement text2 = driver.findElement(By.xpath("//*[@id=\"country1\"]"));
		text2.is
		text1.sendKeys("sasna");
		driver.findElement(By.id("b1")).click();
		if(( text1.length() != text2.length() )
		{
			test.log(LogStatus.PASS, "nonempty value");
		}
		else {
			test.log(LogStatus.FAIL, "The values are  Empty");

	}
		Thread.sleep(5000);
		driver.quit();
	}

}
