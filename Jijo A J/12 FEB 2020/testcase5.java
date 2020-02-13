import java.util.List;
import java.util.concurrent.TimeUnit;

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
		ExtentReports report =new ExtentReports("Report5.html");
		ExtentTest test=report.startTest("testcase5");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("E:\\\\\\\\JIJO A J\\\\\\\\ECLIPSE\\\\\\\\D4\\\\\\\\src\\\\\\\\testcase5.html.htm");
		WebElement table =driver.findElement(By.xpath("/html/body/table/tbody"));
		WebElement table1 =driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		List<WebElement>coloumns=table1.findElements(By.tagName("td"));
		if(rows.size()==4)
			test.log(LogStatus.PASS, "row size is verified");
		else
			test.log(LogStatus.FAIL, "row size is not verified");
		if(coloumns.size()==4)
			test.log(LogStatus.PASS, "coloumns size is verified");
		else
			test.log(LogStatus.FAIL, "coloumns size is not verified");
		Thread.sleep(1000);
		report.endTest(test);
		report.flush();
		
		driver.quit();
			
		
		
	}

}
