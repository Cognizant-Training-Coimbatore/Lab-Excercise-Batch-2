package feb_13_pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_pgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium Webdriver Tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);
		js.executeScript("window.location='https://facebook.com");
		driver.quit();
	}

}
