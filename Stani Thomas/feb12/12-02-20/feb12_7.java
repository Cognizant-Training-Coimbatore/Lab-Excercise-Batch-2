package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class feb12_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase7.html");
		 Actions actions = new Actions(driver);
		  WebElement source=driver.findElement(By.id("drag1"));
           WebElement target = driver.findElement(By.id("div1")); 
          actions.dragAndDrop(source,target).build().perform(); 
          Thread.sleep(5000);
          driver.quit();
	}

}
