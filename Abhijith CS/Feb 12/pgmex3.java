import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class pgmex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("rep_ex3.html");
		ExtentTest test=report.startTest("pgmex3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ABHIJITH%20C%20S/exercise/testcase3.html.html");
		Select op = new Select(driver.findElement(By.id("country1")));
		//op.selectByVisibleText("India");
		//Select op1 = new Select(driver.findElement(By.id("country1")));
		op.selectByVisibleText("China");
		Thread.sleep(2000);
		driver.quit();
	}

}
