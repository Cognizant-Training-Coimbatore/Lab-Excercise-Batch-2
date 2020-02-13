package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test8 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports reports=new ExtentReports("Report.testcase8.html");
		ExtentTest test=reports.startTest("test8");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase8.html");
		WebElement drop=driver.findElement(By.xpath("/html/body/div/button"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drop).build().perform();
		WebElement google=driver.findElement(By.linkText("Google"));
		google.click();
		String g=driver.getTitle();
		String s="Google";
		System.out.println(g);
		if(g.equals(s))
		{
			test.log(LogStatus.PASS, "SUCCESS");
		}
		else
			
			test.log(LogStatus.FAIL, "error in navigation");
		Thread.sleep(3000);
		reports.endTest(test);
		reports.flush();
		driver.quit();
		
	}

}
