package labexecise1222020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports report= new ExtentReports("test3.html");
	     ExtentTest test=report.startTest("test3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase.3.html.htm");
	Select a=new Select(driver.findElement(By.xpath("/html/body/select[1]")));
		a.selectByIndex(0);
		Select b=new Select(driver.findElement(By.xpath("/html/body/select[2]")));
		b.selectByIndex(9);
		String z=a.getFirstSelectedOption().getText();
System.out.println(z);
String y=b.getFirstSelectedOption().getText();

		if(z.equalsIgnoreCase(y)) {
			test.log(LogStatus.FAIL, "cannot enter same value");
		}
		else
		{
			test.log(LogStatus.PASS, "different value selected");
		}
		
		/*if(a.getFirstSelectedOption()==b.getFirstSelectedOption()) {
			test.log(LogStatus.FAIL, "cannot enter same value");
		}
		else
		{
			test.log(LogStatus.PASS, "different value selected");
		}*/
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
