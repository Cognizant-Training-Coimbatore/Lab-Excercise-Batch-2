import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgmex01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("Email")).sendKeys("abhi12345789@gmail.com");
		driver.findElement(By.id("FirstName")).sendKeys("Abhijith");
		driver.findElement(By.id("LastName")).sendKeys("C S");
		driver.findElement(By.id("Password")).sendKeys("Pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Pass123$");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
