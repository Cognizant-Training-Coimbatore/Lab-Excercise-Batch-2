import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program8_controlling_keyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/table1.html");
driver.findElement(By.id("t1")).sendKeys("java");
driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"a");
driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"c");	
driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"v");
	Thread.sleep(5000);
	driver.quit();
	}

}
