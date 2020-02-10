package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb10exe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java programs\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("Admin");
		driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL ,"a");
		driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL ,"c");
		driver.findElement(By.name("user_password")).sendKeys(Keys.CONTROL ,"v");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
