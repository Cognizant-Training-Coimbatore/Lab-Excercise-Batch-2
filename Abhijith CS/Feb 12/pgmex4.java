import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgmex4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("rep_ex4.html");
		ExtentTest test=report.startTest("pgmex4");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ABHIJITH%20C%20S/exercise/testcase4.html.html");
		WebElement ch = driver.findElement(By.id("c1"));
		ch.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Romeo Juliet");
		alert.accept();
		//alert.getText();
		WebElement tf=  driver.findElement(By.xpath("//*[@id=\"t1\"]"));
		String  str =tf.getAttribute("value");
		System.out.println(str);
		if(str.contains("Romeo Juliet"))
		{
			System.out.println("correct");
		}
		if(str!=null)
		{
			test.log(LogStatus.PASS, "Not empty");
		}
		else
		{
			test.log(LogStatus.FAIL, "Empty");
		}
		report.endTest(test);
		report.flush();
		Thread.sleep(3000);
		driver.quit();
	}

}
