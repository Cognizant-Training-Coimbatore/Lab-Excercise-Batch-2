import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report3.html");
		ExtentTest test=report.startTest("testcase3");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\\\\\\\JIJO A J\\\\\\\\ECLIPSE\\\\\\\\D4\\\\\\\\src\\\\\\\\testcase3.html.htm");
		Select country1= new Select(driver.findElement(By.id("country1")));
		country1.selectByIndex(0);
		String str= country1.getFirstSelectedOption().getText();
		Select country2= new Select(driver.findElement(By.id("country2")));
		Thread.sleep(4000);
		
		country2.selectByVisibleText(str);
		String str2=country2.getFirstSelectedOption().getText();
		if(str.equals(str2))
			test.log(LogStatus.FAIL, "Source and destination should not be the same");
		else
			test.log(LogStatus.PASS, "Source and destination is different");
		
		Thread.sleep(4000);
		report.endTest(test);
		report.flush();
		
		driver.quit();	

	}

}
