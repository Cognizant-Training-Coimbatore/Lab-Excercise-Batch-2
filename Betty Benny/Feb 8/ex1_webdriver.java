package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_webdriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\JAVA PROGRAMS\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Betty");
		driver.findElement(By.name("LastName")).sendKeys("Benny");
		driver.findElement(By.name("Email")).sendKeys("bettybenny97@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(5000);
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
