package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_Q1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("auto.html");
		ExtentTest test = report.startTest("feb12_Q1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase1.html.htm");
		String str = "helloworld";
		WebElement uid=driver.findElement(By.id("t1"));
		uid.sendKeys(str);
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.id("b1"));
		pass.click();
		WebElement sun = driver.findElement(By.xpath("//*[@id=\"t2\"]"));
		
		if (Integer.parseInt(sun.getAttribute("value"))==(str.length()))
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
		Thread.sleep(3000);
		driver.close();

	}

}
