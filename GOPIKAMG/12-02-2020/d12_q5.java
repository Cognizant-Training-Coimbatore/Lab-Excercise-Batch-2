package repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class d12_q5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentReports report=new ExtentReports("Report_testcase5.html");
	    ExtentTest test=report.startTest("d12_q5");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.get("file:///C:/Users/admin/Downloads/testcase5.html");
	 	WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		   List<WebElement> rows=table.findElements(By.tagName("tr"));
		   System.out.println(rows.size());
		   WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]"));
		   List<WebElement> col=table1.findElements(By.tagName("td"));
		   System.out.println(col.size());
		  driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[1]")).click();
		   if(rows.size()==4 && col.size()==4)
		   {
			   test.log(LogStatus.PASS, "pass");
		   }
		   else
			   test.log(LogStatus.FAIL, "fail");
		   report.endTest(test);
			report.flush();
			Thread.sleep(5000);
		   driver.quit();

	}

}
