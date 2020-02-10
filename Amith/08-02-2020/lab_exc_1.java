import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab_exc_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println("title :"+driver.getTitle());
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		System.out.println("register page title :"+driver.getTitle());
		List<WebElement>gender=driver.findElements(By.name("Gender"));
		gender.get(0).click();
		WebElement fname=driver.findElement(By.id("FirstName"));
		fname.sendKeys("amith");
		WebElement lname=driver.findElement(By.id("LastName"));
		lname.sendKeys("C");
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("amithpaallappatttaaa@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys("amith43@");
		WebElement cpass=driver.findElement(By.id("ConfirmPassword"));
		cpass.sendKeys("amith43@");
		WebElement reg=driver.findElement(By.id("register-button"));
		reg.click();
		WebElement logout=driver.findElement(By.linkText("Log out"));
		logout.click();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
