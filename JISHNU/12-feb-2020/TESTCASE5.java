package feb_12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TESTCASE5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("testcase5.html");
		ExtentTest test=report.startTest("test5");
		ExtentTest test1=report.startTest("test5a");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html.htm");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		WebElement row=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> column=row.findElements(By.tagName("td"));
		int r=rows.size();
		int c=column.size();
		if(r==4&&c==4)
		{
			test.log(LogStatus.PASS, "pass");
		}
		else
		{
			test.log(LogStatus.FAIL, "Fail");
		}
		WebElement check= driver.findElement(By.name("r1"));
		check.click();
		if(check.isSelected())
		{
			test1.log(LogStatus.PASS, "pass");
		}
		else
		{
			test1.log(LogStatus.FAIL, "fail");
		}
		report.endTest(test);
		report.endTest(test1);
		report.flush();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
