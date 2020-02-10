package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium8_Q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		List<WebElement> radio1 = driver.findElements(By.id("gender-male"));
		radio1.get(0).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sample fname");
		driver.findElement(By.id("LastName")).sendKeys("Sample lname");
		driver.findElement(By.id("Email")).sendKeys("Sample123456098@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("chelsea123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("chelsea123");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
