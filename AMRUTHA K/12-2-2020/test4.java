package labexecise1222020;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report= new ExtentReports("test3.html");
	     ExtentTest test=report.startTest("test3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html.htm");
		driver.findElement(By.id("c1")).click();
		 Alert alert=driver.switchTo().alert();
		 String x="Meluha";
		 alert.sendKeys(x);
		 alert.accept();
		 WebElement ab=driver.findElement(By.id("t1"));
		 if(ab.getAttribute("value").contentEquals(" Reading "+x)) {
			 
		 
			 System.out.println("sas");
		 }
		 else {
			 System.out.println("ada");
		 }
		
		
		
	}

}
