package feb_12_pgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgm_4 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports report=new ExtentReports("Report_pgm4.html");
		ExtentTest test=report.startTest("pgm_4");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html");
		WebElement reading=driver.findElement(By.id("c1"));
		reading.click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("harrypoter");
		alert.accept();
		

		WebElement be=driver.findElement(By.id("t1"));
		   String b=be.getAttribute("value");
		   System.out.println(b);
		   if(b.contains("harrypoter"))
		   {
		    test.log(LogStatus.PASS," success");
		   }
		
		else
		{
			test.log(LogStatus.FAIL,"failed");
		}
		report.endTest(test);
		report.flush();
		Thread.sleep(5000);
		//driver.quit();

	}

}
