package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qtn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open the url "https://www.selenium.dev/"
		driver.get("http://demowebshop.tricentis.com/");
		WebElement link1=driver.findElement(By.linkText("Log in"));
		link1.click();
		driver.findElement(By.id("Email")).sendKeys("ardrapsurendran3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8281354450");
		driver.findElement(By.id("Log in")).click();

	}

}
