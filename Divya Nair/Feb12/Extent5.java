package repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent5 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.testcase5.html");
		ExtentTest test=report.startTest("Extent5");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testcase5.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		Thread.sleep(1000);
		System.out.println(rows.size());
		WebElement tablecol=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> col=tablecol.findElements(By.tagName("td"));
		Thread.sleep(1000);
		System.out.println(col.size());
		WebElement radio=driver.findElement(By.name("r1"));
		radio.click();
		Thread.sleep(2000);
		boolean res=radio.isEnabled();
		if(res==true)
		{
			test.log(LogStatus.PASS, "Radio is enabled");
		}
		else
			test.log(LogStatus.FAIL, "Radio is not enabled");
		
		report.endTest(test);
		report.flush();
		driver.quit();
		

	}

}
