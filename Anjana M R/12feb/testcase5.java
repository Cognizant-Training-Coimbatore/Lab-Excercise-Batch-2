package report;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("test_5.html");
		ExtentTest test=report.startTest("TC5");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement tr=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> column=tr.findElements(By.tagName("td"));
		System.out.println(column.size());
		int r=rows.size();
		int c=column.size();
		if(r==4&&c==4)
		{
			test.log(LogStatus.PASS, "pass");
		}
		else
		{
			test.log(LogStatus.FAIL, "fail");
		}
		WebElement button=driver.findElement(By.name("r1"));
		button.click();
		if(button.isSelected())
		{
			test.log(LogStatus.PASS, "pass");
		}
		else
		{
			test.log(LogStatus.FAIL, "fail");
		}
		report.endTest(test);
		report.flush();
	        driver.quit();
		
	}

}
