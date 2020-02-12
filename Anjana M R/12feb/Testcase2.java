package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testcase2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("test_2.html");
		ExtentTest test=report.startTest("TC2");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
		Select country=new Select(driver.findElement(By.id("country")));
		int count=country.getOptions().size();
		WebElement val=driver.findElement(By.id("t1"));
		String s=Integer.toString(count);
				val.sendKeys(s);
		Thread.sleep(3000);
	if(Integer.toString(count).equals(s))
		{
			test.log(LogStatus.PASS, "pass");
		}
	report.endTest(test);
	report.flush();
        driver.quit();
	}

}
