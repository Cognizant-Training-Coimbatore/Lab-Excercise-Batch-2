package seleniumeg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_exercise_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement reg=driver.findElement(By.linkText("Register"));
		reg.click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		List<WebElement> radio1=driver.findElements(By.id("gender-female"));
	    radio1.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Shilpa");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Sreedhar");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("shilpasreedhar8547@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		Thread.sleep(2000);
		driver.findElement(By.name("register-button")).submit();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
