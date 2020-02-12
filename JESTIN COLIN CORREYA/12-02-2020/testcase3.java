import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_country_saame.html");
		ExtentTest test=report.startTest("testcase3");
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Admin/Downloads/testcase3.html");
Select country=new Select(driver.findElement(By.id("country1")));
country.selectByIndex(0);
String s=country.getFirstSelectedOption().getText();
Select country1=new Select(driver.findElement(By.id("country2")));
country1.selectByVisibleText(s);
Thread.sleep(4000);
do
{
	int r=(int)(Math.random()*11);

if(s.equals(country1.getFirstSelectedOption().getText()))
{
	test.log(LogStatus.FAIL,"source and destination cannot be same" );
	System.out.println("source and destimation cannot be same");
	country.selectByIndex(r);
}
else
		
	{
		test.log(LogStatus.PASS, "source and destination are different");
		}}while(country1.getFirstSelectedOption().getText()==s);

report.endTest(test);
report.flush();


Thread.sleep(4000);
driver.quit();


}
	}


