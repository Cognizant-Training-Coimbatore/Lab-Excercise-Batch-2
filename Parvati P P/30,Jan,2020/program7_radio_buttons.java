import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program7_radio_buttons {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com"); //launch browser
		WebElement register=driver.findElement(By.linkText("Register")); 
		register.click();
		List<WebElement>gender=driver.findElements(By.className("Gender"));
		gender.get(1).click();
		Thread.sleep(5000);
driver.quit();		
	}}
