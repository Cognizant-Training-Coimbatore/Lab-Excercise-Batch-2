package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExtentReports report=new ExtentReports("report2.html");
		ExtentTest test=report.startTest("feb12_2");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html.html");
		Select abc=new Select(driver.findElement(By.id("country")));
	int s=	abc.getOptions().size();
	driver.findElement(By.id("t1")).sendKeys(String.valueOf(s));
	Thread.sleep(5000);
	if(driver.getTitle().equals("fb"))
	{
		test.log(LogStatus.PASS,"The title is same");
	}
	else
	{
		test.log(LogStatus.FAIL, "The title is not same");
	}
	report.endTest(test);
	report.flush();
	driver.quit();
	}
}
