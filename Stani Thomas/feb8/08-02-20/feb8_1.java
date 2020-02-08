package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb8_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.findElement(By.linkText("Register")).click();
		String s2=driver.getTitle();
		System.out.println(s2);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("stani");
		driver.findElement(By.id("LastName")).sendKeys("thomas");
		driver.findElement(By.id("Email")).sendKeys("stani1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
		
	}

}
