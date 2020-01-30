package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_enter_text_into_textbox 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password=driver.findElement(By.id("Password"));
		email.sendKeys("user1");// to enter a text to browser....user sendKey();
		password.sendKeys("user1");
		Thread.sleep(5000);// hold the screen for 5000ms or 5 sec to see o/p
		String s=driver.getTitle();//to get title...store
		System.out.println(s);
		driver.quit();

	}

}
