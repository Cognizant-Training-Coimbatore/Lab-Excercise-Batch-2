package basic_commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class q1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.getTitle();
		WebElement s= driver.findElement(By.linkText("Register"));
		s.click();
		driver.getTitle();
		List<WebElement> radio1=driver.findElements(By.name("Gender"));
		radio1.get(0).click();
		driver.findElement(By.id("FirstName")).sendKeys("Arhem");
		driver.findElement(By.id("LastName")).sendKeys("Ali");
		driver.findElement(By.id("Email")).sendKeys("arhem.ali10@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mehra#97");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Mehra#97");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log Out")).sendKeys("Arhem");
		Thread.sleep(5000);
		


	}

}
