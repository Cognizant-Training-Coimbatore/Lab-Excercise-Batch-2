package feb_12_pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgm_2 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports report=new ExtentReports("Report_pgm2.html");
		ExtentTest test=report.startTest("pgm_2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
		Select element=new Select(driver.findElement(By.id("country")));
		int total=element.getOptions().size();
		//System.out.println(total);
		String a=Integer.toString(total);
		driver.findElement(By.id("t1")).sendKeys(a);;
		if(total==11)
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
