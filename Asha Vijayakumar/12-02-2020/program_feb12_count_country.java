import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class program_feb12_count_country {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExtentReports report = new ExtentReports("Report_program_feb12_count_country.html");
		ExtentTest test=report.startTest("program_feb12_count_country");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html.html\r\n" + 
				"");
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		int count=country.getOptions().size();
		String strl=Integer.toString(count);
		WebElement id=driver.findElement(By.id("t1"));
		id.sendKeys(strl);
		
				
		if(id!=null)
		{
			test.log(LogStatus.PASS,"The cobo box size is displayed");
			
		}
		else
		{
			test.log(LogStatus.FAIL,"The cobo box size is not displayed");
			
		}
		
		report.endTest(test);
		report.flush();
	
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
