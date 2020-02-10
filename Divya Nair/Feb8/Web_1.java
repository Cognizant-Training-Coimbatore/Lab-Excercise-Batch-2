import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		WebElement link=driver.findElement(By.linkText("Register"));
		link.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		List<WebElement> radio1= driver.findElements(By.name("Gender"));
		radio1.get(0).click();
		System.out.println(radio1.get(0).isSelected());
		
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("divya@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("FirstName")).sendKeys("Divya");
		Thread.sleep(3000);
		driver.findElement(By.name("LastName")).sendKeys("Nair");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("123$");
		Thread.sleep(3000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123$");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.id("register-button"));
		submit.click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
