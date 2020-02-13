package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent7 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.testcase7.html");
		ExtentTest test=report.startTest("Extent7");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testcase7.html");
		
		WebElement text2=driver.findElement(By.xpath("/html/body/img"));
		WebElement text1=driver.findElement(By.xpath("/html/body/div"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(text2, text1).perform();
		Thread.sleep(2000);
		String textTo = text1.getText();
		 
		if(textTo.equals("Dropped!")) 
		{
			test.log(LogStatus.PASS," Source is dropped to target as expected");
		}
		else 
			test.log(LogStatus.FAIL," Source is not dropped to target as expected");
		 
		report.endTest(test);
		report.flush();
		driver.quit();

	}

}
