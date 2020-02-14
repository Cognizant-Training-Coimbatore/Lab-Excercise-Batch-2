package feb13;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Selenium webdriver tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to google')",5000);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		js.executeScript("window.location='https://facebook.com'");
		driver.quit();

	}

}
