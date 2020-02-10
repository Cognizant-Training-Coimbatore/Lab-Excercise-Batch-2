import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program9_keyboard_copy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/amith/app.html");
		driver.findElement(By.id("text1")).sendKeys("amith");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("text2")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(4000);
		driver.quit();
	}

}
