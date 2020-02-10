package basic_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java_programs\\selenium examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login=driver.findElement(By.id("email"));
		login.click();
		login.sendKeys("amith");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.click();
		pass.sendKeys("Amit14@");
		WebElement sign=driver.findElement(By.linkText("Log In"));
		sign.click();
		Thread.sleep(5000);
	}

}
