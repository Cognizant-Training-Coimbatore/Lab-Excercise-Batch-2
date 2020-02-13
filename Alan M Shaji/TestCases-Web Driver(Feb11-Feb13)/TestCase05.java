package Testcases_11_Feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report5.html");
		ExtentTest test=report.startTest("Extended_reports");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/TestCases_11Feb/testcase5.html.htm");
		
		WebElement table= driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Row Size\t:\t"+rows.size());
		
		WebElement table1= driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> columns=table1.findElements(By.tagName("td"));
		System.out.println("Column Size\t:\t"+columns.size());
		driver.findElement(By.name("r1")).click();
		if(rows.size()==4)		
		{
			System.out.println("Row size is verified");
			test.log(LogStatus.PASS, "Row size is verified");
		}
		else
			test.log(LogStatus.FAIL, "Row size is not verified");
		if(columns.size()==4)		
		{
			System.out.println("column size is verified");
			test.log(LogStatus.PASS, "column size is verified");
		}
		else
			test.log(LogStatus.FAIL, "column size is not verified");
	
		
		report.endTest(test);
		report.flush();
		driver.quit();

	}

}
