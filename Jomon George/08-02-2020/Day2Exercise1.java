package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");
		
		System.out.println("Title: " + driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("fName");
		driver.findElement(By.id("LastName")).sendKeys("lName");
		driver.findElement(By.id("Email")).sendKeys("name@mail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
