package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ABHIJITH C S\\selenium\\selenium examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Nature Images");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(6000);
		driver.quit();
	}

}
