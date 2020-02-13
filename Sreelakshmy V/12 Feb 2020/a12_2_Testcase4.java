package extentreport1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class a12_2_Testcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Results4.html");
		ExtentTest test=report.startTest("a12_2_Testcase4");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase4.html");
driver.findElement(By.id("c1")).click();
Alert al=driver.switchTo().alert();
al.sendKeys("novels");
al.accept();
driver.findElement(By.id("c2")).click();
Alert al1=driver.switchTo().alert();
al1.sendKeys("Sports");
al1.accept();
driver.findElement(By.id("c3")).click();
Alert al3=driver.switchTo().alert();
al3.sendKeys("cricket");
al3.accept();
driver.findElement(By.id("c4")).click();
Alert al4=driver.switchTo().alert();
al4.sendKeys("Painting");
al4.accept();
WebElement t2=driver.findElement(By.id("t1"));
if(t2!=null)
{

	test.log(LogStatus.PASS, "successful");
}
else
{
test.log(LogStatus.FAIL, "Not successful");
}
report.endTest(test);
report.flush();

}

	}


