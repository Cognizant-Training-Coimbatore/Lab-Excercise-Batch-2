package feb_12_pgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgm_6 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports report=new ExtentReports("Report_pgm6.html");
		ExtentTest test=report.startTest("pgm_6");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
		WebElement text=driver.findElement(By.id("t1"));
		text.sendKeys("nikhila");
		WebElement text1=driver.findElement(By.id("t2"));
		text1.sendKeys("nikhila");
		WebElement click=driver.findElement(By.id("b1"));
		click.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		if(text.getAttribute("value").equals(text1.getAttribute("value")))
				{
			test.log(LogStatus.PASS,"passed");
				}
		else
		{
			test.log(LogStatus.FAIL,"failed");
		}
		report.endTest(test);
		report.flush();
		Thread.sleep(5000);
		driver.quit();
	}

}
