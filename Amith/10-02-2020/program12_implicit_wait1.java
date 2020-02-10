import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program12_implicit_wait1 {

	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log1 in")).click();
		driver.quit();

	}

}
