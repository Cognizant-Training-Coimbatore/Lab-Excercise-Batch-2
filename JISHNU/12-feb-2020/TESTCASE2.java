package feb_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TESTCASE2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("testcase2.html");
		ExtentTest test= report.startTest("testcase2");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html.htm");
		Select country=new Select(driver.findElement(By.id("country")));
		int total=country.getOptions().size();
		driver.findElement(By.id("t1")).sendKeys(Integer.toString(total));
		Thread.sleep(3000);
		WebElement cont=driver.findElement(By.id("t1"));
		String a=cont.getAttribute("value");
		System.out.println(a);
		System.out.println(total);
		if(a.equals(Integer.toString(total)))
		{
			test.log(LogStatus.PASS, "correct entry");
		}
		else {
			test.log(LogStatus.FAIL, "Incorrect entry");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
