package Extendreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class fb_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ExtentReports report = new ExtentReports("Report_FB.html");
 ExtentTest test = report.startTest("FB_TEST");
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java prgms\\JavaSeleniumnew\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement uid = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	uid.sendKeys("sonithakanakadas@gmail.com");
	
	driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	
	if((uid!=null)&&(pass!=null))
	{
		test.log(LogStatus.PASS, "the values are not null ");
		
	}else
		{
			test.log(LogStatus.FAIL, " null");
		}
     report.endTest(test);
     report.flush();
     driver.quit();
	}

}
