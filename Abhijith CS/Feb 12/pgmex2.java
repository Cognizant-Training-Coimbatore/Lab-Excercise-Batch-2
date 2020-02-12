import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgmex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("rep_ex2.html");
		ExtentTest test=report.startTest("pgmex2");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ABHIJITH%20C%20S/exercise/testcase2.html.html");
		Select op = new Select(driver.findElement(By.id("country")));
		int s = op.getOptions().size();
		driver.findElement(By.id("t1")).sendKeys(String.valueOf(s));
		Thread.sleep(2000);
		if(driver.getTitle().equals("pagetitle"))
		{
			test.log(LogStatus.PASS, "Title match");
		}
		else
		{
			test.log(LogStatus.FAIL, "Title doesnt match");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
