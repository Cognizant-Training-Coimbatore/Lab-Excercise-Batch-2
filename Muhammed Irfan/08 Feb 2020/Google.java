package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programming\\Selenium_examples\\chromedriver.exe");
		//Launch the Chrome Browser.
		WebDriver driver = new ChromeDriver(); 
		//Open the URL "http://www.selenium.dev/".
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Nature Images");
		driver.findElement(By.name("q")).submit();
		
	}

}
