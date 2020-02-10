package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium10_Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
			driver.findElement(By.name("user_login")).sendKeys("admin");
			driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"a");
			driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"c");
			driver.findElement(By.name("user_password")).sendKeys(Keys.CONTROL,"v");
			Thread.sleep(3000);
			driver.quit();
	}

}
