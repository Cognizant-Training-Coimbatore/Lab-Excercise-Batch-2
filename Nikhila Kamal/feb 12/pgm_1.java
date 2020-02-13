package feb_12_pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgm_1 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports report=new ExtentReports("Report_pgm1.html");
		ExtentTest test=report.startTest("pgm_1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html");
		String a="nikhila";
		WebElement t1=driver.findElement(By.id("t1"));
		t1.sendKeys(a);
		int l=a.length();
		WebElement click=driver.findElement(By.id("b1"));
		click.click();
		WebElement t2=driver.findElement(By.id("t2"));
		String value=t2.getAttribute("value");
		int i=Integer.parseInt(value);
		if(i==l)
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
