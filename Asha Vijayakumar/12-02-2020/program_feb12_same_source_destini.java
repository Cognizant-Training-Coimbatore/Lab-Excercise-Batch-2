import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class program_feb12_same_source_destini {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("Report_program_feb12_same_source_destini");
		ExtentTest test=report.startTest("program_feb12_same_source_destini");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Admin/Downloads/testcase3.html.html");
		
		Select country1=new Select(driver.findElement(By.xpath("/html/body/select[1]")));
		country1.selectByVisibleText("India");
	
		Select country2=new Select(driver.findElement(By.xpath("/html/body/select[2]")));
		country2.selectByVisibleText("India");
		
		String c1=country1.getFirstSelectedOption().getText();

		String c2=country2.getFirstSelectedOption().getText();
		
		
		
		if(c1.equalsIgnoreCase(c2))
		{
			test.log(LogStatus.FAIL,"source and destination cannot be same");
			}
		
		else
		{
			test.log(LogStatus.PASS, "credentials are correct");
		}
		
		
		report.endTest(test);
		report.flush();
	
		
		Thread.sleep(5000);
		
		driver.quit();	
		
		
		
		
		
	
	
	
		
		
		
	}

}
