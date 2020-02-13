package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb11_ques2 {

	public static void main(String[] args) throws InterruptedException {
		
		ExtentReports rep = new ExtentReports("Report_FB.html");
	    ExtentTest test = rep.startTest("feb11_ques2");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html.html");
		Select product = new Select(driver.findElement(By.id("country")));
		int total = product.getOptions().size();
		System.out.println(total);
		WebElement sea  = driver.findElement(By.id("t1"));
				sea.sendKeys("11");
		if(sea.getAttribute("value").equals("11"))
		{
			test.log(LogStatus.PASS, "Ensured that both values are same");
			System.out.println("pass");
		}
		else
		{

			test.log(LogStatus.FAIL, "Not same");
			System.out.println("fail");
		}
		
		rep.endTest(test);
		rep.flush();
		Thread.sleep(5000);
		driver.quit();
	}

}
