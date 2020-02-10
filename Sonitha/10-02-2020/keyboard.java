import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/table1.html");
		driver.findElement(By.id("t1")).sendKeys("java");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"a");//to select all the values
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		
		driver.quit();

	}

}
