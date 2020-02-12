package reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("report5.html");
		ExtentTest test=report.startTest("feb12_5");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement>columns=table1.findElements(By.tagName("td"));
		System.out.println(columns.size());
		List<WebElement> abc=driver.findElements(By.name("r1"));
		abc.get(1).click();
		Thread.sleep(5000);
		if(abc.get(1).isSelected())
		{
			test.log(LogStatus.PASS,"Correct");
		}
		else
		{
			test.log(LogStatus.FAIL,"Incorrect");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
