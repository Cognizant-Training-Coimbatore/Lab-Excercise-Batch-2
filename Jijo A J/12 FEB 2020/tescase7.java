import java.awt.AWTException;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class tescase7 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report7.html");
		ExtentTest test=report.startTest("testcase7");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("E:\\JIJO A J\\ECLIPSE\\D4\\src\\testcase7.html");
		
		Actions action=new Actions(driver);
		 
		// find element which we need to drag
		WebElement drag=driver.findElement(By.id("drag1"));
		 
		// find element which we need to drop
		WebElement drop=driver.findElement(By.id("div1"));
		Actions builder = new Actions(driver);
	    //builder.clickAndHold(drag).moveToElement(drop).build();
	    builder.dragAndDrop(drag, drop).build().perform();	    
	    Thread.sleep(5000);
	    // this will drag element to destination
		//act.dragAndDrop(drag, drop);
		//act.build().perform();
	}

}
