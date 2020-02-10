package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exs1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("Email")).sendKeys("jsguvdhdd@gmail.com");
		driver.findElement(By.id("FirstName")).sendKeys("Muhammed");
		driver.findElement(By.id("LastName")).sendKeys("Irfan");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
