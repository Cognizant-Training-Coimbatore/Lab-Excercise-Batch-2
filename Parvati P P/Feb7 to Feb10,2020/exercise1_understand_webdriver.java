import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1_understand_webdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		WebElement link1=driver.findElement(By.linkText("Register"));
		link1.click();
		List<WebElement> radio1=driver.findElements(By.name("Gender"));
		radio1.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("catchmeparvati@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Sample firstname");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Sample lastname");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
		
	

	}

}
