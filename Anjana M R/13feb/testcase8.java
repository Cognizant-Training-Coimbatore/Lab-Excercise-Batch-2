package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class testcase8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("test_7.html");
		ExtentTest test=report.startTest("TC7");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase8.html");
		WebElement drop=driver.findElement(By.xpath("/html/body/div/button"));
		Actions action=new Actions(driver);
		action.moveToElement(drop).build().perform();
		driver.findElement(By.linkText("Google")).click();
		//action.click().build().perform();
		Thread.sleep(5000); 
		driver.quit();
	}

}
