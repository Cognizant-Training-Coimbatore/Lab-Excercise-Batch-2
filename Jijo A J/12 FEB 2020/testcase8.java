
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase8{

	public static void main(String[] args) throws InterruptedException {
		
		ExtentReports report = new ExtentReports("Report8.html");
		ExtentTest test = report.startTest("testcase8");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("E:\\\\JIJO A J\\\\ECLIPSE\\\\D4\\\\src\\\\testcase8.html");
		
		WebElement dropdown = driver.findElement(By.tagName("button"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).build().perform();
		
		driver.findElement(By.linkText("Google")).click();
		test.log(LogStatus.PASS, "Mouse over and click success");
		report.endTest(test);
		report.flush();
		
		Thread.sleep(2000);
		driver.quit();


	}

}
