import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium Webdriver Tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (0,600)");
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
