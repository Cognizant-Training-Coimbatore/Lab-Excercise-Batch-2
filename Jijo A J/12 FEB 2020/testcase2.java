import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report2.html");
		ExtentTest test=report.startTest("testcase2");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\\\JIJO A J\\\\ECLIPSE\\\\D4\\\\src\\\\testcase2.html.htm");
		Select country= new Select(driver.findElement(By.id("country")));
		String str=""+country.getOptions().size();
		driver.findElement(By.id("t1")).sendKeys(str);
		if(!str.isEmpty())
			test.log(LogStatus.PASS, "counted successfully");
	else
			test.log(LogStatus.FAIL, "counting failed");
	
		Thread.sleep(4000);
		report.endTest(test);
		report.flush();
		
		driver.quit();
		

	}

}
