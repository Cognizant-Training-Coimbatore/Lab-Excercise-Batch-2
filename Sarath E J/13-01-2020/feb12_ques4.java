package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_ques4 {

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test = report.startTest("feb11_ques3");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html.html");
		
		 WebElement c1=driver.findElement(By.id("c1"));
		WebElement c2=driver.findElement(By.id("c2"));
		WebElement c3=driver.findElement(By.id("c3"));
		WebElement c4=driver.findElement(By.id("c4"));

		c1.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("book");
		alert.accept();

		c2.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys(" youtube");
		alert2.accept();

		c3.click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys(" Cricket");
		alert3.accept();

		c4.click();
		Alert alert4=driver.switchTo().alert();
		alert4.sendKeys(" Dance");
		alert4.accept();
		String txtarea=driver.findElement(By.id("t1")).getAttribute("value");
		System.out.println(txtarea);
		if(txtarea.contains("book")&&txtarea.contains("youtube")&&txtarea.contains("Cricket")&&txtarea.contains("Dance"))
		{
		System.out.println("Text is verified");
		test.log(LogStatus.PASS, "Text is verified");
		}
		else
		{
			
			test.log(LogStatus.PASS, "Text is not verified");

		}
		report.endTest(test);
		report.flush();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
