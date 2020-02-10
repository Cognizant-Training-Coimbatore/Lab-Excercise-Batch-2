import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11_alert_manage {

	public static void main(String[] args) throws InterruptedException 
	{

		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/amith/app.html");
		driver.findElement(By.id("b1")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
