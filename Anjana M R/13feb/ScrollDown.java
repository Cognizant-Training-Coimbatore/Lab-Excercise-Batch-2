package report;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium Webdriver Tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to google')", 5000);
		driver.switchTo().alert().accept();
		js.executeScript("window.scrollBy(0,600)");
	
		Thread.sleep(5000);
	
		js.executeScript("window.location='htpp://www.facebook.com'");
		Thread.sleep(2000);
		driver.quit();

	}

}
