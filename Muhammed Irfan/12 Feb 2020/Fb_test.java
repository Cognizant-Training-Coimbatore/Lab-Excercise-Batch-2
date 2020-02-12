package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Fb_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentReports report=new ExtentReports("Report_FB.html");
		ExtentTest test = report.startTest("Fb_test");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement uid = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		uid.sendKeys("irfanmuhammed599");
		pass.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]"));
		if(uid!=null)
		{
			if(pass!=null)
			{
				test.log(LogStatus.PASS,"the values are not empty");
			}
			else
			{
				test.log(LogStatus.FAIL,"the values are  empty");
			}
		}
		else
		{
			test.log(LogStatus.FAIL,"the values are  empty");
		}
		if(driver.getTitle().contentEquals("fb"))
		{
			test.log(LogStatus.PASS,"the title is same");
		}
		else
		{
			test.log(LogStatus.FAIL,"the title is not same");
		}
		
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
