package webdriver_demo;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p_random
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		int i;
		for(i=0;i<5;i++)
		{
			String username;
			Random rand=new Random(1000);
			int randomnumber=rand.nextInt();
			username="user"+randomnumber+"@gmail.com";
			System.out.println(username);
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-male")).sendKeys("firstname1");
			driver.findElement(By.id("FirstName")).sendKeys("firstname1");
			driver.findElement(By.id("LastName")).sendKeys("lastname1");
			driver.findElement(By.id("Email")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys("12345$");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("12345$");
			driver.findElement(By.name("register-button")).click();
			driver.findElement(By.linkText("Log out")).click();
		}
		driver.quit();
	}
	
}