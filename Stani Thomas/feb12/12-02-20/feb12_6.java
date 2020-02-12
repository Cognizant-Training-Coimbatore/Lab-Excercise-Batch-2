package reports;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("report6.html");
		ExtentTest test=report.startTest("feb12_6");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
		WebElement abc=driver.findElement(By.id("t1"));
		String s="stani";
				abc.sendKeys(s);
		WebElement abc1=driver.findElement(By.id("t2"));
		String s1="stani";
		abc1.sendKeys(s1);
		driver.findElement(By.id("b1")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		if(abc.getAttribute("value").equals(abc1.getAttribute("value")))
		{
			test.log(LogStatus.PASS,"Both are same");
		}
		else
		{
			test.log(LogStatus.FAIL,"Both are not same");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
