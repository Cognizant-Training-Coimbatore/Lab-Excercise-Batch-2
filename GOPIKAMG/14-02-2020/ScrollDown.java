package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		 	driver.get("https://google.co.in");
		 	driver.findElement(By.name("q")).sendKeys("Selenium Webdriver Tutorials ");
		 	driver.findElement(By.name("q")).submit();
		 	Thread.sleep(7000);
		 	JavascriptExecutor js=(JavascriptExecutor)driver;
		 	js.executeScript("window.scrollBy(0,600)");
		 	Thread.sleep(5000);
		 	js.executeScript("window.location='http://facebook.com'");
		 	driver.quit();
		 	
		 	
	}

}
