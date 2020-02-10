package project_selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e1_d2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		
		WebElement reg=driver.findElement(By.linkText("Register"));
		reg.click();
		System.out.println(driver.getTitle());
		List<WebElement> m=driver.findElements(By.name("Gender"));
		m.get(0).click();
		driver.findElement(By.id("FirstName")).sendKeys("samplefirstname");
		driver.findElement(By.id("LastName")).sendKeys("samplelastname");
		driver.findElement(By.id("Email")).sendKeys("gmail.gmail.test@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("samplepass");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("samplepass");
		driver.findElement(By.id("register-button")).submit();
		Thread.sleep(7000);
		driver.quit();

	}

}
