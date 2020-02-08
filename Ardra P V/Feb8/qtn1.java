package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qtn1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open the url "https://www.selenium.dev/"
		driver.get("http://demowebshop.tricentis.com/");
		WebElement link1=driver.findElement(By.linkText("Register"));
		link1.click();
		driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Ardra");
		
		driver.findElement(By.id("LastName")).sendKeys("PV");
		driver.findElement(By.id("Email")).sendKeys("ardrapsurendran3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8281354450");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("8281354450");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(50000);
		driver.quit();
	}

}
