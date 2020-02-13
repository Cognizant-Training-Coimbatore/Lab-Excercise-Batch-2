package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_Q2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("hell.html");
		ExtentTest test = report.startTest("feb12_Q2");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase2.html.htm");
		
		Select combo1 = new Select(driver.findElement(By.id("country")));
		
		int total= combo1.getOptions().size();
		System.out.println(total);
		
		WebElement sun = driver.findElement(By.id("t1"));
		sun.sendKeys("11");
		if(sun.getAttribute("value").equals("11"))
		{
			test.log(LogStatus.PASS, "Ensured that both values are same");
			System.out.println("PASS");
		}
		else
		{
			test.log(LogStatus.FAIL, "The values afre not same");
			System.out.println("FAIL");
		}
		report.endTest(test);
		report.flush();
		Thread.sleep(2000);
		driver.quit();

	}

}
