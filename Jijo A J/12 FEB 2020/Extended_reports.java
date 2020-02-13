import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extended_reports {
public static void main(String[] args) throws InterruptedException 
{ 
	ExtentReports report =new ExtentReports("Report.html");
	ExtentTest test=report.startTest("Extended_reports");
	System.setProperty("webdriver.chromedriver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String s="https://www.facebook.com/";
	driver.get(s);
	String urlC=driver.getCurrentUrl();
	if(s.equals(urlC))
		test.log(LogStatus.SKIP, "URL same");
		else
				test.log(LogStatus.FAIL, "URL not same");
	
	WebElement uid=driver.findElement(By.id("email"));
	uid.sendKeys("jijojos4");
	WebElement password=driver.findElement(By.id("pass"));
	//password.sendKeys("9946619269");
	Thread.sleep(4000);
	
	WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input"));
	if(!uid.getAttribute("value").isEmpty())
			test.log(LogStatus.PASS, "username is not empty");
	else
			test.log(LogStatus.FAIL, "username is empty");
	if(!password.getAttribute("value").isEmpty())
		test.log(LogStatus.PASS, "password is not empty");
	else
		test.log(LogStatus.FAIL, "password is empty");

	btn.click();
	
	report.endTest(test);
	report.flush();
	driver.quit();
	
	
	
}
}
