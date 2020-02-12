package reports;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class extendreports {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     ExtentReports report= new ExtentReports("Report_FB.html");
     ExtentTest test=report.startTest("extendreports");
    
     System.setProperty("WebDriver.chrome.driver", "chromedriver.exe") ;     
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
    WebElement ab= driver.findElement(By.id("email"));
    ab.sendKeys("");
    Thread.sleep(2000);
     WebElement bc=driver.findElement(By.id("pass"));
    		 bc.sendKeys("abcd");
     driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")).click();
		if(ab==null)
		{ if(bc==null) {
			test.log(LogStatus.FAIL, "the password value empty");
		               }
		else if(bc!=null)
			
			
		{	
			test.log(LogStatus.FAIL, "the user name empty");
		}}
		else {if(bc==null) {
			test.log(LogStatus.FAIL, "the password value is not empty");
		                  }
		else if(ab!=null)  {
			test.log(LogStatus.PASS, "values are not empty");
		}
		
		
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
