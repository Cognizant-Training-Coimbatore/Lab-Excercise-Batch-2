package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;




public class FB_test {

	private static final com.relevantcodes.extentreports.LogStatus LogStatus = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ExtentReports report=new ExtentReports("ExtentreportResult.html");
           ExtentTest test=report.startTest("FB_test");
           
	
	String setProperty = System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement uid=driver.findElement(By.id("uid"));
	WebElement pwd=driver.findElement(By.id("pass"));
    uid.sendKeys("ardra");
    pwd.sendKeys("ardra");
    driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")).click();
    if(uid!=null) {
    	if(pwd !=null) {
    	test.log(LogStatus.PASS, "The value is not empty");}
    	
        else {
    	test.log(LogStatus.PASS, "The pass is empty");
       }}
    	else {
    		test.log(LogStatus.FAIL, "The value empty");
    	}
    report.endTest(test);
    report.flush();
    driver.quit();
    
    }
}