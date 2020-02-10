import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1_understand_driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println("Page title :"+driver.getTitle());
		WebElement link1 =driver.findElement(By.linkText("Register"));
		link1.click();
		System.out.println("New title :"+driver.getTitle());
		WebElement radio1 = driver.findElement(By.id("gender-male"));
		WebElement radio2 = driver.findElement(By.id("gender-female"));
		radio1.click();
		driver.findElement(By.id("FirstName")).sendKeys("Jaseem");
		driver.findElement(By.id("LastName")).sendKeys("Vallanchira");;
		driver.findElement(By.id("Email")).sendKeys("jaswifi123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		WebElement register =driver.findElement(By.id("register-button"));
		register.click();
		Thread.sleep(5000);
		WebElement link = driver.findElement(By.linkText("Log out"));
		link.click();
		driver.quit();
		
		
		
		
	}

}
