import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class pgmex7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("rep_ex6.html");
		ExtentTest test=report.startTest("pgmex6");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase7.html");
		WebElement from = driver.findElement(By.id("div1"));
		WebElement to = driver.findElement(By.id("drag1"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from,to).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
