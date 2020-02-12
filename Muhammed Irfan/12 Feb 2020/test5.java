package extentreport;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports report=new ExtentReports("Report_test5.html");
		ExtentTest test = report.startTest("Fb_test");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Java%20Programming/Selenium_examples/testcase5.html.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> col = table1.findElements(By.tagName("td"));
		System.out.println(col.size());
		List<WebElement>op = driver.findElements(By.name("r1"));
	    op.get(1).click();
	    
	    
	    
	    report.endTest(test);
		
	    
	    report.flush();
		driver.quit();
	}

}