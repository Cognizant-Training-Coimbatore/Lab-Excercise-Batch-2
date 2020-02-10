package webdriverdemo;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program9_random_number {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		int i;
		for(i=0;i<5;i++)
		{
			String username;
			Random rand=new Random();
			int randomnumber= rand.nextInt();
			username="use"+randomnumber+"@gmail.com";
			System.out.println(username);
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("firstname1");
			driver.findElement(By.id("LastName")).sendKeys("lastname1");
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.name("Password")).sendKeys("123445$");
			driver.findElement(By.name("ConfirmPassword")).sendKeys("123445$");
			driver.findElement(By.name("register-button")).click();
			driver.findElement(By.linkText("Log out")).click();
		}
		driver.quit();

	}

}
