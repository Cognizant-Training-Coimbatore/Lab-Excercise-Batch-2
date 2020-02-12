import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcases5 {

	public static void main(String[] args) {
		ExtentReports report = new ExtentReports("Report_testcases5.html");
		ExtentTest test = report.startTest("testcase5");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html.htm");
		
		
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		WebElement table1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> columns = table.findElements(By.tagName("tr"));
		
		List<WebElement> radio= driver.findElements(By.name("r1"));
		radio.get(0).isSelected();
			if(rows.size()==columns.size())
			{
				test.log(LogStatus.PASS, "same number of rows and columns");
			}
			else
			{
				test.log(LogStatus.FAIL,"different number of rows and columns");
				
			}

			report.endTest(test);
			report.flush();
			driver.quit();
	}

}
