import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class program_feb12_checkequality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("Report_program_feb12_checkequality");
		ExtentTest test=report.startTest("program_feb12_checkequality");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
		WebElement text1=driver.findElement(By.id("t1"));
		text1.sendKeys("Hai i am arun");
		String s1=text1.getAttribute("value");
		Thread.sleep(5000);
		
		WebElement text2=driver.findElement(By.id("t2"));
		text2.sendKeys("Hai i am arun");
		String s2=text2.getAttribute("value");
		Thread.sleep(5000);
		
		WebElement btn=driver.findElement(By.id("b1"));
		btn.click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		
		if(s1.equals(s2))
		{
			test.log(LogStatus.PASS, "Both the texts are same");
		}
		else
			test.log(LogStatus.FAIL, "Both the texts are not same");
		
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
