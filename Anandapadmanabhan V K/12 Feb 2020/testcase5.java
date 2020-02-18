package basic_command;

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
		ExtentReports report=new ExtentReports("Report_testcase5.html");
		ExtentTest test=report.startTest("testcase5");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase5.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement>row=table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement>col=table1.findElements(By.tagName("td"));
		System.out.println(col.size());
		List<WebElement>rad=driver.findElements(By.name("r1"));
		rad.get(1).click();
		if(row.size()==col.size())
		{
			test.log(LogStatus.PASS,"Passed");

		}
		else
		{
			test.log(LogStatus.FAIL,"Failed");

		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
