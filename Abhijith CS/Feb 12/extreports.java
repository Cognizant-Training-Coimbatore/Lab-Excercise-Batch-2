package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extreports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("rep_fb.html");
		ExtentTest test=report.startTest("fb_test");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement uid=driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		uid.sendKeys("abhijithcs0@gmail.com");
		pass.sendKeys("abhi");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")).click();
		if(uid!=null)
		{
			if(pass!=null)
			{
				test.log(LogStatus.PASS, "The values are not empty");
			}
			else
			{
				test.log(LogStatus.FAIL, "The value is empty");
			}
		}
		else
		{
			test.log(LogStatus.FAIL, "The value is empty");
		}
		if (driver.getTitle().equals("fb"))
		{
			test.log(LogStatus.PASS, "The title is same");
		}
		else
		{
			test.log(LogStatus.FAIL, "Title not same");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
