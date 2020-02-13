import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report1.html");
		ExtentTest test=report.startTest("Testcase1");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\JIJO A J\\ECLIPSE\\D4\\src\\testcase1.html.htm");
		String str="haihelllo";
		driver.findElement(By.id("t1")).sendKeys(str);
		driver.findElement(By.id("b1")).click();
		Thread.sleep(4000);
		
		WebElement t2=driver.findElement(By.id("t2"));
		//System.out.println(t2.getAttribute("value"));
		int a=Integer.parseInt(t2.getAttribute("value"));
		if(a==str.length())		
			test.log(LogStatus.PASS, "length is verified");
		else
			test.log(LogStatus.FAIL, "length is not verified");
		Thread.sleep(4000);
		report.endTest(test);
		report.flush();
		
		driver.quit();
		

	}

}
