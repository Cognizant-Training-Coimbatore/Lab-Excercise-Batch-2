package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3_enter_text_into_textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");//to open the web page
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password=driver.findElement(By.id("Password"));
		email.sendKeys("user1");
		password.sendKeys("user1");
		Thread.sleep(5000);
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
