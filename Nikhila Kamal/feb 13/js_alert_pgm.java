package feb_13_pgms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_alert_pgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('welcome to Google page');",5000);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
