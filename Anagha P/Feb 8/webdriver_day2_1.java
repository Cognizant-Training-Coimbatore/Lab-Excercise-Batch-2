package basic_commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_day2_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s=driver.getTitle();
		System.out.println(s);
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		List<WebElement> gender=driver.findElements(By.name("Gender"));
		gender.get(0).click();
		WebElement first,last,email,password,confirm;
		first=driver.findElement(By.name("FirstName"));
		first.sendKeys("Arjun");
		last=driver.findElement(By.name("LastName"));
		last.sendKeys("P");
		email=driver.findElement(By.id("Email"));
		email.sendKeys("arjun123@gmail.com");
		password=driver.findElement(By.id("Password"));
		password.sendKeys("pass123$");
		//WebElement rememberme=driver.findElement(By.name("RememberMe"));
		//rememberme.click();
		confirm=driver.findElement(By.id("ConfirmPassword"));
		confirm.sendKeys("pass123$");
		WebElement register1=driver.findElement(By.id("register-button"));
		register1.click();
		Thread.sleep(1000);
		WebElement logout=driver.findElement(By.linkText("Log out"));
		logout.click();
		Thread.sleep(5000);
		driver.quit();


	}

}
