package basic_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class fb_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_FB.html");
		ExtentTest test=report.startTest("fb_test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		WebElement uid=driver.findElement(By.id("email"));
		WebElement passw=driver.findElement(By.id("pass"));
		uid.sendKeys("+919895992986");
		passw.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")).click();
		if(uid!=null)
		{
			if(passw==null)
			{
				test.log(LogStatus.FAIL,"Failed");
			}
			else
			{
				test.log(LogStatus.PASS,"Passed");
			}
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
