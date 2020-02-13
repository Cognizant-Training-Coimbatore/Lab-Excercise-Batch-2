package exercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_Q9 
{

	public static void main(String[] args) throws InterruptedException 
	{
			
		ExtentReports report = new ExtentReports("ExtentReport.html");
		ExtentTest test = report.startTest("feb12_Q9");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Downloads/testcase9.html");

		WebElement rr;
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		int loc=0;
		int rowno = rows.size();
		List<WebElement> cols = driver.findElements(By.tagName("td"));
		for(int j=0;j<cols.size();j++)
		{

			if(cols.get(j).getText().equals("Thursday"))
				loc = j;
		}
		System.out.println(loc);
		for(int i=0;i<rowno;i++)
		{
			if(rows.get(i).findElement(By.tagName("td")).getText().equals("11.00 - 13.00") )
			{
				List<WebElement> colums = rows.get(i).findElements(By.tagName("td"));
				System.out.println(colums.get(loc).getText());
			}
		}

		report.endTest(test);
		report.flush();
		
		Thread.sleep(2000);
		driver.quit();



	}

}
