import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcases9 
{

	public static void main(String[] args) 
	{
		ExtentReports report = new ExtentReports("Report_testcase9.html");
		ExtentTest test = report.startTest("testcase9");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase9%20(1).htm");
		WebElement table= driver.findElement(By.xpath("/html/body/table/tbody"));
		
		List<WebElement> rowsList =  table.findElements(By.tagName("tr"));
		List<WebElement> columnsList =rowsList.get(4).findElements(By.tagName("td"));
		
	String cell = columnsList.get(4).getText();
	System.out.println(cell);
		if(cell.equalsIgnoreCase("Open"))
		{
			test.log(LogStatus.PASS,"Correct answer");
		}
		else
		{
			test.log(LogStatus.FAIL, "Incorrect answer");
		}

		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
