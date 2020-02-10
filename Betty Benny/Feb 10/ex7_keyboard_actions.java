package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_keyboard_actions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("Admin");
		driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.name("user_password")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
	}

}
