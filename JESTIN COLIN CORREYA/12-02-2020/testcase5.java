import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ExtentReports report=new ExtentReports("Report_rows.html");
ExtentTest test=report.startTest("testcase5");
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Admin/Downloads/testcase5.html");
WebElement table=driver.findElement(By.xpath("/html/body/table"));
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println(rows.size());
WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
List<WebElement>column=table1.findElements(By.tagName("td"));
System.out.println(column.size());
driver.findElement(By.name("r1")).click();
if((rows.size())==4&&(column.size()==4))
{
	test.log(LogStatus.PASS,"the values are correct" );
}
else
{
	test.log(LogStatus.FAIL, "they are wrong");
}
report.endTest(test);
report.flush();
Thread.sleep(4000);
driver.quit();



	}

}
