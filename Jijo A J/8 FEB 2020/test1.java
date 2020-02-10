package Webdriver_Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();;
		System.out.println("Titel\t:\t"+driver.getTitle());
		Thread.sleep(2000);
		
		List<WebElement> radio= driver.findElements(By.name("Gender"));
		radio.get(0).click();
		driver.findElement(By.id("FirstName")).sendKeys("Jijo");
		driver.findElement(By.id("LastName")).sendKeys("AJ");
		driver.findElement(By.id("Email")).sendKeys("jijoaj@mail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		
		
		
		Thread.sleep(2000);
	
		driver.findElement(By.linkText("Log out"));
		Thread.sleep(2000);
		driver.quit();
		

	}

}
