package day3exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("WebDriver.chrome.driver", "chromedriver.exe") ;     
			WebDriver driver=new ChromeDriver();
			driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
			driver.findElement(By.name("user_login")).sendKeys("Admin");
			driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"a");
			driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"c");
			driver.findElement(By.name("user_password")).sendKeys(Keys.CONTROL,"v");
			
			driver.quit();
			
			
			
			
			
			
	}

}
