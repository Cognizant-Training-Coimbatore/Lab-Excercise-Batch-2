package basic_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class testcase7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_testcase7.html");
		ExtentTest test=report.startTest("testcase7");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase7.html");
		Actions action=new Actions(driver);
		WebElement drag=driver.findElement(By.id("drag1"));
		WebElement drop=driver.findElement(By.id("div1"));
		Actions builder = new Actions(driver);
	    builder.dragAndDrop(drag, drop).build().perform();	
	    Thread.sleep(5000);
	    report.endTest(test);
		report.flush();
	    driver.quit();
	}

}
