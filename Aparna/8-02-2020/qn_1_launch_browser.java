package java_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn_1_launch_browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		
		WebElement link1=driver.findElement(By.linkText("Register"));
		link1.click();
		Thread.sleep(2000);
		List<WebElement> radio= driver.findElements(By.name("Gender"));
		radio.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("aparnaaugustin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Aparna");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Augustine");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
