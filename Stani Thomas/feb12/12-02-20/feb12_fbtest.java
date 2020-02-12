package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class feb12_fbtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExtentReports report=new ExtentReports("report_fb.html");
ExtentTest test=report.startTest("feb12_fbtest");
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://facebook.com");
String s=driver.getTitle();
WebElement uid=driver.findElement(By.id("email"));
WebElement pass=driver.findElement(By.id("pass"));
uid.sendKeys("stanithomas789@gmail.com");
pass.sendKeys("hello123");
driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")).click();
if(uid!=null)
{
	if(pass!=null)
	{
		test.log(LogStatus.PASS,"The values are not empty");
	}
	else
	{
		test.log(LogStatus.FAIL, "The values are empty");
	}
}
else
{
	test.log(LogStatus.FAIL, "The values are empty");	
}
if(s.equals("fb"))
{
	test.log(LogStatus.PASS, "The title is samme");	
}
else
{
	test.log(LogStatus.FAIL, "The title is not same");
}
report.endTest(test);
report.flush();
driver.quit();
}

}
